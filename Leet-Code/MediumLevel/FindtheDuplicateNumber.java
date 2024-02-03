/*
 *Find the Duplicate Number
Company: Amazon, Microsoft
Platform: Leetcode - 287
Fraz’s and Love Bubbar’s DSA sheet.
Description:
Given an array of integers nums containing n + 1 integers where each integer is in the
range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant
extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Constraints:
1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears
two or more times.
 
*/


import java.util.*;
class DuplicateNumber{
	
	static int  duplicatedNumber(int arr[]){

			
			
		int val=0;
		int index=0;
		for(int i=0;i<arr.length;i++){
	
			if(arr[i]>=0){
				index=arr[i];
			}else{
				index=(-arr[i]);
			}

			arr[index]=-arr[index];

			if(arr[index]>=0){
				
				if(arr[i]>=0){
					
					val=arr[i];
				}else{
					val=-arr[i];
				}
			}
		}

		for(int i=0;i<arr.length;i++){
			
			if(arr[i]<0){
				arr[i]=(-arr[i]);
				
			}
		}

		return val;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,3,4,2,2};
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}System.out.println();

		int val = duplicatedNumber(arr);
		System.out.println(val);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+ " ");
                }System.out.println();
	}
}



























