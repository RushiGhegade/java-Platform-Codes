/*
 Search in a matrix
Company: Paytm, Accolite, Amazon, Microsoft, Snapdeal, MakeMyTrip, Ola
Cabs, Oracle, Visa, Goldman Sachs, Directi, Adobe, SAP Labs, Groupon,
InMobi, One97, Polycom, TinyOwl
Platform: GFG, Leetcode - 74
Description:
Given a matrix mat[][] of size N x M, where every row and column is sorted
in increasing order, and a number X is given. The task is to find whether
element X is present in the matrix or not.
Example 1:
Input:
N = 3, M = 3
mat[][] = 3 30 38
44 52 54
57 60 69

X = 62
Output:
0
Explanation: 62 is not present in the matrix, so output is 0
Example 2:
Input:
N = 1, M = 6
mat[][] = 18 21 27 38 55 67
X = 55
Output:
1
Explanation:
55 is present in the
matrix at 5th cell.
Expected Time Complexity: O(N+M).

Expected Auxiliary Space: O(1).

Constraints:
1 <= N, M <= 1005
1 <= mat[][] <= 10000000
1<= X <= 10000000
   */



//gfg
class Demo{
	
	public static void main(String args[]){
		
		int arr[][]=new int[][]{{18 ,21 ,27 ,38 ,55, 67}};
		int X=0;
		int searchRow=0;
		int flag=0;
		// Find Which Row element belong
		for(int i=0;i<arr.length;i++){

			if(X>=arr[i][0]){
				if(X==arr[i][0]){
					flag=1;
					System.out.println(1);
				}
				searchRow=i;
			}
		}

		// Find element in searchRow
		for(int i=0;i<arr[0].length;i++){
			
			if(searchRow!=0){
				if(X==arr[searchRow-1][i]){
					flag=1;
					 System.out.println(1);
				}
			}

			if(X==arr[searchRow][i]){
				flag=1;
				 System.out.println(1);
			}
		}

		if(flag==0){
		 System.out.println(0);
		}
	}
}




