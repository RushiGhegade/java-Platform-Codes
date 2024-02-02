/*

	Code2:Number of Zero-Filled Subarrays
Company: Amazon, Microsoft, OYO Rooms
Platform : GFG,Leetcode-2348
love bubbar’s SDE sheet.
Description:
Given an integer array nums, return the number of subarrays filled with 0.
A subarray is a contiguous non-empty sequence of elements within an
array.
Example 1:
Input: nums = [1,3,0,0,2,0,0,4]
Output: 6
Explanation:
There are 4 occurrences of [0] as a subarray.
There are 2 occurrences of [0,0] as a subarray.
There is no occurrence of a subarray with a size more than 2 filled with 0.
Therefore, we return 6.
Example 2:
Input: nums = [0,0,0,2,0,0]
Output: 9
Explanation:
There are 5 occurrences of [0] as a subarray.
There are 3 occurrences of [0,0] as a subarray.
There is 1 occurrence of [0,0,0] as a subarray.
There is no occurrence of a subarray with a size more than 3 filled with 0.
Therefore, we return 9.
Example 3:
Input: nums = [2,10,2019]
Output: 0
Explanation: There is no subarray filled with 0. Therefore, we return 0.


*/


import java.util.*;
class  NumberofZeroFilledSubarrays{
	
	// optimize approch 
         // time complexity -> O(N)
         // space complexity -> O(N)
	 
	static long optimize(int arr[]){
		
		long count=0;

		HashMap<Integer,Integer> hm=new HashMap<>();           // Space O(N)
		
		for(int i=0;i<arr.length;i++){                        // O(N)
			
			if(arr[i]==0){
				if(i==0){
					hm.put(0,1);
				}else{
					hm.put(0,hm.get(0)+1);
				}

				count=count+hm.get(0);
			}else{
				hm.put(0,0);
			}
		}	
		
		return count;
	}

	 // Brute Force Approch Using Two For Loop it give --> TLE
	 // time complexity -> O(n*n)
	 // space complexity -> O(1)
	static long bruteForce(int arr[]) {

		long count=0;

		for(int i=0;i<arr.length;i++){            // O(N)
			int sum=0;
			for(int j=i;j<arr.length;j++){     // O(N)
				
				sum=sum+arr[j];

				if(sum==0){
					count++;
				}else{	
					break;
				}	
			}
		}

		return count;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{0,0,0,2,0,0};
		
		// Brute Force Approch Using Two For Loop it give TLE
		long ans1=bruteForce(arr);                  // O(N*N)
		System.out.println(ans1);

		// Optimize 
		long ans2=optimize(arr);
		System.out.println(ans2);
	}
}

















