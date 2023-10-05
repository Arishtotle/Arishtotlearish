public class Main {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "hello";
		if(s1 == s2) System.out.println("s1 and s2 equal");
		else System.out.println("s1 and s2 not equal");
		if(s1 == s3) System.out.println("s1 and s3 equal"); 
		else System.out.println("s1 and s3 not equal");
	}
}


/*public class Main {
	public static void main(String[] args) {
		String s = "java" , t = new String("java");
		if(s.equals(t)) System.out.println("equal");
		else System.out.println("not equal");
	}
}
*/