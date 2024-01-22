/*
Alternate positive and negative numbers
Company : Paytm, VMWare, Amazon, Microsoft, Intuit, Hotstar, PayU, FourKites, KPIT,
CodeNation
Love Bubbar’s SDE Sheet.
Platform : GFG, Coding Ninjas
Description :
Given an unsorted array Arr of N positive and negative numbers. Your task is to
create an array of alternate positive and negative numbers without changing the relative
order of positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a
positive element.
Example 1:
Input:
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation :
Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of
positive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed

elements.The output is 9,-2,4,-1,5,-5,0,-3,2.
Example 2:
Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0
Explanation :
Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of
positive elements and negative elements we will pick
each element from the positive and negative and will
store them. If any of the positive and negative numbers
are completed. we will continue with the remaining signed
elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
Your Task:
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
*/

class AltPostiveNeg{


	static void arrange(int arr[]){
			
		int arr1[]=new int[arr.length];

		int j=arr.length-1;

		int i=0;

		for(int k=0;k<arr.length;k++){

			if(arr[k]>=0){
				arr1[i]=arr[k];
				i++;
			}else{
				arr1[j]=arr[k];
				j--;
			}
		}

		int l=0;
		int m=arr1.length-1;
		int k=0;
		
		while(l<i && m>j){
			
			if(k%2==0){
				arr[k]=arr1[l];
				l++;
			}else{
				arr[k]=arr1[m];
				m--;
			}
			k++;
		}

		while(l<i ){
			arr[k]=arr1[l];
                        l++;
			k++;
		}

		while(m>j ){
                        arr[k]=arr1[m];
                        m--;
                        k++;
                }

		
	}

	public static void main(String args[]){
		
		int arr[]=new int[]{9,4 ,-2 ,-1 ,5 ,0 ,-5 ,-3 ,2};

		 for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		arrange(arr);


		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

}
