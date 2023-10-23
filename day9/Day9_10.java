import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Day9_10 {

	public static void main(String[] args) {
		Map <String,Integer> hm=new HashMap<>();
		hm.put("Arish",23);
		hm.put("Deepi",22);
		hm.put("barani",25);
		hm.put("Tamil",26);
		for(Entry<String,Integer> A : hm.entrySet()) {
			String key= A.getKey();
			int i=A.getValue();
			System.out.println(key+ " : " +i);
			
		}
	}

}