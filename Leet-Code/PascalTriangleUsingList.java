import java.util.*;

class PascalTriangle1 {
	
	public static void main(String args[]){
		
		List<List<Integer>> list =new ArrayList<List<Integer>>();

		List<Integer> pre=null;

		int row=5;

		for(int i=0;i<row;i++){
			
			List<Integer> al=new ArrayList<>();

			for(int j=0;j<=i;j++){
				
				if(j==0 || j==i){
					al.add(1);
				}else{
					al.add(pre.get(j-1) + pre.get(j));
				}
			}
			pre=al;

			list.add(al);
		}

		System.out.println(list);

	}
}
