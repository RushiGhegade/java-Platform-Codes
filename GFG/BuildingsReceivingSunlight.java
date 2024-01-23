/*
 3:Buildings receiving sunlight
Company: Amazon, Microsoft
Given are the heights of certain Buildings which lie adjacent to each other. Sunlight
starts falling from the left side of the buildings. If there is a building of a certain Height,
all the buildings to the right side of it having lesser heights cannot see the sun. The task
is to find the total number of such buildings that receive sunlight.

Example 1:
Input:
N = 6
H[] = {6, 2, 8, 4, 11, 13}
Output:
4
Explanation:
Only buildings of height 6, 8, 11 and
13 can see the sun, hence output is 4.

Example 2:

Input:
N = 5
H[] = {2, 5, 1, 8, 3}
Output:
3
Explanation:
Only buildings of height 2, 5 and 8
can see the sun, hence output is 3.

Example 3:
Input:
N = 7
H[] = {3, 4, 1, 0, 6, 2, 3}
Output:
3
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
*/




class ReceiveSunlight{
	
	static int receiveSunlight(int arr[]){
		
		int max=Integer.MIN_VALUE;

		int count=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>=max){
				max=arr[i];
				count++;
			}
		}

		return count;
	}

	public static void main(String args[]){

		int arr[]=new int[]{3, 4, 1, 0, 6, 2, 3};

		int count=receiveSunlight(arr);

		System.out.println(count);
	}
}


















