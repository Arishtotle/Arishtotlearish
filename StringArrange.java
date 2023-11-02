import java.util.*;

public class StringArrange {
	public static String getSortedString(String input,int n) {
		Vector<Character> v1=new Vector<>();
		Vector<Character> v2=new Vector<>();
		for(int i=0;i<n;i++) {
			if(input.charAt(i)>'a' && input.charAt(i)<'z') {
				v1.add(input.charAt(i));
			}
			if(input.charAt(i)>'A' && input.charAt(i)<'Z') {
				v2.add(input.charAt(i));
			}
			Collections.sort(v1);
			Collections.sort(v2);
		}
		int i=0,j=0;
		StringBuilder res=new StringBuilder();
		for(int k=0;k<n;k++) {
			if(input.charAt(k)>='a' && input.charAt(k)<='z' ) {
				res.append(CharAt(k,v1.elementAt(i)));
				++i;
			}
			else if(input.charAt(k)>='A' && input.charAt(k)<='Z' ) {
				res.append(CharAt(k,v2.elementAt(i)));
				++j;
			}
		}
		
		return input.toString();
	}
	public static void main(String[] args) {
		String input="cedBafiGa";
		int n=input.length();
		System.out.println(getSortedString(input,n));
	}

}