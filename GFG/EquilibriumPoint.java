/*
Equilibrium Point
Company : Amazon, Adobe
Platform : GFG
Description :
Given an array A of n non negative numbers. The task is to find the first
equilibrium point in an array. Equilibrium point in an array is an index (or position) such
that the sum of all elements before that index is the same as the sum of elements after
it.
Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists.
Example 1:
Input:
n = 5
A[] = {1,3,5,2,2}
Output: 3
Explanation: The equilibrium point is at position 3 as the sum of elements
before it (1+3) = sum of elements after it (2+2).
Example 2:
Input:
n = 1
A[] = {1}
Output: 1
Explanation: Since there's only an element hence its only the equilibrium point.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
*/

class EquilibriumPoint{

	static int equilibriumpoint(int arr[]){

		int index=-1;

		if(arr.length==1){
			return 1;
		}

		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i];
		}

		for(int i=0;i<arr.length;i++){
			int right=0;
			int left=0;

			if(i==0){
				right=arr[arr.length-1]-arr[i];
			}else{
				left=arr[i-1];
				right=arr[arr.length-1]-arr[i];
			}

			if(left==right){
				index=i+1;
			}
		}
		return index;
	}
	public static void main(String args[]){
		
		int arr[]=new int[]{1,3,5,2,2};

		int point=equilibriumpoint(arr);
		System.out.println(point);

	}
}























