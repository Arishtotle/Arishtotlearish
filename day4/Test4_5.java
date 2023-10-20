import java.util.*;

public class Test4_5{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++) ar[i]=sc.nextInt();

boolean b=false;
    for(int i=0;i<n;i++){
	for(int j=i;j<n;j++){
	  int sum=0;
		for(int k=i;k<=j;k++){
		  sum=sum+k;
		}
	if(sum==0){
	b=true;
    }
}

}


if(b==true){
System.out.println("yes");
}else{
System.out.println("no");
}

}
}

