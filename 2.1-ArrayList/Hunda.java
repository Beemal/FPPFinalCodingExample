
import java.util.*;
public class Test{

	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
	      System.out.println("Initial size of al: " + al.size());
	      // add elements to the array list
	      al.add(1);
	      al.add("String");
	      al.add('o');
	      al.add("2");
	      al.add(123);
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());
             // display the array list
	      System.out.println("Contents of al: " + al);
	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(1);
	      al.remove(2);
	      System.out.println("After removal, size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
	      al.add("Hello");
	      al.add(17.2);
	      al.add("Hello");
	      al.ensureCapacity(15);
	      al.add(null);
	      System.out.println("Contents of al: " + al + "Size : " + al.size());
	      
	      ArrayList<String> friendsnames= new ArrayList<String>();
			friendsnames.add("Ankur");
			friendsnames.add("Ajeet");
			friendsnames.add("Harsh");
			friendsnames.add("John");
			//friendsnames.add(20);
			
			/*ArrayList to Array Conversion */
			String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);

			/*Displaying Array elements*/
			for(String k: frnames)
			{
				System.out.println(k);
			}
	   	}
}

/*
Initial size of al: 0
Size of al after additions: 7
Contents of al: [1, A2, String, o, 2, 123, F]
After removal, size of al after deletions: 4
Contents of al: [1, String, 2, 123]
Contents of al: [1, String, 2, 123, Hello, 17.2, Hello, null]Size : 8
Ankur
Ajeet
Harsh
John

*/
