import java.util.ArrayList;

public class Day9_5 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList();
		al.add("Deepi");
		al.add("Sharma");
		al.add("Nishanth");
		al.add("Muhammad");
		al.add("Joushva");
		System.out.println(" Before Sorting  : "+al);
		
		al.sort(null);
		System.out.println("After Sorting "+al);

	}

}