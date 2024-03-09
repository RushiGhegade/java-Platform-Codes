/*
 *Palindrome Linked List
Company:
Flipkart,Oracle,Facebook,Bloomberg,Amazon,Samsung,Walmart,CRED,Meesho,Swiggy,Dream
11,InMobi
Platform: leetcode-234
Striver DSA sheet.
Description:
Given the head of a singly linked list, return true if it is a
palindrome
or false otherwise.
Example 1:
Input: head = [1,2,2,1]
Output: true
Example 2:
Input: head = [1,2]
Output: false
Constraints:
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 * */



class Node {

	int data;
	Node next;

	Node(int data){
		this.data=data;
	}
}

class LinkedList{
	
	Node head=null;

	void addlast(int data){
		Node newnode=new Node(data);

		if(head==null){
			head=newnode;
		}else{
			Node temp=head;

			while(temp.next!=null){
				temp=temp.next;
			}

			temp.next=newnode;
		}
	}

	
}

class Demo{
	
	public static void main(String args[]) {
		
		// Create a LinkedList 
		LinkedList ll=new LinkedList();
		// add element in LinkedList
		ll.addlast(1);
		ll.addlast(2);
		ll.addlast(2);
		ll.addlast(1);

		// find Mid  in LinedList
		Node slow=ll.head;
		Node fast=ll.head.next;

		while(fast!=null){

			fast=fast.next;
			if(fast!=null){
				fast=fast.next;
			}
			slow=slow.next;
		}

		// now reverse the linkedlist from mid to end
			
		Node pre=null;
		Node curr=slow;
		Node future=null;

		while(curr!=null){
			
			future=curr.next;
			curr.next=pre;
			pre=curr;
			curr=future;	

		}

		// now first end last element are equal or not

		Node start=ll.head;
		Node end=pre;
		int flag=1;

		while(end!=null){

			if(start.data!=end.data){
				flag=0;
				System.out.println("fasle");
				break;
			}
			start=start.next;
			end=end.next;
			
		}

		if(flag!=0){
			System.out.println("true");
		}

	}
}





















