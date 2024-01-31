// Find the Kth distinct largest element in the array 
import java.util.*;
class Demo{
	
	public static void main(String args[]){
		
		int arr[]=new int[]{1,2,3,3,4,5,5};
		int k=2;
		//Set<Integer> set=new TreeSet<>(Collections.reverseOrder()); // forlargest
		Set<Integer> set=new TreeSet<>();
		//Set<Integer> set=new LinkedHashSet<>();  we also doing using LinkedHashSet
		
		for(int x: arr){
			set.add(x);
		}

		Iterator itr=set.iterator();
		int n=set.size()-k;
		
		int m=1;
		while(itr.hasNext()){
			
			itr.next();

			if(m!=k){
				itr.remove();
			}
			m++;
		}

		System.out.println(set);	

	}
}
