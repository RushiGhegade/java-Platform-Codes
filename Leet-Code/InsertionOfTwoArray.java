/*
 * Intersection of Two Arrays
Company: Accolite, Amazon, Microsoft, PayPal, Rockstand
Platform: Leetcode - 349
Striver’s SDE sheet
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any
order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/ 
import java.util.*;
class InsertionOfTwoArray{
	
	static int[] insertionTwoArray(int arr1[],int arr2[]){
		
		ArrayList al=new ArrayList();

		Set set=new HashSet();

		for(int i=0;i<arr2.length;i++){
			
			set.add(arr2[i]);
		}

		for(int i=0;i<arr1.length;i++){
			
			if(set.contains(arr1[i])){
				al.add(arr1[i]);
				set.remove(arr1[i]);
			}
		}

		int arr[]=new int[al.size()];
		System.out.println(al);
		
	
		int i=0;
		while(!al.isEmpty()){
			
			arr[i]=(int)al.remove(0);
			i++;
		}

		return arr;
	}

	public static void main(String args[]){
		
		int arr1[]=new int[]{4,9,5};

		int arr2[]=new int[]{9,4,9,8,4};

		int[] al=insertionTwoArray(arr1,arr2);

		for(int i=0;i<al.length;i++){
			System.out.print(al[i]);
		}System.out.println();
	}
}
