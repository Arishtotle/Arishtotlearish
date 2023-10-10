public class Leaders {
	public static void main(String[] args) {
		int ar[]= {1,15,2,5,3,6};
		int l=ar.length;
	
		
		for(int i=0;i<l;i++) {
			int j;
			for( j=i;j<l;j++) {
				if(ar[i]<=ar[j]) 
					break;
			}
				if(j==l) 
					System.out.println(ar[i]+" ");
				
				
			}
		}
		
	
	
		
	}