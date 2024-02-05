/*
 *Subarray Sum Equals K (Subarray with given sum-GFG)
Company: Amazon, Facebook, Google, Visa
Platform: Leetcode- 560, GFG, Coding Ninjas
Striver’s DSA sheet
Description
Given an array of integers nums and an integer k, return the total number of subarrays
whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
Example 2:
Input: nums = [1,2,3], k = 3
Output: 2

Constraints:
1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
 * */




class SubArraySum {
	
	// Optimize Approch time --> O(N)  space--> O(1)
	static int subarraySum(int arr[],int k) {
		
		int start=0;
		int end=0;
		int count=0;
		int sum=0;
		for(int i=1;i<arr.length;i++)  {
			
			arr[i]=arr[i-1]+arr[i];         // prefixSum
		}

		while(end<arr.length && start<arr.length) {
				
			if(start==0){
				sum=arr[end];
			}else{
				sum=arr[end]-arr[start-1];
			}
			
			if(sum==k){
				count++;
			}

			if(sum <= k) {
				end++;
			}else{
				start++;
			}
		}

		return count;
	}

	// bruteForce Approch  time complexity--> O(N*N)  space-->O(1)
	static int subArraySum(int arr[],int k){
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
    				sum=sum+arr[j];

				if(sum==k){
					count++;
				}
			}
		}

		return count;
		

	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1};

		int k=0;

		int count=subArraySum(arr,k);
		System.out.println(count);

		int ans=subarraySum(arr,k);
		System.out.println(ans);
	}
}























