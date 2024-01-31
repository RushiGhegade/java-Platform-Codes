/*
Even and Odd

Company: Paytm, Amazon, Microsoft
Platform: GFG
Description:
Given an array arr[] of size N containing equal number of odd and even numbers.
Arrange the numbers in such a way that all the even numbers get the even index and
odd numbers get the odd index.
Note: There are multiple possible solutions, Print any one of them. Also, 0-based
indexing is considered.

Example 1:
Input:
N = 6
arr[] = {3, 6, 12, 1, 5, 8}
Output:
1
Explanation:
6 3 12 1 8 5 is a possible solution.
The output will always be 1 if your
rearrangement is correct.

Example 2:
Input:
N = 4
arr[] = {1, 2, 3, 4}
Output :
1
Your Task:
You don't need to read input or print anything. Your task is to complete the function
reArrange() which takes an integer N and an array arr of size N as input and reArranges
the array in Place without any extra space.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/

import java.util.*;
class EvenOdd{
	//space Complexity --> O(1)
	static  void arrangeOddAndEven(int arr[]){
		
		int odd=1;
		int even=0;

		 while(odd<arr.length && even<arr.length){
			
			if(arr[odd]%2==1 && arr[even]%2==0){
				odd=odd+2;
				even=even+2;
			}else if(arr[odd]%2==0 && arr[even]%2==1){
				int temp=arr[odd];
				arr[odd]=arr[even];
				arr[even]=temp;
				even=even+2;
				odd=odd+2;
			}else if(arr[odd]%2==1 && arr[even]%2==1){
				odd=odd+2;
			}else{
				even=even+2;
			}
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	
    }
    //Space Complexity --> O(N)
    static void evenodd(int arr[]){
		
	int odd=1;
        int even=0;

        int ans[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans[even]=arr[i];
                even=even+2;
            }else{
                ans[odd]=arr[i];
                odd=odd+2;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }

	 for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

    }
    public static void main(String args[]){
	    System.out.println(-4%2);
	    int arr[]=new int[]{3, 6, 12, 1, 5, 8};

	    //arrangeOddAndEven(arr);

	    evenodd(arr);
    }
}
