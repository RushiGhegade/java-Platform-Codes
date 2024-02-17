/*
 1:Subarray Sums Divisible by K
Company:Paytm, Amazon, Flipkart
Platform:leetcode-974
Fraz’s DSA sheet
Description:
Given an integer array nums and an integer k, return the number of
non-empty subarrays that have a sum divisible by k.
A subarray is a contiguous part of an array.
Example 1:
Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:
Input: nums = [5], k = 9
Output: 0
Constraints:
1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
2 <= k <= 104
   */


import java.util.*;
class Demo{
	
	public static void main(String args[]) {
		
		int arr[]=new int[]{4,5,0,-2,-3,1};
		int k=5;
		// store the  Sum (prefixsum)
		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i];
		}

		//take a remender and store the remender if remender is -ve then take +ve
		for(int i=0;i<arr.length;i++){
			
			int rem=arr[i]%k;

			if(rem<0){
				arr[i]=rem+k;
			}else{
				arr[i]=rem;
			}
		}
		// push the remender in map if it contain then take remender
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0,1);
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			if(map.containsKey(arr[i])){
				count=count+map.get(arr[i]);
				map.put(arr[i],map.get(arr[i])+1);	
			}else{
				map.put(arr[i],1);
			}
		}

		System.out.println(count);
	}
}	














