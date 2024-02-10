
import java.util.*;
class Demo{

	public static void main(String args[]) {
		
		int arr[]=new int[]{2 ,4 ,3 ,9 ,9 ,10 ,9 ,7 ,1, 2};

		int k=10;
		
		Arrays.sort(arr);

		int small=arr[0]+k;
		int large=arr[arr.length-1]-k;

		int max=0;
		int min=0;
		
		int ans=arr[arr.length-1]-arr[0];

		for(int i=0;i<arr.length-1;i++){

			if(arr[i+1]-k < small){
				min=arr[i]-k;
			}else{
				min=small;
			}

			if(arr[i]+k>large){
				max=arr[i]+k;
			}else{
				min=large;
			}

			if(min<0){
				continue;
			}

			if(max-min < ans){
				ans=max-min;
			}
		}
		System.out.println(ans);
	}
}
