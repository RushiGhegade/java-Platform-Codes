/*
 * Running Sum of 1d Array
Company: Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw,
Intuit, Opera
Platform:Leetcode-1480
Fraz’s SDE Sheet
Description:
Given an array nums. We define a running sum of an array as
runningSum[i] = sum(nums[0]...nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3,
1+2+3+4].
Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1,
1+1+1+1, 1+1+1+1+1].
Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
Constraints:
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
*/

// means -prefix Sum
class RunningSumArray{

	static int[] runningsumArray(int arr[]){

			
		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i];
		}

		return arr;
	}
		
	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3,4};
		
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();	

		int arr1[]=runningsumArray(arr);

		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}System.out.println();
	}
}




























