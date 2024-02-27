/*
 *Possible Words From Phone Digits
Company: Flipkart, Amazon, Microsoft
Platform : GFG, Leetcode - 17
Love Babbar’s DSA sheet
Description:

Given a keypad as shown in the diagram, and an N digit number which is
represented by array a[ ], the task is to list all words which are possible by pressing
these numbers.
Example 1:
Input: N = 3, a[] = {2, 3, 4}
Output:
adg adh adi aeg aeh aei afg afh afi
bdg bdh bdi beg beh bei bfg bfh bfi
cdg cdh cdi ceg ceh cei cfg cfh cfi
Explanation: When we press 2,3,4 then adg, adh, adi, ... cfi are the list of possible words.
Example 2:
Input: N = 3, a[] = {3, 4, 5}
Output:
dgj dgk dgl dhj dhk dhl dij dik dil
egj egk egl ehj ehk ehl eij eik eil
fgj fgk fgl fhj fhk fhl fij fik fil
Explanation: When we press 3,4,5 then dgj, dgk, dgl, ... fil are the list of possible words.
Expected Time Complexity: O(4N * N).
Expected Auxiliary Space: O(N).
Constraints:
1 ≤ N ≤ 10
2 ≤ a[i] ≤ 9
 * */

import java.util.*;
class Demo{

        static void findCombination(String digit,List<String> result,int index,String output,String[] mapping){

                if(index >= digit.length()){
                        if(output!=""){
                                result.add(output);
                        }
                        return ;
                }


                int val=digit.charAt(index) - '0';

                String str=mapping[val];

                for(int i=0;i<str.length();i++){

                        output += str.charAt(i);

                         findCombination(digit,result,index+1,output,mapping);

                         output =output.substring(0,output.length()-1);
                }
        }

        public static void main(String args[]) {

                String digit="23";

                List<String> result= new ArrayList<>();
                int index=0;
                String output="";
                String mapping[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

                findCombination(digit,result,index,output,mapping);
                // leetcode
                System.out.println(result);


        }
}
/*
class gef{
// gfg
//only diffrence is that  it take arr to store digit we does not need to conver string number in this
static  void findCombinations(ArrayList<String> result,String output,int index,String[] mapping,int arr[]){

        if(index >= arr.length){
            if(output!=""){
                result.add(output);
            }
            return ;
        }

        String str=mapping[arr[index]];

        for(int i=0;i<str.length();i++){
            output += str.charAt(i);

            findCombination(result,output,index+1,mapping,arr);

            output=output.substring(0,output.length()-1);
        }
}
}*/
