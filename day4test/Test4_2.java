import java.util.*;

public class Test4_2{

public static void main(String[] args){

	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	int[] ar=new int[n];
	for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        int ans=-1;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(ar[i]==ar[j]){
				continue;
			}
		}
	}
        System.out.println(ans);
}
}

				