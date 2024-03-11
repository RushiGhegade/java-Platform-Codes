/*
 *Merge Two Sorted Lists
Company:Teknion-corp,Oracle,Netflix,Facebook,Amazon,Bloomberg,Microsoft,Walmart,flipkart,
CRED,Meesho,Swiggy,Dream11,InMobi
Platform : leetcode - 21
Description:
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the
nodes of the first two lists.
Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:
Input: list1 = [], list2 = []
Output: []
Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
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

	//addlast
	void add(int data) {
		Node newnode=new Node(data);

		if(head==null){
			head=newnode;
		}else{
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}

	}
	

}

class Demo {

	static Node margeList(LinkedList ll1,LinkedList ll2) {
		
		Node head1=ll1.head;
		Node head2=ll2.head;
		Node newhead=null;

		while(head1!=null && head2!=null) {
			Node newnode=null;
			if(head1.data <= head2.data) {
				newnode =new Node(head1.data);
				head1=head1.next;
			}else{
				newnode =new Node(head2.data);
                                head2=head2.next;
			}

			if(newhead==null){
				newhead=newnode;
			}else{
				Node temp=newhead;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newnode;
			}

		}

		if(head1!=null){
			Node temp=newhead;
			while(temp!=null && temp.next!=null) {
				temp=temp.next;
			}
			if(temp!=null)
				temp.next=head1;
			else
				newhead=head1;
		}

		 if(head2!=null){
                        Node temp=newhead;
                        while(temp!=null && temp.next!=null) {
                                temp=temp.next;
                        }
			if(temp!=null)
                        	temp.next=head2;
			else
				newhead=head2;
                }

		return newhead;

	}

	static void printll(Node newnode){

		Node temp=newnode;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static void main(String args[]) {

		LinkedList ll1=new LinkedList();
		ll1.add(1);
		ll1.add(1);
		ll1.add(3);
		ll1.add(5);
		ll1.add(5);
		
		printll(ll1.head);

		System.out.println();

		LinkedList ll2=new LinkedList();
                ll2.add(2);
                ll2.add(2);
                ll2.add(4);
                ll2.add(6);
                ll2.add(7);
		
		printll(ll2.head);

		System.out.println();

		Node margelist=margeList(ll1,ll2);
		
				
		printll(margelist);

		 System.out.println();
	}
}





















