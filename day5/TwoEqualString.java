public class TwoEqualString {
	public String TwoString(String s1,String s2) {
		if(s1.length()==s2.length()) 
			return s1+s2;
		if(s1.length()>s2.length()){
			int dif=s1.length()-s2.length();
					return s1.substring(dif,s1.length()) + s2;
		}else {
			int dif=s2.length()-s1.length();
			return s2.substring(dif,s2.length())+s1;
		}
		
	}
public static void main(String[] args) {
	TwoEqualString s=new TwoEqualString();
	String s1="Arishtotle";
	String s2="your here to got it";
	System.out.println("the actual strings are"+s1+" "+s2);
	System.out.println("the changes made String is "+s.TwoString(s1,s2));
}
}