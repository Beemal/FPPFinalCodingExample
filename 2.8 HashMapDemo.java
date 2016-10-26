import java.util.HashMap;
import java.util.HashSet;

public class Test{

	public static void main(String[] args) {
		
		HashMap<Integer,String> productMap = new HashMap<Integer,String>();
		productMap.put(1, "Keys");
		productMap.put(4, "Books");
		productMap.put(3, "Systems");
		productMap.put(7, "Mobile");
		productMap.put(null, null);
		System.out.println("HashMap test~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(productMap);
		System.out.println(productMap.get(3));
		System.out.println(productMap.containsKey(5));
		System.out.println(productMap.keySet());
		System.out.println(productMap.values());
		
		
		 System.out.println("HashSet test~~~~~~~~~~~~~~~~~~~~~~~~~~");
		HashSet<String> stateSet = new HashSet<String>();
		stateSet.add ("CA");
		stateSet.add ("WI");
		stateSet.add ("NY");
		stateSet.add (null);
		if (stateSet.contains("PB")) /* if CA, it will not add but shows following message*/
		     System.out.println("Already found");
		else
		    stateSet.add("PB");
		 System.out.println(stateSet);
		 
		 HashSet<Integer> numberSet = new HashSet<Integer>();
		 numberSet.add(10);
		 numberSet.add(-12);
		 numberSet.add(15);
		 numberSet.add(16);
		 numberSet.remove(15);
		 boolean s = numberSet.add(19);
		 for(Integer num:numberSet)
	            System.out.println("Value : " + num);
		 System.out.println(s);
		 
	}

}
/*
HashMap test~~~~~~~~~~~~~~~~~~~~~~~~~~
{null=null, 1=Keys, 3=Systems, 4=Books, 7=Mobile}
Systems
false
[null, 1, 3, 4, 7]
[null, Keys, Systems, Books, Mobile]
HashSet test~~~~~~~~~~~~~~~~~~~~~~~~~~
[null, WI, PB, NY, CA]
Value : 16
Value : 19
Value : 10
Value : -12
true

*/
