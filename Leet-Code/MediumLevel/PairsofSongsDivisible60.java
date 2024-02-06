
import java.util.*;
class  PairsofSongsDivisible60{
	
	static int optimal(int arr[]) {

		HashMap<Integer,Integer> hm=new HashMap<>();
		int count=0;		
		
		int arr1[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){   // Make Big Problem to small problem take module hence calculation become easy 
						 // so arr1 element is below the 60 so we easily find how many number recuired to add 60 
			
			arr1[i]=arr[i]%60;
		}


		for(int i=0;i<arr.length;i++){
			
			int sum=60-arr1[i];

			if(hm.containsKey(sum)){
				
				count=count+hm.get(sum);

				if(hm.containsKey(arr[i]))
					hm.put(arr1[i],hm.get(arr1[i])+1);
				else
					 hm.put(arr1[i],1);
			}else{
				 if(hm.containsKey(arr1[i]))
                                        hm.put(arr1[i],hm.get(arr1[i])+1);
                                else
                                         hm.put(arr1[i],1);
			}
		}

		if(hm.containsKey(0)){
			
			count=count+hm.get(0);
		}

		return count;
	}

	static int pairs(int arr[]) {
		
		int count=0;

		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++) {
				
				int sum=arr[i]+arr[j];

				if(sum%60==0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]) {
		
		int arr[]=new int[]{418,204,77,278,239,457,284,263,372,279,476,416,360,18};

		int count=pairs(arr);
		System.out.println(count);

		int ans=optimal(arr);
		System.out.println(ans);

	}
}
