/*
 *Word Search
Company: Google, Adobe, Wipro, Ola, uber+23
Platform : Leetcode- 79
Fraz’s DSA sheet
Description :
Given an m x n grid of characters board and a string word, return true if word
exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where
adjacent cells are horizontally or vertically neighboring. The same letter cell may not be
used more than once.

Example 1:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
"ABCCED"
Output: true

Example 2:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
"SEE"
Output: true

Example 3:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
"ABCB"
Output: false
Constraints:
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 * */
class Demo{


     
	boolean find(char arr[][],int i,int j,int count,String word){
        int n=arr.length;
        int m=arr[0].length;

	if(count==word.length()){
		return true;
	}

        if(i<0 || i>=n || j<0 || j>=m) {
            return false;
        }
	 if(arr[i][j]!=word.charAt(count)){
           	return false;
        }        

  	char temp=arr[i][j];
	arr[i][j]='*';

	System.out.println();
        boolean found=find(arr, i+1,j,count+1,word) || find(arr, i-1,j,count+1,word) || find(arr, i,j+1,count+1,word) || find(arr, i,j-1,count+1,word);
	

	arr[i][j]=temp;

	
        return found;


    }
    public boolean exist(char[][] board, String word) {
        
       
        for(int i=0;i<board.length;i++) {
		
            for(int j=0;j<board[i].length;j++) {

               if(board[i][j]==word.charAt(0)){
                    if(find(board,i,j,0,word)){
			return true;
		    }
			
		    
               }

        }
	
	
	

    }
    return false;
    }

     public static void main(String args[]) {
		
		char arr[][]=new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		
		Demo obj=new Demo();
		String str="ABCCED";
		boolean ans=obj.exist(arr, str);
		System.out.println(ans);
     }
}
