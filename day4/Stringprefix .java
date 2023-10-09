public class Stringprefix {
	public static int Prefix(String [] Words,String pref) {
		int n=Words.length;
		int m=pref.length();
		int cnt=0;
		
			for(int i=0;i<n;i++) {
                             if(Words[i].length()>=m){
                                   boolean same=true;
				for(int j=0;j<m;j++) {
					if(Words[i].CharAt[j]!=pref.charAt[j]) {
						same=false;
					}
				}
                                   if(same) cnt++;
                               }
			}
		
		return cnt;
	}
	public static void main(String[] args) {
		String Words[]= {"Attend","pay","Attentio","prac"};
		String pref="At";
		
		System.out.print(Prefix(Words,pref));
	}

}