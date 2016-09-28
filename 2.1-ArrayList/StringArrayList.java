
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

		public static void main(String[] args) {
			ArrayList<String> stringArray = new ArrayList<String>(
		    Arrays.asList("Hello", "Welcome", "Java", "Object", "Array", "String", "Inheritance"));
			System.out.println("****** Unsorted String Array *******");
			System.out.println(stringArray);
			
			System.out.println("****** Sorted String Array *******");
			//Sort array in ascending order
			Collections.sort(stringArray);
			System.out.println(stringArray);
				    
			  //Sort array in reverse order
			  Collections.sort(stringArray,Collections.reverseOrder());
			   System.out.println("****** Reverse Sorted String Array *******");
			   System.out.println(stringArray);
			   	   
			   
			
	}

}
/*
  ****** Unsorted String Array *******
[Hello, Welcome, Java, Object, Array, String, Inheritance]
****** Sorted String Array *******
[Array, Hello, Inheritance, Java, Object, String, Welcome]
****** Reverse Sorted String Array *******
[Welcome, String, Object, Java, Inheritance, Hello, Array]

 */
