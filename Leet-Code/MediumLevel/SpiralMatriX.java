/*
1:Spiral Matrix
Company : Apple, Amazon, Microsoft, JP morgan,Walmart, Adobe,
Oracle,Paytm,salesforce, Wipro, SDE tech.
Platform:leetcode-54
Fraz’s and Striver’s DSA sheet
Description:
Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
*/
import java.io.*;
import java.util.*;
class SpiralMatrix
{
    public static void main(String args[])throws IOException
    {
        	
	    
	    int matrix[][]=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    int r=matrix.length;
	    int c=matrix[0].length;

            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }

// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int arr[][], int r, int c)
    {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        
        int rowstart=0;
        int rowend=arr.length-1;
        int colstart=0;
        int colend=arr[0].length-1;
        
        while(rowstart<=rowend && colstart<=colend){
            //top
            for(int i=colstart;i<=colend;i++){
                al.add(arr[rowstart][i]);
            }
            rowstart++;
            
            //right
            for(int i=rowstart ;i<=rowend;i++){
                al.add(arr[i][colend]);
            }
            colend--;
            
            //bottom
            if(rowstart<=rowend){
            for(int i=colend;i>=colstart;i--){
                al.add(arr[rowend][i]);
            }
            }
            rowend--;
            //left
            if(colstart<=colend){
            for(int i=rowend;i>=rowstart;i--){
                al.add(arr[i][colstart]);
            }
            }
            colstart++;
        }
        return al;
        
    }
}

