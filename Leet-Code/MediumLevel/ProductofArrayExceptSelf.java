/*
1:Product of Array Except Self
Company: Amazon, Facebook, Microsoft, Goldman Sachs,Qualcomm
Platform: leetcode-238
Fraz’s SDE sheet.
Description:
Given an integer array nums, return an array answer such that answer[i] is
equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
integer.
You must write an algorithm that runs in O(n) time and without using the
division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/  

class ProductofArrayExceptSelf{
	
	static int[]  product(int arr[]) {
		
		int n=arr.length;

		int proarr[]=new int[n];

		int leftPro[]=new int[n];
		int rightPro[]=new int[n];

		leftPro[0]=1;
		rightPro[n-1]=1;

		for(int i=1;i<n;i++){
			leftPro[i]=leftPro[i-1] * arr[i-1];
		}

		for(int i=n-2;i>=0;i--){
			
			rightPro[i]=rightPro[i+1] * arr[i+1];
		}

		for(int i=0;i<n;i++){
			proarr[i]=leftPro[i]*rightPro[i];
		}

		return proarr;

	}

	public static void main(String args[]){

		int arr[]=new int[]{-1,1,0,-3,3};

		int arr1[]= product(arr);

		for(int i=0;i<arr1.length;i++){
			
			System.out.print(arr1[i]+" ");
		}System.out.println();
	}	
}
























