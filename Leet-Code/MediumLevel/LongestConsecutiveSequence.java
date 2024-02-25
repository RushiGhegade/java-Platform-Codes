/*
 
Longest Consecutive Sequence
Company:Apple,google,goldman sachs,Walmart,Amazon,myntra
Platform : leetcode -128
Striver’s DSA Sheet
Description:
Given an unsorted array of integers nums, return the length of the longest consecutive
elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its
length is 4.
Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
   */

import java.util.*;
class Demo{

	static int LongestSeq(int arr[]) {
		
		Arrays.sort(arr);

		int count=0;
		int max=Integer.MIN_VALUE;
		boolean flag=false;
		for(int i=1;i<arr.length;i++){
			
			if(arr[i-1]==arr[i]){
				flag=true;
				continue;
			}

			if((arr[i-1]+1)==arr[i]) {
				count++;
				
				if(count > max){
					max=count;
				}
			}else{
				count=0;
			}
			
		}

		if(max==Integer.MIN_VALUE){
			
			if(flag==true){
				return 1;
			}else{
				return 0;
			}

		}else{
			return max+1;
		}
	}

	public static void main(String args[]) {
		
		int arr[]=new int[]{0,0,2,4,6,9,10};

		int ans=LongestSeq(arr);
		System.out.println(ans);
	}
}

























