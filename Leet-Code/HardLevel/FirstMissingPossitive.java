/*
 *Hard Level: Day 48
Code :First Missing Positive
Company: Google,Amazon, Microsoft, Samsung, OYO, Barclays, VMware, D. E.Shaw,Oracle,
blackrock,,Qualcomm, Policy Bazaar.
Platform: leetcode- 41
Fraz’s DSA sheet.
Description:
Given an unsorted integer array nums, return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
Example 1:
Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:
Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:
Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.

Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 -
 * */





import java.util.*;
class Demo{

	// Brute Force 
	static int findMissing(int arr[]) {

		Arrays.sort(arr);

		boolean flag=false;

		for(int i=0;i<arr.length-1;i++){
			
			
			if(arr[i]==arr[i+1]){
				continue;
			}


			if(arr[i]==1){
				flag=true;
			}

			if(flag==true){
				
				if(arr[i]+1!=arr[i+1]){
					return arr[i]+1;
				}

			}
		}

		if(flag==true){
			return arr[arr.length-1]+1;
		}else{
			if(arr[arr.length-1]==1){
				return 2;
			}else{
				return 1;
			}
		}
	}


	// Optimize Approch	
	static int findPossitive(int arr[]) {
		
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==1){
				flag=true;
			}

			if(arr[i]<= 0 || arr[i]>arr.length){
				arr[i]=1;
			}
		}
		if(flag==false){
			return 1;
		}
		// find the index ans amrk -ve 
		for(int i=0;i<arr.length;i++){
			
			int index= Math.abs(arr[i])-1;

			arr[index]=-(Math.abs(arr[index]));
		}
		for(int i=0; i<arr.length;i++){
			if(arr[i]>0){
			
				return i+1;
			}

		}

		return arr.length+1;

	}

	public static void main(String args[]) {

		int arr[]=new int[]{1,1,2,2};

		//int ans=findPossitive(arr);
		//System.out.println(ans);

		int ans=findMissing(arr);
		System.out.println(ans);
	}
}





























