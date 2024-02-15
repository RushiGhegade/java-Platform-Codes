/*
3Sum Closest
Company: Amazon, Facebook, Microsoft, LinkedIn, Airbnb, Oracle
Platform: leetcode-16
Fraz’s DSA sheet
Description:
Given an integer array nums of length n and an integer target, find three integers in
nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
Example 1:
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

Constraints:
3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
   */
import java.util.*;
class Demo{
	
	public static void main(String args[]) {
		
		int arr[]=new int[]{-1,2,1,-4};
		int min=Integer.MAX_VALUE;
		int target=2;
		int allSum=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			
			int s=i+1;
			int e=arr.length-1;

			while(s<e){
				int sum=arr[i]+arr[s]+arr[e];
				int diff=0;
				if(sum>target){
					diff=sum-target;
				}else{
					diff=target-sum;
				}
				
				if(diff<min){
					min=diff;
					allSum=sum;
				}
				if(sum<target){
					s++;
				}else{
					e--;
				}
			}
		}
		System.out.println(allSum);


		/*
		 // It take more time for execution
		for(int i=0;i<arr.length-2;i++){
			for(int j=i+1;j<arr.length-2;j++){
				for(int k=j+1;k<arr.length;k++){
					int sum=arr[i]+arr[j]+arr[k];
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+"= "+sum);
					int diff=0;
					if(target > sum){
						diff=target-sum;
					}else{
						diff=sum-target;
					}
						
							if(diff<min){	
								min=diff;
								allSum=sum;
						
						}

				}
			}
		}
		System.out.println(allSum);*/
	}
}	
