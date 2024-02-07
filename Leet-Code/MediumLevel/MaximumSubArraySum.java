/*
 *1:Maximum Subarray
Company:Google, Amazon,Swiggy,Flipkart,Facebook,Infosys
Platform: leetcode-53,Coding Ninjas
Fraz’s DSA Sheet
Description :
Given an integer array nums, find the
subarray
with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
 * */



class maxSum{
	// Small SubArray Sum using Kadane
	 static int smallsumArray(int arr[]) {

                int min=Integer.MAX_VALUE;

                int sum=0;
                int start=-1;
                int end=-1;
                int x=0;
                for(int i=0;i<arr.length;i++) {

                  

                        sum=sum+arr[i];

                        if(sum<min){
                                //start=x;
                                //end=i;
                                min=sum;

                        }

                        if(sum>min) {
                                sum=0;
                        }
                }
                System.out.println(start+" "+end);
                return min;

        }
	// Optimal 
	static int maxsumArray(int arr[]) {
		
		int max=Integer.MIN_VALUE;

		int sum=0;
		int start=-1;
		int end=-1;
		int x=0;
		for(int i=0;i<arr.length;i++) {
			
			if(sum==0){
				x=i;
			}

			sum=sum+arr[i];
			
			if(sum>max){
				start=x;
				end=i;
				max=sum;

			}

			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(start+" "+end);
		return max;

	}

	// brute Force Approch time O(N) 
	static int maxsum(int arr[]) {
		
		int max=Integer.MIN_VALUE;
		int start=-1;
		int end=-1;
		for(int i=0;i<arr.length;i++) {
			int sum=0;		
			for(int j=i;j<arr.length;j++) {
				
				sum=sum+arr[j];

				if(sum>max){
					start=i;
					end=j;
					max=sum;
				}
			}
		}
		System.out.println(start+" "+end);
		return max;

	}

	public static void main(String args[]) {
		
		int arr[]=new int[]{1,2,3};

		int count=maxsum(arr);  //bruteForce

		System.out.println(count);

		int count1=maxsumArray(arr); // Optimal

                System.out.println(count1);

		int count2=smallsumArray(arr); // Optimal

                System.out.println(count2);
	}
		
}


























