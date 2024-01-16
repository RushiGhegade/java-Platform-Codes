/*
Code 1: Two Sum

Company: Google, Meta, Amazon, Microsoft, Paypal+76 more companies
Platform : Leetcode - 1
Fraz’s & striver’s SDE sheet.
Description
Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use
the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/

import java.util.*;
class TwoSum{
	
	// brute Force
	static int[] twosum(int arr[],int target){
		int ans[]=new int[2];
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				int sum=arr[i]+arr[j];

				if(sum==target){
					ans[0]=i;
					ans[1]=j;
					flag=true;	
				}
			}
			if(flag==true)
				break;
		}

		return ans;
	}

	// Optimal 
	static int[] Twosum(int arr[],int target){

		int ans[]=new int[2];
		List<Integer> list=new ArrayList<>();

		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}	

		for(int i=0;i<arr.length;i++){
			
			int sum=target-arr[i];
			int el=list.remove(i);
			if(list.contains(sum)){
				ans[0]=i;

				int ind=list.indexOf(sum);
			
				ans[1]=ind+1;

				break;
			}
			list.add(i,el);	
					
		}

		return ans;
	}

	public static void main(String args[]){
		int arr[]=new int[]{2,7,11,15};

		int target=9;

		int ans[]=Twosum(arr,target);

		for(int x:ans)
			System.out.print(x+ " ");

		System.out.println();
	}
}
