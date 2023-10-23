import java.util.ArrayList;
import java.util.Collections;

public class Day9_6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("Deepi");
		al.add("Sharma");
		al.add("Nishanth");
		al.add("Muhammad");
		al.add("Joushva");
		System.out.println(" original order  : "+al);
		
		Collections.reverse(al);
		
		System.out.println(" reverse order  : "+al);
		
		al.sort(null);
		System.out.println("After Sorting "+al);
		Collections.reverse(al);
		System.out.println(" reverse order After sorting : "+al);
	}

}
