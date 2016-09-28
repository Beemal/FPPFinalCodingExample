
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.LinkedList;
public class StackDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(3);
		pq.add(1);
		pq.add(2);
		System.out.println("Priority Queue Elements : " + pq);
		
		Deque<String> dq = new LinkedList();
		dq.add ("Java"); //add element at tail
		dq.addFirst("C#"); //add element at head
		dq.addLast ("Software Engineering"); //add element at tail
		System.out.println("DQueue Elements : " + dq);
	}
	
}

/*
 Priority Queue Elements : [1, 3, 2]
DQueue Elements : [C#, Java, Software Engineering]
 */
