public class DriverClass {

	public static void main(String [] args)
	{
		//add
		Node head=new Node(null,5,null);
		Node n1=new Node(head,10,null);
		head.next=n1;
		Node n2=new Node(n1,15,null);
		n1.next=n2;
		//get
		System.out.println(n2.value);
		System.out.println(head.next.value);
		//insert
		Node x=new Node(n1,100,n2);
		n1.next=x;
		n2.previous=x;
		System.out.println(n1.next.value);
		System.out.println();
		//toString
		int sum=0;
		System.out.println("the whole lined list is");
		for(Node temp=head; temp!=null;temp=temp.next)
		{
			System.out.println(temp.value+"->");
			sum=sum+Integer.parseInt((temp.value).toString());
		}
		//sum
		System.out.println("sum="+sum);
		System.out.println();
		//get
		System.out.println(head.next.next);
	}
	
	
}


/*
15
10
100

the whole lined list is
5->
10->
100->
15->

100 
*/

