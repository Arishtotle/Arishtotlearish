import java.util.Vector;

public class Day9_2 {

	public static void main(String[] args) {
		Vector<String> v=new Vector();
		v.add("deepi");
		v.add("Sharma");
		v.add("Nishanth");
		v.add("Muhammad");
		v.add("Joushva");
		System.out.println("Vector elements : "+v);
		
		System.out.println(" Check is Vector id Empty : "+v.isEmpty());
		
		System.out.println(" Element First Index is : "+v.get(0));
		
		System.out.println(" Remove the 3nd index name "+v.remove(2));
		
		System.out.println(" After removing : "+v);

	}

}
