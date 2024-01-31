/*
 *Smallest subarray with sum greater than x
Company: Accolite, Amazon, Goldman Sachs, Google, Facebook

Platform: GFG
Given an array of integers (A[]) and a number x, find the smallest subarray with
sum greater than the given value. If such a subarray do not exist return 0 in that
case.
Example 1:
Input:
A[] = {1, 4, 45, 6, 0, 19}
x = 51
Output: 3
Explanation:
Minimum length subarray is
{4, 45, 6}

Example 2:
Input:
A[] = {1, 10, 5, 2, 7}
x = 9
Output: 1
Explanation:
Minimum length subarray is {10}

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
 * */

class SmallestSubArray{

	static int smallestArraySum(int arr[],int x){
		
		int start=0;
		int end=0;
		int sum=0;
		int min=Integer.MAX_VALUE;

		for(int i=1;i<arr.length;i++){
			
			arr[i]=arr[i-1]+arr[i];
		}

		while(end<arr.length){
			
			if(start==0)
				sum=arr[end];
			else
				sum=arr[end]-arr[start-1];

			if(sum>x){
				int diff = end-start+1;

				if(diff<min){
					min=diff;
				}
				start++;
			}else{
				
				
				end++;
			}			
		}
		return min;
	}

	public static void main(String args[]){
			
		int arr[]=new int[]{1, 10, 5, 2, 7};
		int x=9;
		int ans=smallestArraySum(arr,x);

		System.out.println(ans);
	}
}
