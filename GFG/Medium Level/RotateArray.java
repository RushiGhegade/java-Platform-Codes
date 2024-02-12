/*
Code 2: Rotate Array
Company: Amazon,Microsoft,MAQ Software
Platform: GFG, Leetcode -189.
Description:
Given an integer array nums, rotate the array to the right by k steps, where
k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
   */
class Demo{
	

	static void reverse(int i,int j,int arr[]){

		while(i<j){
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String args[]) {
		
		int nums[]=new int[]{-1,-100,3,99};

		int k=2;


		int m=k%nums.length;
			
		reverse(0,nums.length-1,nums);
		reverse(0,m-1,nums);
		reverse(k,nums.length-1,nums);

		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}System.out.println();
		// Using ExtraSpace
		/*
        	int arr[]=new int[m];

        	for(int i=0;i<arr.length;i++){
            		arr[i]=nums[nums.length-m+i];
			
        	}

       		 int n=nums.length-1;
       		 for(int i=m;i>=0;i--){
            		nums[n]=nums[i];
			 
			 n--;
        	}

       		for(int i=0;i<m;i++){
            		nums[i]=arr[i];
       		}

		for(int i=0;i<nums.length;i++){
        	    System.out.println(nums[i]);
       		}*/

		
		// TLE
        	/*for(int i=0;i<m;i++){
            		int num=nums[nums.length-1];
            		for(int j=nums.length-2;j>=0;j--){
               		nums[j+1]=nums[j];
            		}
          	 	nums[0]=num;
        	}*/	
		
	}	
}
