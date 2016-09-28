
import java.util.*;
public class Test {

	
	public static void main(String[] args) {
		// Demo code for Predefined HashTable class
		
		 Hashtable<String, String> hm = new Hashtable<String, String>();
	        //add key-value pair to Hashtable
	        hm.put("1", "FIRST INSERTED");
	        hm.put("2", "SECOND INSERTED");
	        hm.put("3","THIRD INSERTED");
	        // hm.put(null,null); Throw run time error - NullPointer Exception
	        
	        System.out.println("0all the values:");
	        Iterator it = (Iterator) hm.keys();
	        while(it.hasNext())
	        {
	        	System.out.println(hm.get(it.next()));
	        }

	        System.out.println("\n1 My Hashtable content:");
	        System.out.println(hm); // Display the contents by key wise reverse order
	        
	        //Checking Keys
	        if(hm.containsKey("1")){
	            System.out.println("\n2  The Hashtable contains key 1");
	        } else {
	            System.out.println("\n3 The Hashtable does not contains key 1");
	        }
	        // Checking Value 
	        if(hm.containsValue("SECOND INSERTED")){
	            System.out.println("\n5 The Hashtable contains value SECOND INSERTED");
	        } else {
	            System.out.println("\n6 The Hashtable does not contains value SECOND INSERTED");
	        }
	        //Clearing Items
	        
	        System.out.println("\n7 Clearing Hashtable:");
	        hm.clear();
	        System.out.println("\n8 Content After clear:");
	        System.out.println(hm);}
}

/*
0all the values:
THIRD INSERTED
SECOND INSERTED
FIRST INSERTED

1 My Hashtable content:
{3=THIRD INSERTED, 2=SECOND INSERTED, 1=FIRST INSERTED}

2  The Hashtable contains key 1

5 The Hashtable contains value SECOND INSERTED

7 Clearing Hashtable:

8 Content After clear:
{}

 */
