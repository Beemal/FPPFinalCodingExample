package package3;

public class DriverClass {

	public static void main(String[] args) 
	{
   
		HashMap hm = new HashMap();
   
		hm.put(1, 20);
   
		hm.put(2, 30);
    
		hm.put(5, 50);
      
		System.out.println("Value for the Key 1: " +hm.get(1));
  
		System.out.println("Value for the Key 5: " +hm.get(5));
   
		System.out.println("Size : " + hm.size());
    }
}

/*
resizing
The list of size 5 is [Bob, Steve, Susan, Mark, Dave]
The list of size 3 is [Steve, Susan, Dave]
The list of size 4 after inserting Richard into pos 3 is [Steve, Susan, Dave, Richard]
The list of size 5 after inserting Tonya into pos 0 is [Tonya, Steve, Susan, Dave, Richard]
 */
