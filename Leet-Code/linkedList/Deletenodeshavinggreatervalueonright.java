/*
 *Delete nodes having greater value on right
Company:Amazon, Tech mahindra
Platform :GFG, Coding ninjas

Description:
Given a singly linked list, remove all the nodes in the list which have any node on their
right whose value is greater. (Not just immediate Right , but entire List on the Right)
Example 1:
Input:
LinkedList = 12->15->10->11->5->6->2->3
Output: 15 11 6 3
Explanation: Since, 12, 10, 5 and 2 are
the elements which have greater elements
on the following nodes. So, after deleting
them, the linked list would like be 15,
11, 6, 3.
Example 2:
Input:
LinkedList = 10->20->30->40->50->60
Output: 60
Explanation: All the nodes except the last
node has a greater value node on its right,
so all the nodes except the last node must
be removed.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ size of linked list ≤ 105
1 ≤ element of linked list ≤ 105
 * */

class Node {
	
	int data;
	Node next;

	Node(int data) {
		this.data=data;
		this.next=null;
	}
}

class LinkedList {

	Node head=null;

	void addlast(int data){
		Node newnode=new Node(data);

		if(head==null) {
			head=newnode;
		}else{
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}

	void printll(){
		
		Node temp=head;

		while(temp!=null){
			System.out.print(temp.data+ " " );
			temp=temp.next;
		}
	}
}



class Demo {

	static Node reverselist(LinkedList ll) {
		Node pre=null;
		Node curr=ll.head;
		Node future=null;

		while(curr!=null) {
			future=curr.next;
			curr.next=pre;
			pre=curr;
			curr=future;
		}
		ll.head=pre;

		return pre;
	}

	

	public static void main(String args[]) {


		LinkedList ll=new LinkedList();
		ll.addlast(12);      //12->15->10->11->5->6->2->3
		ll.addlast(15);
		ll.addlast(10);
		ll.addlast(11);
		ll.addlast(5);
		ll.addlast(6);
		ll.addlast(2);
		ll.addlast(3);
		
		Node head=reverselist(ll);
		
		Node start=head;
		Node end=head.next;

		while(end!=null) {
			while(end!=null && start.data > end.data) {
				end=end.next;
			}
			start.next=end;
			start=end;
			if(end!=null)
				end=end.next;
		}

		head=reverselist(ll);

		ll.printll();

		System.out.println();	
	}

}
















