
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
	        
	        Iterator it = (Iterator) hm.keys();
	        System.out.println("My Hashtable content:");
	        System.out.println(hm); // Display the contents by key wise reverse order
	        
	        //Checking Keys
	        if(hm.containsKey("1")){
	            System.out.println("The Hashtable contains key 1");
	        } else {
	            System.out.println("The Hashtable does not contains key 1");
	        }
	        // Checking Value 
	        if(hm.containsValue("SECOND INSERTED")){
	            System.out.println("The Hashtable contains value SECOND INSERTED");
	        } else {
	            System.out.println("The Hashtable does not contains value SECOND INSERTED");
	        }
	        //Clearing Items
	        
	        System.out.println("Clearing Hashtable:");
	        hm.clear();
	        System.out.println("Content After clear:");
	        System.out.println(hm);}
}

/*
 My Hashtable content:
{3=THIRD INSERTED, 2=SECOND INSERTED, 1=FIRST INSERTED}
The Hashtable contains key 1
The Hashtable contains value SECOND INSERTED
Clearing Hashtable:
Content After clear:
{}
 */
