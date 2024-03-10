/*
 *Remove duplicate element from sorted Linked List
Company: Amazon, Intuit
Platform: leetcode-83
love bubber DSA sheet.
Description:
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes
with duplicate values) from the given list (if exists).
Note: Try not to use extra space. The nodes are arranged in a sorted way.
Example 1:
Input:
LinkedList: 2->2->4->5
Output:
2 4 5
Explanation:
In the given linked list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time. So we need
to remove it once.

Example 2:
Input:
LinkedList: 2->2->2->2->2
Output: 2
Explanation:
In the given linked list 2 ->2 ->2 ->2 ->2, 2 is the only element and is repeated 5
times. So we need to removeany four 2.

Your Task:
The task is to complete the function removeDuplicates() which takes the head of input
linked list as input. The function should remove the duplicates from linked list and return
the head of the linkedlist.
Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)
Constraints:
1 <= Number of nodes <= 105
 * */




class Node{
	
	int data;
	Node next;

	Node(int data) {
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	
	Node head=null;

	void addlast(int data) {
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

	static void remove(Node head){
		
		if(head==null){
			return ;
		}

		Node start=head;
		Node end=head.next;

		while(end!=null){


			while(end!=null && start.data==end.data){
				end=end.next;
			}

			start.next=end;
			start=end;
			if(end!=null)
				end=end.next;

		}
		
	}
	
	public static void main(String args[]) {

		LinkedList ll=new LinkedList();
		ll.addlast(1);
		ll.addlast(1);
		ll.addlast(2);
		ll.addlast(3);
		ll.addlast(3);
		
		ll.printll();

		remove(ll.head);

		ll.printll();

	}
}



















