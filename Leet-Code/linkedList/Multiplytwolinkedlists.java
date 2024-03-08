/*
 *Multiply two linked lists
Company: Amazon
Platform : GFG, Leetcode - 445
Love Babber’s DSA sheet.
Description:

Given elements as nodes of the two linked lists. The task is to multiply these two
linked lists, say L1 and L2.

Note: The output could be large take modulo 109+7.
Example:
Input:
2
2
3 2
1
2
3
1 0 0
2
1 0
Output:
64
1000
Explanation:
Testcase 1: 32*2 = 64.
Testcase 2: 100*10 = 1000.
Input:
The first line of input contains an integer T denoting the number of test cases. Then T
test cases follow, the first line of each test case contains an integer N denoting the size
of the first linked list (L1). In the next line are the space-separated values of the first
linked list. The third line of each test case contains an integer M denoting the size of the
second linked list (L2). In the fourth line is space-separated values of the second linked
list.
Output:
For each test case output will be an integer denoting the product of the two linked lists.

Constraints:
1 <= T <= 100
1 <= N, M <= 100
 * */


class Node{
	
	int data;
	Node next;

	Node(int data){
		this.data=data;
		next=null;
	}
}

class LinkedList {
	
	Node head=null;

	void addlast(int data){

		Node newnode=new  Node(data);

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

	static long multiplicationTwoList(LinkedList ll1 , LinkedList ll2){
			
		int num1=0;
		int num2=0;

		Node temp1=ll1.head;
		Node temp2=ll2.head;

		while(temp1!=null){
			num1=(num1*10+(temp1.data))%1000000007;
			
			temp1=temp1.next;
		}

		while(temp2!=null){
                        num2=(num2*10+(temp2.data))%1000000007;
                        temp2=temp2.next;
                }

		return (num1*num2)%1000000007;
	}
	
	public static void main(String args[]) {
	
		LinkedList ll1=new LinkedList();
			
		ll1.addlast(1);
		ll1.addlast(2);
		//ll1.addlast(1);

		LinkedList ll2=new LinkedList();
		ll2.addlast(2);	
		//ll2.addlast(1);
		//ll2.addlast(1);

		long ans=multiplicationTwoList(ll1,ll2);
		System.out.println(ans);
	}
}











