/*
Bubble Sort

Company: Microsoft, Wipro, SAP Labs, Cisco, Nagarro, redBus, Accenture,
Huawei
Platform: GFG
Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
Example 1:
Input:
N = 5
arr[] = {4, 1, 3, 9, 7}
Output:
1 3 4 7 9
Example 2:
Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10
Expected Time Complexity: O(N^2).
Expected Auxiliary Space: O(1).
*/



class BubbleSort{
		
	static void bubbleSort(int arr[]){
		
		for(int i=0;i<arr.length;i++){
			boolean flag=false;

			for(int j=0;j<arr.length-1-i;j++){
				
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}

			if(flag==false){
				break;
			}
		}
	}

	public static void main(String args[]){

		int arr[]=new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }System.out.println();

		bubbleSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
}



























