/*
Array Subset of another array
Company: Accolite, Qualcomm, GE
Platform: GFG
Description:
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check
whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted.
There can be duplicate elements.

Example 1:
Input:
a1[] = {11, 7, 1, 13, 21, 3, 7, 3}
a2[] = {11, 3, 7, 1, 7}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 2:
Input:
a1[] = {1, 2, 3, 4, 4, 5, 6}
a2[] = {1, 2, 4}
Output:
Yes
Explanation:
a2[] is a subset of a1[]

Example 3:
Input:
a1[] = {10, 5, 2, 23, 19}
a2[] = {19, 5, 3}

Output:
No
Explanation:
a2[] is not a subset of a1[]

Your Task:
You don't need to read input or print anything. Your task is to complete the
function isSubset() which takes the array a1[], a2[], its size n and m as inputs and
return "Yes" if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.

Expected Time Complexity: O(max(n,m))
Expected Auxiliary Space: O(n)
*/

import java.util.*;
class CheckSubArray{
	
	static String checksubArray(int arr1[],int arr2[]){

		HashMap<Integer,Integer> hm=new HashMap<>();

		for(int i=0;i<arr1.length;i++){
			
			if(hm.containsKey(arr1[i])){
				hm.put(arr1[i],hm.get(arr1[i])+1);
			}else{
				hm.put(arr1[i],1);
			}
		}

		for(int i=0;i<arr2.length;i++){
			
			if(!hm.containsKey(arr2[i])){
				return "No";				
			}else{
				if(hm.get(arr2[i])==0){
					return "No";	
				}else{
					hm.put(arr2[i],hm.get(arr2[i])-1);
				}
			}
		}

		return "Yes";

	}
	public static void main(String args[]){
		
		int arr1[]=new int[]{1 ,2 ,3 ,4 ,5 ,6 ,7, 8};

		int arr2[]=new int[]{1 ,2 ,3 ,1};

		String str=checksubArray(arr1,arr2);

		System.out.println(str);
	}
}



























