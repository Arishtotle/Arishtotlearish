import java.util.LinkedList;
import java.util.Queue;

public class Day9_9 {

	public static void main(String[] args) {
		Queue <Integer> q=new LinkedList();
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(" The search element is presend in the queue : "+q.contains(2));
		
		System.out.println(" Before seting the elemeint in 2nd index : "+q);
		((LinkedList) q).set(1,4);
		
		System.out.println(" After seting the elemeint in 2nd index : "+q);
		
		
		
	}

}
