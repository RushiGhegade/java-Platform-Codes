/*
 *Median of Two Sorted Arrays
Company: Amazon,Google,Microsoft, Adobe, Paypal, Apple, Atlassian, IBM, JP Morgan,
Cognizant.
Platform: leetcode-4
Description:
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the
median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 * */



class Demo{

	static double FindMid(int arr1[],int arr2[]){
		
		if(arr2.length < arr1.length){
			return FindMid(arr2,arr1);
		}

		int low=0;
		int high=arr1.length;

		while(low<high){


			int m1=(low+high)/2;
			int m2=((arr1.length+(arr2.length+1))/2) - m1;

			int l1= (m1==0) ? Integer.MIN_VALUE : arr1[m1-1];
			int l2= (m2==0) ? Integer.MIN_VALUE : arr2[m2-1];

			int r1= (m1==arr1.length) ? Integer.MAX_VALUE : arr1[m1];
			int r2= (m2==arr2.length) ? Integer.MAX_VALUE : arr2[m2];

			if(l1<r2){
				// Find Mid
				
				if((arr1.length+arr2.length)%2==0){
				
					return (double)(Integer.max(l1,l2)+Integer.min(r1,r2))/2;

				}else{
					return (double)(Integer.max(l1,l2));
				}

			}else if(l2 > r1){
				low=m1+1;
			}else{
				high=m1-1;
			}
			

		}

		return 0.0;
	}
	
	public static void main(String args[]) {
		
		int arr1[]=new int[]{1,2};
		int arr2[]=new int[]{3,4};

		double result=FindMid(arr1,arr2);

		System.out.println(result);
	}
}
















