/*
Code 1: Majority Element
Company: Flipkart, Accolite, Amazon, Microsoft, D-E-Shaw, Google, Nagarro, Atlassian
Platform : Leetcode - 169, GFG
Fraz’s & striver’s SDE sheet.
Description

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than [n / 2⌋ times. You
may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/

import java.util.*;
class MajorityElement{
	// Optimal Approch
	static int Majorityelement(int arr[]){
		
		Map<Integer,Integer> mp=new HashMap<>();

		// Frequency
		for(int i=0;i<arr.length;i++){
			if(mp.containsKey(arr[i])){
				mp.put(arr[i],mp.get(arr[i])+1);
			}else{
				mp.put(arr[i],1);
			}
		}
		int element=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			if(mp.containsKey(arr[i])){
				if( mp.get(arr[i]) > max){
					max=mp.get(arr[i]);
					element=arr[i];
				}
			}
		}

		return element;
	}	
	// Brute Force
	static int majorityelement(int arr[]){
		
		int max=Integer.MIN_VALUE;
		int mejority=0;

		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>max){
				max=count;
				mejority=arr[i];
			}
		}

		return mejority;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{2,2,1,1,1,2,2};

		int ans=Majorityelement( arr);
		System.out.println(ans);
	}
}














