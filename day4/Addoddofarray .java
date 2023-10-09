public class Addoddofarray {
	public static int Addarray(int[] ar) {
		int l=ar.length;
		int sum=0;
		for(int i=0;i<l;i++) {
			for(int j=i;j<l;j=j+2) {
				for(int k=1;k<=j;k++) {
					sum=sum+ar[k];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int ar[]= {1,5,3,1,2};
		
		System.out.println(Addarray(ar));
	}

}