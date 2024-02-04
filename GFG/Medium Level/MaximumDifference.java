/*
 *
 *Maximum Difference

Company: Microsoft
Platform: GFG
Love Bubbar’s DSA sheet
Description
Given array A[] of integers, the task is to complete the function findMaxDiff which finds
the maximum absolute difference between nearest left and right smaller element of every
element in array.If the element is the leftmost element, nearest smaller element on left side is
considered as 0. Similarly if the element is the rightmost elements, smaller element on right side
is considered as 0.
Examples:
Input : arr[] = {2, 1, 8}
Output : 1
Left smaller LS[] {0, 0, 1}
Right smaller RS[] {1, 0, 0}
Maximum Diff of abs(LS[i] - RS[i]) = 1
Input : arr[] = {2, 4, 8, 7, 7, 9, 3}
Output : 4
Left smaller LS[] = {0, 2, 4, 4, 4, 7, 2}
Right smaller RS[] = {0, 3, 7, 3, 3, 3, 0}
Maximum Diff of abs(LS[i] - RS[i]) = 7 - 3 = 4
Input : arr[] = {5, 1, 9, 2, 5, 1, 7}
Output : 1
Input:
The first line of input contains an integer T denoting the no of test cases. Then T test
cases follow .Each test case contains an integer N denoting the size of the array A. In
the next line are N space separated values of the array A.
Output:
For each test case output will be in a new line denoting the the maximum absolute
difference between nearest left and right smaller element of every element in array.

Constraints:
1<=T<=100
1<=N<=100
1<=A[ ]<=100
Example(To be used only for expected output) :
Input:
2
3
2 1 8
7
2 4 8 7 7 9 3
Output
1
4
 * */




class MaxDiff{
	
	static int maxDiff(int arr[]) {
		int n=arr.length;
		int Ls[]=new int[n];
		int Rs[]=new int[n];

		for(int i=0;i<arr.length;i++){

			Ls[i]=arr[i];
			Rs[i]=arr[i];
		}

		for(int i=arr.length-1;i>=0;i--){
			int Nmin=arr[i];

			for(int j=i-1; j>=0 ; j--){
				if(Nmin > arr[j]){
					Nmin=arr[j];
					break;
				}
			}

			if(Nmin==arr[i]){
				Ls[i]=0;
			}else{
				Ls[i]=Nmin;
			}
		}

		for(int i=0;i<arr.length;i++){
			int Nmin=arr[i];

			for(int j=i+1;j<arr.length;j++){
				if(Nmin > arr[j]){
					Nmin=arr[j];
					break;
				}
			}

			if(Nmin==arr[i]){
                                Rs[i]=0;
                        }else{
                                Rs[i]=Nmin;
                        }
		}
		int max=0;
		for(int i=0;i<arr.length;i++){
			
			if(Ls[i]>Rs[i]){
	            		sum=Ls[i]-Rs[i];
	     		}else{
	            		sum=Rs[i]-Ls[i];
	        	}

			if(diff > max){
				max=diff;
			}
		}

		return max;

	}

	public static void main(String args[]){
		
		int arr[]=new int[]{88 ,57 ,44 ,92 ,28 ,66 ,60 ,37 ,33 ,52 ,38 ,29 ,76 ,8 ,75};

		int diff=maxDiff(arr);
		System.out.println(diff);
	}
}



















