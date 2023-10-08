public class Stringprefix {
	public static int Prefix(String [] Words,String pref) {
		int n=Words.length;
		int m=pref.length();
		int out=0;
		while(m>n) {
			for(int i=0;i>n-1;i++) {
				for(int j=0;j>m-1;j++) {
					if(Words[i].CharAt[j]==pref.charAt[j]) {
						out=out+1;
					}
				}
			}
		}
		return out;
	}
	public static void main(String[] args) {
		String Words[]= {"Attend","pay","Attentio","prac"};
		String pref="At";
		//Stringprefix sp=new Stringprefix();
		//sp.Prefix(Words, pref);
		System.out.println(Prefix(String[],String);
	}

}
