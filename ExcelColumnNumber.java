import java.util.*;

public class ExcelColumnNumber {
	public static int findColumnNumber(String str) {
		if(str.length()==0) {
			return 0;
		}
		int res=0;
		for(int i=0;i<str.length();i++) {
		int charvalue=str.charAt(i)-'A'+ 1;
		res=res*26+charvalue;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the column number to be find");
		System.out.println("\n please enter the Upper case letters only");
		String str=sc.next();
		System.out.println(findColumnNumber(str));
	}
}
