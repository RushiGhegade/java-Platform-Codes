/*
1: Max Consecutive Ones

Company: Google, Facebook, Amazon, Microsoft, Apple, Uber, Airbnb, Adobe, Goldman Sachs,
Bloomberg
Platform: Leetcode - 485, Coding Ninja
Striver’s SDE Sheet
Description:
Given a binary array nums, return the maximum number of consecutive 1's in the array.
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The
maximum number of consecutive 1s is 3.
Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/
import java.util.*;
class ConsecutiveOnes{
	static int consecutiveOnes(int arr[]){

		Map<Integer,Integer> mp=new HashMap<>();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==1){
				if(i==0)
					mp.put(arr[i],1);
				else
					mp.put(arr[i],mp.get(arr[i])+1);

				if(mp.get(arr[i]) > max){
					max=mp.get(arr[i]);
				
				}
			}else{
				if(arr[i]==0){
					mp.put(1,0);
				}

			}
		}
		return max;
	}
	public static void main(String args[]){

		int arr[]=new int[]{1,1,0,1,1,1};
		
		int ans=consecutiveOnes(arr);
		System.out.println(ans);
	}
}


















