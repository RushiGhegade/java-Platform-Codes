/*
 * Product array puzzle
Company: Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, D-E-Shaw, Intuit,
Opera
Platform: GFG
Description:
Given an array nums[] of size n, construct a Product Array P (of same size n)
such that P[i] is equal to the product of all the elements of nums except nums[i].

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation:
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.

Example 2:
Input:
n = 2
nums[] = {12,0}
Output:
0 12
Your Task:
You do not have to read input. Your task is to complete the function
productExceptSelf() that takes array nums[] and n as input parameters and
returns a list of n integers denoting the product array P. If the array has only one
element the returned list should should contains one value i.e {1}
Note: Try to solve this problem without using the division operation.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 1000
0 <= nums <= 200
Array may contain duplicates.

*/





class Demo{


	// Without Using Division
	static int[] Solution(int arr[]){
			
		int left[]=new int[arr.length];
		int right[]=new int[arr.length];

		left[0]=1;
		right[arr.length-1]=1;
		
		for(int i=0;i<arr.length-1;i++){
			
			left[i+1]=left[i]*arr[i];
		}	

		for(int i=arr.length-1;i>=1;i--){
			
			right[i-1]=right[i]*arr[i];
		}

		for(int i=0;i<arr.length;i++){
			
			arr[i]=left[i]*right[i];
		}

		return arr;

	}

	// Using Division
	static int[] solution(int arr[]){
		
		int arr1[]=new int[arr.length];

		if(arr.length==1){
			arr1[0]=1;
			return arr1;
		}

		

		int mul=1;
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				count++;
			}

			if(arr[i]!=0){
				mul=mul*arr[i];
			}
		}

		if(count<=1){
			
			if(count==1){
				
				for(int i=0;i<arr.length;i++){
					if(arr[i]!=0){
						arr1[i]=0;
					}else{
						arr1[i]=mul;
					}
				}
			}else{
				for(int i=0;i<arr.length;i++){
                           		
					arr1[i]=mul/arr[i];
                                }
			}


		}else{
			for(int i=0;i<arr.length;i++){
				arr1[i]=0;
			}
		}

		return arr1;

	}
	public static void main(String args[]){
		
		int arr[]=new int[]{0,1};
		
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		int A[]=Solution(arr);

		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}System.out.println();

	}
}

























