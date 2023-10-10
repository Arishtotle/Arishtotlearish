public class MaxRight {
	public int[] Max(int ar[],int l) {
		int max=ar[l-1];
		 ar[l-1]=-1;
		 for(int i=l-2;i>=0;i--) {
			 int temp=ar[i];
			 ar[i]=max;
			 if(max<temp) 
				 max=temp;
		 }
			 
			 return ar;
		}
		
		 
		
	
	public static void main(String[] args) {
		int ar[]= {16,8,2,3,7};
		int l=ar.length;
		MaxRight mr=new MaxRight();
		
		System.out.println(mr.Max(ar,l));
	}

}