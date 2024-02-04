/*
Max Area of Island

Company: Amazon
Platform: Leetcode - 695
Fraz’s and Love Bubbar’s DSA sheet.
Description:
You are given an m x n binary matrix grid. An island is a group of 1's (representing land)
connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are
surrounded by water.
The area of an island is the number of cells with a value 1 in the island.
Return the maximum area of an island in grid. If there is no island, return 0.

Example 1:
Input: grid =
[[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,
1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,
0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
Output: 6
Explanation: The answer is not 11, because the island must be connected 4-directionally.
Example 2:
Input: grid = [[0,0,0,0,0,0,0,0]]
Output: 0

Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 50
grid[i][j] is either 0 or 1.
 * */

class Area{

        static int Island_count(int arr[][],int i,int j){

                int n=arr.length;
                int m=arr[0].length;

                if( i< 0 || i >=n || j<0 || j>=m ){
                        return 0;
                }

                if(arr[i][j]==0){
                        return 0;
                }

                int count=1;

                arr[i][j]=0;

                count= count + Island_count(arr,i+1,j);
                count= count + Island_count(arr,i-1,j);
                count= count + Island_count(arr,i,j-1);
                count= count + Island_count(arr,i,j+1);

                return count;
        }

        public static void main(String args[]) {

                int arr[][]=new int[][]{{0,0,1,1,0},{0,0,1,0,0},{0,1,0,0,1},{0,1,1,1,1}};
                int n=arr.length;
                int max=Integer.MIN_VALUE;

                for(int i=0;i<arr.length;i++){

                        for(int j=0;j<arr[i].length;j++){

                                if(arr[i][j]==1){

                                        int count= Island_count(arr,i,j);

                                        if(count > max){
                                                max=count;
                                        }
                                }
                        }
                }
                System.out.println(max);
        }
}
