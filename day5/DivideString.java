public class DivideString {
	public static void main(String[] args) {
		String s="aaaaaabbbccc";
		int len=s.length();
		int n=4;
		int tep=0,Chars=len/n;
		String[] equals=new String[n];
		if(len%n!=0) {
			System.out.println("String can,t be Divide Equally");
		}else {
			for(int i=0;i<len;i=i+Chars) {
				String part=s.substring(i,i+Chars);
				equals[tep]=part;
				tep++;
			}
			for(int i=0;i<equals.length;i++) {
				System.out.println(equals[i]);
			}
		}
	}
}
