import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Day9_1 {

	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap();
		mp.put("Arish",98);
		mp.put("Deepika",100);
		mp.put("Bobby",77);
		mp.put("Nisha",25);
		mp.put("Dhew",99);
		mp.put("Om Prakash",00);
		mp.put("Krishith",12);
		
		List<Map.Entry<String,Integer>> al=new ArrayList(mp.entrySet());
		
		al.sort(Comparator.comparing((Map.Entry<String,Integer>entry)->entry.getValue()).reversed());
		int rank=1;
		for(Map.Entry<String,Integer> entry :al) {
			System.out.println("Student score "+entry.getValue()+" Student name "+entry.getKey()+" Student rank "+rank);
			rank++;
		}
		
	}

}
