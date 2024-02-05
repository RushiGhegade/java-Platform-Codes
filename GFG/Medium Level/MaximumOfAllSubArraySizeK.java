/*
 *Maximum of all subarrays of size k
Company: Flipkart, Amazon, Microsoft, Directi, Google
Platform: GFG
Love Bubbar’s DSA sheet.
Description:
Given an array arr[] of size N and an integer K. Find the maximum for each and every
contiguous subarray of size K.

Example 1:
Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output:
3 3 4 5 5 5 6
Explanation:
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6

Example 2:
Input:
N = 10, K = 4
arr[] = 8 5 10 7 9 4 15 12 90 13
Output:
10 10 10 15 15 90 90
Explanation:
1st contiguous subarray = {8 5 10 7}, Max = 10
2nd contiguous subarray = {5 10 7 9}, Max = 10
3rd contiguous subarray = {10 7 9 4}, Max = 10
4th contiguous subarray = {7 9 4 15}, Max = 15
5th contiguous subarray = {9 4 15 12},
Max = 15
6th contiguous subarray = {4 15 12 90},
Max = 90
7th contiguous subarray = {15 12 90 13},
Max = 90

Your Task:
You don't need to read input or print anything. Complete the function
max_of_subarrays() which takes the array, N and K as input parameters and returns a
list of integers denoting the maximum of every contiguous subarray of size K.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(k)
Constraints:
1 ≤ N ≤ 105
1 ≤ K ≤ N
0 ≤ arr[i] ≤ 107
 * */


import java.util.*;
class Demo{

	// OptimalApproch
	static ArrayList<Integer> Optimal(int arr[],int k) {
		
		ArrayList<Integer> al=new ArrayList<>();

		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

		for(int i=0;i<k;i++) {
			
			pq.add(arr[i]);
		}

		al.add(pq.peek());
		//System.out.println(pq);
		//System.out.println(pq.peek());
		// 8 ,5 ,10 ,7, 9, 4 ,15 ,12 ,90, 13
		for(int i=1 ;i<=arr.length-k;i++){

			int n=k+i-1;

			pq.remove(arr[i-1]);
			pq.add(arr[n]);
			
		       	//System.out.println(pq);
                	//System.out.println(pq.peek());
			
			al.add(pq.peek());
		}

		return al;

	}

	// BruteForce Approch
	static ArrayList<Integer> BruteForce(int arr[],int k) {
			
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<=arr.length-k;i++){
			int max=arr[i];
			for(int j=i;j<k+i;j++) {
				if(arr[j]>max) {
					max=arr[j];
				}
			}
			al.add(max);
		}

		return al;
	}

	public static void main(String args[]) {
		
		int arr[]=new int[]{8 ,5 ,10 ,7, 9, 4 ,15 ,12 ,90, 13};

		int k=4;
		
		//  O(N*k)
		ArrayList<Integer> al=BruteForce(arr,k);

		System.out.println(al);

		// Optimal Sol O(N)
		ArrayList<Integer> al1=Optimal(arr,k);
		System.out.println(al1);
	}
}
























