/*
 Jump Game
Company: Amazon, Microsoft, Google, Facebook
Platform : leetcode - 55
Fraz’s DSA Sheet
Description:
You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.
Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:
Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length
is 0, which makes it impossible to reach the last index.
Constraints:
1 <= nums.length <= 104
0 <= nums[i] <= 105
 * */

class JumpGame{
	
	public static void main(String args[]) {
		
		int arr[]=new int[]{3,2,1,0,4};

		int n=arr.length;
		int lastpos=arr.length-1;

		for(int i=arr.length-2;i>=0;i--){
			
			if(i+arr[i]>=lastpos){
				lastpos=i;
			}
		}

		if(lastpos==0)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
