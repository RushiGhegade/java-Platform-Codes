/*
 
   Non-overlapping Intervals
Company: Google, Amazon, Adobe, Facebook
Platform: leetcode - 435
Description:
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum
number of intervals you need to remove to make the rest of the intervals
non-overlapping.
Example 1:
Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:
Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals
non-overlapping.
Example 3:
Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already
non-overlapping.
Constraints:
1 <= intervals.length <= 105
intervals[i].length == 2
-5 * 104 <= starti < endi <= 5 * 104
   */


import java.util.*;

class NonOverlappingIntervals{
		
	static int countIntervals(int arr[][]){
		
		int n=arr.length;
		int m= arr[0].length;

		int count=0;
		
		if(arr.length<=1){
			return count;
		}

		Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));

		int left=0;
		int right=1;

		while(right<n){
			// Non Overlapping Intervals
			if(arr[left][1] <= arr[right][0]){
				left=right;
				right++;

			}else if(arr[left][1] <= arr[right][1]){
				right++;
				count++;
			}else if(arr[left][1]>arr[right][1]){
				left=right;
				right++;
				count++;
			}

		}

		return count;
	}

	public static void main(String args[]) {
		
		int arr[][]=new int[][]{{1,2},{1,2},{1,2}};

		int count=countIntervals(arr);
		System.out.println(count);
	}

}

























