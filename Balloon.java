import java.util.*;


public class Balloon{
	static boolean b=false;
	static Scanner sc=new Scanner(System.in);
	
	public static void bolloonAdd(String[][] ar,int n){
		
		System.out.println("please enter the column number ");
		int col=sc.nextInt();
		System.out.println("Enter the colour of the balloon ");
		String s=sc.next();
		int i=n-1;
		if(ar[i-2][col-1].equals(ar[i-1][col-1]) && ar[i-1][col-1].equals(ar[i][col-1]) && ar[i][col-1].equals("B") || ar[i][col-1].equals("R") ){
         ar[i-2][col-1]="-";
         ar[i-1][col-1]="-";		 
		ar[i][col-1]="-";
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				System.out.print(ar[j][k]+" ");
			}
			System.out.println();
		}
		System.out.println("column is bursted .program is terminated");
		b=true;
		}else{
		if(ar[i][col-1].equals("-")){
			ar[i][col-1]=s;
		}else if(ar[i][col-2].equals("-")){
			ar[i][col-2]=s;
		}else if(ar[i][col].equals("-")){
			ar[i][col]=s;
		}else if(ar[i-1][col-1].equals("-")){
			ar[i-1][col-1]=s;
		}else if(ar[i-1][col-2].equals("-")){
			ar[i-1][col-2]=s;
		}else if(ar[i-1][col].equals("-")){
			ar[i-1][col]=s;
		}else if(ar[i-2][col-1].equals("-")){
			ar[i-2][col-1]=s;
		}else if(ar[i-2][col-2].equals("-")){
			ar[i-2][col-2]=s;
		}else if(ar[i-2][col].equals("-")){
			ar[i-2][col]=s;
		}else{
			System.out.println("column is filled Completely .program is terminated ");
			b=true;
		}
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++){
				System.out.print(ar[j][k]+" ");
			}
			System.out.println();
		}
	}
	
	}
	public static void main(String[] args){
	
	
	int n=sc.nextInt();
	
	String[][] ar=new String[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			ar[i][j]="-";
		}
	}
	
	
	while(!b){
		System.out.println("1.continue "+"\n0.exit");
		int num=sc.nextInt();
		switch(num){
		case 1:
		bolloonAdd(ar,n);
		break;
		
		case 0:
		b=true;
		break;
		
		default:
		System.out.println("please enter the valid option");
		break;
		}
	}
	
	}	
}