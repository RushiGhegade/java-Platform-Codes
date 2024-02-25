/*
 *Count the subarrays having product less than k

Company: Goldman Sachs, Facebook, Walmart, Yatra.com, Amazon, Linkedin,
Microsoft, Uber
Platform: GFG
love babbar DSA sheet
Description:
Given an array of positive numbers, the task is to find the number of
possible contiguous subarrays having product less than a given number k.
Example 1:
Input :
n = 4, k = 10
a[] = {1, 2, 3, 4}
Output : 7
Explanation: The contiguous subarrays are {1}, {2}, {3}, {4} {1, 2}, {1, 2, 3}
and {2, 3}, in all these subarrays product of elements is less than 10, count
of such subarray is 7. {2,3,4} will not be a valid subarray, because
2*3*4=24 which is greater than 10.
Example 2:
Input:
n = 7 , k = 100
a[] = {1, 9, 2, 8, 6, 4, 3}
Output: 16
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
Constraints:
1<=n<=106
1<=k<=1015
1<=a[i]<=105
 * */

class Demo{
	
	public static void main(String args[]) {
		
		int arr[]=new int[]{1,2,3,4};
		int k=10;

		int pro=1;
		int count=0;

			
		int start=0;
		int end=0;

		while(end<arr.length){
			
			pro=pro*arr[end];

			while( pro>= k && start<end){
				pro=pro/arr[start];
				start++;
			}

			if(pro<k){
				count=count+(end-start+1);
			}

			end++;

		}
		System.out.println(count);

	}
}



















