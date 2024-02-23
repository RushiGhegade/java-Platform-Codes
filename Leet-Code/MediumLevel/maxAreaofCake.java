/*
 
	Maximum Area of a Piece of Cake After Horizontal and
Vertical Cuts
Company:
Platform : leetcode-1465
Fraz’s DSA sheet
Description:
You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts
and verticalCuts where:
horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal
cut and similarly, and verticalCuts[j] is the distance from the left of the rectangular cake
to the jth vertical cut.
Return the maximum area of a piece of cake after you cut at each horizontal and vertical
position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be
a large number, return this modulo 109 + 7.

Example 1:
Input:
h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
Output:
4
Explanation:
The figure above represents the given rectangular cake. Red lines are the
horizontal and vertical cuts. After you cut the cake, the green piece of cake has
the maximum area.
Example 2:

Input:

h = 5, w = 4, horizontalCuts = [3,1], verticalCuts = [1]
Output:
6
Explanation:
The figure above represents the given rectangular cake. Red lines are the
horizontal and vertical cuts. After you cut the cake, the green and yellow pieces
of cake have the maximum area.
Example 3:
Input:
h = 5, w = 4, horizontalCuts = [3], verticalCuts = [3]
Output:
9

Constraints:
2 <= h, w <= 109
1 <= horizontalCuts.length <= min(h - 1, 105)
1 <= verticalCuts.length <= min(w - 1, 105)
1 <= horizontalCuts[i] < h
1 <= verticalCuts[i] < w
All the elements in horizontalCuts are distinct.
All the elements in verticalCuts are distinct.
   */





import java.util.*;

class MaxArea{
	
	public static void main(String args[]){
		
		int h=5;
		int w=4;


		int hori[]=new int[]{1,2,3};
		int ver[] = new int[]{1,3};

		Arrays.sort(hori);
		Arrays.sort(ver);
		int maxh=hori[0];
		int maxv=ver[0];


		// find mx height in hori
		for(int i=1;i<=hori.length;i++){
			
			if(i<hori.length){

				int diff= hori[i]-hori[i-1];
				if(diff>maxh){
					maxh=diff;
				}
			}else{
				int diff=h-hori[i-1];
                                if(diff>maxh){
                                        maxh=diff;
                                }
			}
			
		}

		for(int i=1;i<=ver.length;i++){

                        if(i<ver.length){

                                int diff= ver[i]-ver[i-1];
                                if(diff>maxv){
                                        maxv=diff;
                                }
                        }else{
				int diff=w-ver[i-1];
				if(diff>maxv){
					maxv=diff;
				}
			}

                }

		System.out.println(maxh * maxv);
	}


}	
































