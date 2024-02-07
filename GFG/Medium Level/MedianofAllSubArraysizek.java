/*
 *2:Find the median of all subarrays of a particular size.
Company: Google, Flipkart, Adobe, OLA, Wipro
Platform : Coding ninjas
Fraz’s DSA sheet
Description :
You have been given an array/list ‘ARR’ of integers consisting of ‘N’ integers.
You are also given a size ‘M’. You need to display the median of all the subarrays of size
‘M’ and it is starting from the very left of the array.
Median is the middle value in an ordered integer array/list. If the size of the array/list is
even there is no middle element. So the median is the mean of two middle values in an
even size array/list.
Your task is to return the median of all the subarrays whose size is ‘M’.
Example:
Let’s say you have an array/list [1,4,3,5] and ‘M’ is 3.Then the first subarray of
size 3 is [1,4,3] whose median is 3.Then the second subarray of size 3 is [4,3,5] whose
median is 4. Therefore the median of all the subarrays of size 3 is [3.0,4.0].

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N <= 1000
1 <= M <= N
1 <= ‘ARR[i]’ <= 10^6

Time Limit: 1sec
Sample Input 1:
2
4 3
1 2 3 4
4 4
1 2 3 4

Sample Output 1:
2.0 3.0
2.5
Sample Output 1 Explanation:
Test case 1:
All the possible subarrays of size 3 are:-
[1,2,3] → Middle element of the subarray(in sorted manner) is 2. Therefore the
median is 2.
[2,3,4] → Middle element of the subarray(in sorted manner) is 3. Therefore the
median is 3.
Therefore the answer is [2.0,3.0].
Test case 2:
All the possible subarrays of size 4 are:-
[1,2,3,4] → Middle elements of the subarray are 2 and 3. Therefore the median is
2.5.
Therefore the answer is [2.5].

Sample Input 2:
2
4 1
1 2 3 4
8 4
1 2 3 4 4 3 2 1
Sample Output 2:
1.0 2.0 3.0 4.0
2.5 3.5 3.5 3.5 2.5
 * */

import java.util.*;
class Demo{
	
	public static void main(String args[]) {

		int a[]=new int[]{1 ,2 ,3 ,4 ,4 ,3 ,2 ,1};
		ArrayList < Integer > arr=new ArrayList<>();
		for(int i=0;i<a.length;i++){
			arr.add(a[i]);
		}
		int m=4;
		System.out.println(arr);
	ArrayList<Double> Ans=new ArrayList<>();

      ArrayList<Integer> al=new ArrayList<>();
      ArrayList<Integer> sortal=new ArrayList<>();

      for(int i=0;i<m;i++){
        al.add(arr.get(i));
      }
      int l=m/2;
      sortal.addAll(al);
      Collections.sort(sortal);
      if(m%2==0){

            double p=sortal.get(l);
            double b=sortal.get(l-1);

            double ans=(p+b)/2;
            
            Ans.add(ans);

        }else{
            double ans=sortal.get(l);

            Ans.add(ans);
        }
      for(int i=1;i<=arr.size()-m;i++) {
        int kpos=m+i-1;
        
        sortal.clear();
        System.out.println(al);
        al.remove(0);
        al.add(arr.get(kpos));
        sortal.addAll(al);
	 Collections.sort(sortal);
	 //System.out.println(sortal);
        if(m%2==0){

            double x=sortal.get(l);
            double y=sortal.get(l-1);

            double ans=(x+y)/2;
            
            Ans.add(ans);

        }else{
            double ans=sortal.get(l);

            Ans.add(ans);
        }

        

        
      }
      System.out.println(Ans);
}
}
