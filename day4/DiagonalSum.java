public class DiagonalSum {
	
	public static int Dia(int [][] m) {
		int sum=0;
		int L=m.length;
		for(int i=0;i<L;i++) {
			sum=sum+m[i][i];
			sum=sum+m[i][L-1-i];
		
		}
		if(L%2 !=0)
		{
		sum=sum-m[L/2][L/2];
		
		}
	      return sum;
		
		
		
	}
	
	public static void main(String[] args) {
	int	m[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
	
	System.out.print(Dia(m));
		}
		
		}
		