/*
 *Middle of the Linked List
Company: Amazon, Walmart, Tekion-corp, Google, Bloomberg, Oracle, CRED, Meesho, Swigg,
Dream11, InMobi, Oyo, PayTM
Platform : leetcode- 876. GFG, Coding Ninja
Striver’s and Fraz’s DSA sheet.
Description:
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the
second one.
Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 * */





class Node {

	int data;
	Node next;

	Node(int data){
		this.data=data;
	}	
}

class LinkedList {

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

class Demo {
	
	static int findMid(LinkedList ll){

		Node slow=ll.head;
		Node fast=ll.head.next;

		while(fast!=null){
			
			fast=fast.next;

			if(fast!=null){
				fast=fast.next;
			}

			slow=slow.next;
		}

		return slow.data;	

	}

	public static void main(String args[]) {

		 LinkedList ll1=new  LinkedList();
		ll1.addlast(10);
		ll1.addlast(20);
		ll1.addlast(30);
		ll1.addlast(40);

		int ans=findMid(ll1);
		System.out.println(ans);
	}
}

















