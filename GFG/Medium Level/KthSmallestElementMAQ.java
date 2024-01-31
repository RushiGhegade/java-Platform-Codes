/*
 *Kth smallest element
Company: VMWare, Accolite, Amazon, Microsoft, Snapdeal, Hike, Adobe,
Google, ABCO, Cisco
Platform: GFG
Bubbar’s DSA sheet.
Description:
Given an array arr[] and an integer K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array. It is given
that all array elements are distinct.
*Note :- l and r denotes the starting and ending index of the array.
Example 1:
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
L=0 R=5
Output : 7
Explanation :
3rd smallest element in the given
array is 7.

Example 2:
Input:
N = 5
arr[] = 7 10 4 20 15
K = 4 L=0 R=4
Output : 15
Explanation :
4th smallest element in the given
array is 15.

Your Task:

You don't have to read input or print anything. Your task is to complete the
function kthSmallest() which takes the array arr[], integers l and r denoting
the starting and ending index of the array and an integer K as input and
returns the Kth smallest element.

Expected Time Complexity: O(n*log(n) )
Expected Auxiliary Space: O(log(n))
 *
 * */

import java.util.*;
class KthSmallest{


	// Time Complexity --> O(N)
	static int KSmallest(int arr[],int k){
		

		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());  // Make MaxHeap to store max element top



		for(int i=0;i<k;i++){
			pq.add(arr[i]);	
		}

		for(int i=k;i<arr.length;i++){
			
			if(pq.peek() > arr[i]){
				
				pq.poll();

				pq.add(arr[i]);
			}
		}

		return pq.peek();

	}

	// Time Complexity --->O(N*log(N))
	static int Ksmallest(int arr[],int k){
		
		Arrays.sort(arr);

		return arr[k-1];
	}
	public static void main(String args[]){
		
		int arr[]=new int[]{7, 10, 4 ,3 ,20 ,15};

		int k=3;

		//int ans=Ksmallest(arr,k);
		//System.out.println(ans);
		

		int ans1=KSmallest(arr,k);
                System.out.println(ans1);
	}	
}


























