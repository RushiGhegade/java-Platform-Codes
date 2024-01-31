/*
: Convert array into Zig-Zag fashion
Company : Paytm, Amazon, Adobe
Platform : GFG
Description :
Given an array arr of distinct elements of size N, the task is to rearrange the elements of
the array in a zig-zag fashion so that the converted array should be in the below form:
arr[0] < arr[1] > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n].
NOTE: If your transformation is correct, the output will be 1 else the output will be 0.
Example 1:
Input:
N = 7
Arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1
Example 2:
Input:
N = 4
Arr[] = {1, 4, 3, 2}
Output: 1 4 2 3
Explanation: 1 < 4 > 2 < 3
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 106
0 <= Arri <= 109
*/


class ZigZagArray{

	static void zigzagArray(int arr[]){
		
		int i=1;

		while(i<arr.length){

			if(i%2==1){
				if(arr[i-1] > arr[i]){
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}else{
				if(arr[i-1] < arr[i]){
					int temp=arr[i-1];
                                        arr[i-1]=arr[i];
                                        arr[i]=temp;
				}
			}
			i++;

		}
	}

	public static void main(String args[]){

		int arr[]=new int[]{4, 3, 7, 8, 6, 2, 1};

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();

		zigzagArray(arr);

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();
	}
}
























