/*
Maximum Product Subarray

Company : Morgan Stanley, Amazon, Microsoft, OYO Rooms, D-E-Shaw, Google
Platform: leetcode - 152
Striver’s DSA sheet
Description:
Given an integer array nums, find a
subarray
that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
Constraints:
1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
   */
class MaxPro{	

	static int maxProduct(int arr[]){

		int max=Integer.MIN_VALUE;

		int pro=1;

		for(int i=0;i<arr.length;i++) {

			pro=pro*arr[i];

			if(pro>max){
				max=pro;
			}

			if(pro==0){
				pro=1;		
			}
		}
		pro=1;
		
		for(int i=arr.length-1;i>=0;i--){
			
			pro=pro*arr[i];

			if(pro>max){
				max=pro;
			}	

			if(pro==0){
				pro=1;
			}
		}

		return max;
	}

	static int maxPro(int arr[]) {	

		int max=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			int pro=1;
			for(int j=i;j<arr.length;j++){
				
				pro=pro*arr[j];

				if(pro>max){
					max=pro;
				}
				
			}
		}

		return max;
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{0,2};

		int  ans =maxPro(arr);
		System.out.println(ans);

		int ans1=maxProduct(arr);
		System.out.println(ans1);

	}
}
