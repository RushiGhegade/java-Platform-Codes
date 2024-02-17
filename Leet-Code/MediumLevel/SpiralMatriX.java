
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

