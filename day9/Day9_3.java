import java.util.ArrayList;

public class Day9_3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("deepi");
		al.add("Sharma");
		al.add("Nishanth");
		al.add("Muhammad");
		al.add("Joushva");
		System.out.println("array elements : "+al);
		
		System.out.println();
		
		System.out.println(" Check is array id Empty : "+al.isEmpty());

		System.out.println();
		
		System.out.println(" Element First Index is : "+al.get(0));

		System.out.println();
		
		System.out.println(" Remove the 3nd index name "+al.remove(2));

		System.out.println();
		
		System.out.println(" After removing : "+al);

		System.out.println();
		
		System.out.println(" The size of an array : "+al.size());
		
	}

}
