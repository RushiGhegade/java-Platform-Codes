/*
 *Transpose of Matrix
Company: MakeMyTrip, InfoEdge, Bloomberg
Platform: GFG
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is
obtained by changing rows to columns and columns to rows.
Example 1:
Input:
N = 4
mat[][] = {{1, 1, 1, 1},
{2, 2, 2, 2}
{3, 3, 3, 3}
{4, 4, 4, 4}}
Output:
{{1, 2, 3, 4},
{1, 2, 3, 4}
{1, 2, 3, 4}
{1, 2, 3, 4}}
Example 2:
Input:
N = 2
mat[][] = {{1, 2},
{-9, -2}}
Output:
{{1, -9},
{2, -2}}
Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(1)
 * */


class TransposeMatrix{


	static void trasposeMatrix(int arr[][]){

		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i;j<arr.length;j++){
				
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}

	}

	public static void main(String args[]){
		
		int arr[][]=new int[][]{{1, 1, 1, 1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};

		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr[i].length;j++){
				
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}System.out.println();


		trasposeMatrix(arr);

		for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr[i].length;j++){

                                System.out.print(arr[i][j]+" ");
                        }System.out.println();
                }System.out.println();
	}
}

























