public class CandyTotal {
	public int CandyTotal(int[] ar,int k) {
		int l=ar.length;
		boolean sum;
		int max=ar[0];
		for(int j=0;j<l;j++) {
			if(max<=ar[j]) {
				max=ar[j];
			}
		}
		for(int i=0;i<l;i++) {
			int compare=ar[i]+k;
			if(compare>=max) {
				if(compare>=max){
					ar.add(true);
				}else {
					ar.add(false);
				}
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		int ar[]= {4,1,2,2,1};
		int k=1;
	  CandyTotal c=new CandyTotal();
	  c.CandyTotal(ar, k);
	  System.out.println(c);
	}

}
