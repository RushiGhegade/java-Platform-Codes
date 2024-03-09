/*
 *Reverse Linked List
Company:
Netflix,Bloomberg,Walmart,Samsung,Amazon,Adobe,Oracle,Microsoft,Tekion-corp,CRED,Mees
ho,Swiggy,Dream11,InMobi,Oyo,PayTM,Byju's
Platform: GFG,leetcode -206.
Striver DSA sheet.
Description:
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:
Input: head = [1,2]
Output: [2,1]
Example 3:
Input: head = []
Output: []

Constraints:
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 * */




class Node {
	
	int data;
	Node next;

	Node(int data) {
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

	void printll(){
		
		Node temp=head;

		while(temp.next!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}

class Demo{
	
	public static void main(String args[]) {
		
		LinkedList ll=new LinkedList();

		ll.addlast(1);
		ll.addlast(2);
		ll.addlast(3);
		ll.addlast(4);

		ll.printll();

		// reverse the linkedlist

		Node pre=null;
		Node curr=ll.head;
		Node future=null;

		while(curr!=null){

			future=curr.next;
			curr.next=pre;
			pre=curr;
			curr=future;
		}
		ll.head=pre;
		System.out.println();
		ll.printll();

		System.out.println();
	}		
}





















