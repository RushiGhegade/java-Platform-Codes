/*
	Invalid Transactions
Company:
Platform : leetcode - 1169
Fraz’s DSA sheet
Description:
A transaction is possibly invalid if:
the amount exceeds $1000, or;
if it occurs within (and including) 60 minutes of another transaction with the same name
in a different city.
You are given an array of strings transaction where transactions[i] consists of
comma-separated values representing the name, time (in minutes), amount, and city of
the transaction.
Return a list of transactions that are possibly invalid. You may return the answer in any
order.

Example 1:
Input:
transactions = ["alice,20,800,mtv","alice,50,100,beijing"]
Output:
["alice,20,800,mtv","alice,50,100,beijing"]
Explanation:
The first transaction is invalid because the second transaction occurs within a
difference of 60 minutes, have the same name and is in a different city. Similarly
the second one is invalid too.

Example 2:
Input:
transactions = ["alice,20,800,mtv","alice,50,1200,mtv"]
Output:
["alice,50,1200,mtv"]

Example 3:
Input:
transactions = ["alice,20,800,mtv","bob,50,1200,mtv"]
Output:
["bob,50,1200,mtv"]

Constraints:

● transactions.length <= 1000
● Each transactions[i] takes the form "{name},{time},{amount},{city}"
● Each {name} and {city} consist of lowercase English letters, and have lengths
between 1 and 10.
● Each {time} consist of digits, and represent an integer between 0 and 1000.
● Each {amount} consist of digits, and represent an integer between 0 and 2000.
*/
import java.util.*;
class Demo{

	static class Transaction{
		String name;
		int time;
		int amount;
		String city;

		Transaction(String str){
			String arr[]=str.split(",");
			name=arr[0];
			time=Integer.parseInt(arr[1]);
			amount=Integer.parseInt(arr[2]);
			city=arr[3];
		}
	}
	static boolean isvalid(Transaction t , List<Transaction> list){
		
		if(t.amount > 1000){
			return false;
		}

		for(Transaction str:list){
			
			if(Math.abs(str.time - t.time)<=60 && !(str.city.equals(t.city))){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		
		String arr[]=new String[]{"alice,20,800,mtv","alice,50,100,beijing"};

			List<String> result=new ArrayList<>();
		Map<String ,List<Transaction>> map=new HashMap<>();

		// update map
		for(String str : arr){
			Transaction t=new Transaction(str);

			map.putIfAbsent(t.name,new ArrayList<>());

			map.get(t.name).add(t);
		}

		//cheack valid or not
		for(String str:arr){
			Transaction t=new Transaction(str);

			if(!isvalid(t,map.getOrDefault(t.name,new ArrayList<>()))){
				result.add(str);
			}
		}

		System.out.println(result);


	}
}
