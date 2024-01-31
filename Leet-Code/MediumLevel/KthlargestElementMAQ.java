/*Kth Largest Element in an Array
Company: Amazon, Microsoft, Walmart, Adobe
Platform: Leetcode - 215
Striver’s and love Bubbar’s DSA sheet.
Description:
Given an integer array nums and an integer k, return the kth largest
element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct
element.
Can you solve it without sorting?

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

Constraints:
1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
*/


import java.util.*;
class KthLargest{
	
	// Using PriorityQueue
	static int Klargest(int arr[],int k){
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();  // bydefault MIN HEAP priorityQueue make in java

		for(int i=0;i<k;i++){
			pq.add(arr[i]);
		}

		for(int i=k ; i <arr.length ;i++){
			
			if(pq.peek() < arr[i]){
				
				pq.poll();

				pq.add(arr[i]);
			}
		}

		return pq.peek();

	}

	// Time Complexity( O(n*log(n))) 
	static int klargest(int arr[],int k) {
		
		Arrays.sort(arr);           //  O(n*logN) 

		return arr[arr.length-k];
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{3,2,3,1,2,4,5,5,6};
		int k=4;

		//int ans1=klargest(arr , k);         // It take O(n*logN) time for exceution space:O(1)
		//System.out.println(ans1);

		int ans2=Klargest(arr,k);            // it take O(n) time for exceution
		System.out.println(ans2);

	}
}


















