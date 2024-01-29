

import java.util.*;
class PascalTriangle{
	
		



	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Row");
		int row=sc.nextInt();

		int arr[][]=new int[row][];

		for(int i=0;i<arr.length;i++){
			
			arr[i]=new int[i+1];
			int len=arr[i].length;

			if(i==0){
				arr[0][0]=1;
			}else{

				
				arr[i][0]=1;
				arr[i][len-1]=1;
				int k=0;
				for(int j=1;j<arr[i].length-1;j++){
					
					arr[i][j]=arr[i-1][k]+arr[i-1][k+1];
					k++;

				}
			}


		}
		
		for(int i=0;i<arr.length;i++){			
			for(int j=0;j<arr[i].length;j++){
				if(i==4){
					System.out.print(arr[i][j]+" ");
				}
			}//System.out.println();
		}System.out.println();
	}
}
