/*
 * 3:Minimum distance between two numbers
Companies : Amazon, Paytm
Platform: GFG

You are given an array a, of n elements. Find the minimum index based distance
between two distinct elements of the array, x and y. Return -1, if either x or y
does not exist in the array.
Example 1:
Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1

Explanation: x = 1 and y = 2. There are
two distances between x and y, which are
1 and 3 out of which the least is 1.
Example 2:
Input:
N = 7
A[] = {86,39,90,67,84,66,62}
x = 42, y = 12
Output: -1
Explanation: x = 42 and y = 12. We return
-1 as x and y don't exist in the array.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/


class MinDistBTwoNum{
	

	static int minDist(int arr[],int x,int y){
		
		int xind=-1;
		int yind=-1;
		boolean flag=false;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){

			if(arr[i]==x){
			
				xind=i;
			}
			if(arr[i]==y){
		
				yind=i;
			}

			if(xind!=-1 && yind!=-1){
				
				if(xind>yind){
					 int dist=xind-yind;
					 if(dist<min){
						min=dist;
						flag=true;
					 }
				}else{
					int dist=yind-xind;
					if(dist<min){
						min=dist;
						flag=true;
					}
				}
			}

		}
	
		if(flag)
			return min;
		else
			return -1;

	}

	public static void main(String args[]){
		
		int arr[]=new int[]{1,4,3,2,2,2};

		int x=1;
		int y=2;

		int dist=minDist(arr,x,y);

		System.out.println(dist);
	}
}
