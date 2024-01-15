/*
Description:
Given an array arr[] of size n, find the first repeating element. The element
should occur more than once and the index of its first occurrence should be the
smallest.
Note:- The position you return should be according to 1-based indexing.
Example 1:
Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation:
5 is appearing twice and
its first appearance is at index 2
which is less than 3 whose first
occurring index is 3.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
*/

import java.util.*;
class FirstRepeated{
	// brute force Approch	
	static int  firstrepeated(int arr[]){

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					return i+1;
			}
		}
		return -1;
	}
	// Optimal Approch
	static int Firstrepeated(int arr[]){

		Set<Integer> set=new HashSet<Integer>();

		int repeat=0;
		for(int i=arr.length-1;i>=0;i--){
			if(set.contains(arr[i])){
				repeat=i+1;
			}else{
				set.add(arr[i]);
			}
		}
		if(repeat!=0)
			return repeat;
		else
			return-1;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,5,3,4,3,5,6};

		int ans=firstrepeated(arr);
		System.out.println(ans);

		int ans1=Firstrepeated( arr);
		System.out.println(ans1);
	}
}
