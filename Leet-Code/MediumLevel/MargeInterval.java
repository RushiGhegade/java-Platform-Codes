/*

Merge Intervals
Company: Amazon,Google, Microsoft, Nutanix, Oracle
Platform: leetcode - 56
striver, love babbar & Fraz’s DSA sheet
Description:
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping
intervals, and return an array of the non-overlapping intervals that cover all the intervals
in the input.

Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

Constraints:
1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
   */
import java.util.*;
class MargeInterval {
	

	static int[][] overlapping(int arr[][]){
			
		int n=arr.length;
		int m=arr[0].length;
		// sort Array based on 1st conditon
		Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
		if(arr.length<=1){
			return arr;
		}

		int arr1[]=new int[n*m];

		arr1[0]=arr[0][0];
		arr1[1]=arr[0][1];
		int k=1;
		for(int i=1;i<arr.length;i++){
			
			if(arr1[k]<arr[i][0]){
				k++;
				arr1[k++]=arr[i][0];
				arr1[k]=arr[i][1];
			}else{
				
				if(arr1[k] < arr[i][1]){
					arr1[k]=arr[i][1];
				}
			}
		}

		if(k%2!=0){
			k=k+1;
		}

		int arr2[][]=new int[k/2][2];
		int l=0;
		for(int i=0;i<k/2;i++){
			for(int j=0;j<2;j++){
				arr2[i][j]=arr1[l++];
			}
		}

		return arr2;
	}

	public static void main(String args[]) {
		
		int arr[][]=new int[][]{{1,3},{2,6},{8,10},{15,18}};

		int arr1[][]=overlapping(arr);

		for(int i=0;i<arr1.length;i++){
			
			for(int j=0;j<arr1[i].length;j++){
				
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}
	}
}


















