/*
 * Game of Life
Company: Amazon, Goldmansachs, Cuemath
Platform: Leetcode- 289, Coding Ninjas
Fraz’s DSA sheet
Description
According to Wikipedia's article: "The Game of Life, also known simply as
Life, is a cellular automaton devised by the British mathematician John
Horton Conway in 1970."
The board is made up of an m x n grid of cells, where each cell has an initial
state: live (represented by a 1) or dead (represented by a 0). Each cell
interacts with its eight neighbors (horizontal, vertical, diagonal) using the
following four rules (taken from the above Wikipedia article):
1. Any live cell with fewer than two live neighbors dies as if caused by
under-population.
2. Any live cell with two or three live neighbors lives on to the next
generation.
3. Any live cell with more than three live neighbors dies, as if by
overpopulation.
4. Any dead cell with exactly three live neighbors becomes a live cell, as if
by reproduction.
The next state is created by applying the above rules simultaneously to every
cell in the current state, where births and deaths occur simultaneously. Given
the current state of the m x n grid board, return the next state.

Example 1:
Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
Example 2:
Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]
Constraints:
m == board.length
n == board[i].length
1 <= m, n <= 25
board[i][j] is 0 or 1.
 * */



class Demo{
	
	static int Count1(int arr[][],int i,int j) {
		int count=0;
		if( i<arr[0].length && j+1<arr[0].length){
			
			if(arr[i][j+1]==1){
				count +=1;
			}
		}

		 if( i>=0 && j-1>=0 ){

                        if(arr[i][j-1]==1){
                                count +=1;
                        }
                }

		if( i-1>=0 && j>=0){

                        if(arr[i-1][j]==1){
                                count +=1;
                        }
                }

		if( i+1<arr.length && j>=0){

                        if(arr[i+1][j]==1){
                                count +=1;
                        }
                }

		if(i-1>=0 &&  j+1<arr[0].length){

			if(arr[i-1][j+1]==1){
                                count +=1;
                        }
		}

		if(i+1<arr.length &&  j+1<arr[0].length){

                        if(arr[i+1][j+1]==1){
                                count +=1;
                        }
                }

		if(i-1>=0 &&  j-1>=0){

                        if(arr[i-1][j-1]==1){
                                count +=1;
                        }
                }

		if(i+1<arr.length &&  j-1>=0){

                        if(arr[i+1][j-1]==1){
                                count +=1;
                        }
                }

		return count;		
		
	}
	public static void main(String args[]) {
		
		//int arr[][]=new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
		int arr[][]=new int[][]{{0,0}};
		int arr1[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}

		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length ;j++) {
				
				int live=Count1(arr,i,j);

				//System.out.println(live);
				
					
				if(arr[i][j]==1){		
					if(live<2){
						arr1[i][j]=0;
					}else if(live==2 || live==3){
						arr1[i][j]=1;
					}else{
						arr1[i][j]=0;
					}
				}else{
					if(live==3){
						arr1[i][j]=1;
					}else{
						 arr1[i][j]=0;
					}	
				}
				
				
			}
		}
		System.out.println();
		for(int i=0;i<arr1.length;i++){

                        for(int j=0;j<arr1[i].length;j++) {
                                System.out.print(arr1[i][j]+" ");
                        }System.out.println();
                }
	}
}


























