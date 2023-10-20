import java.util.Scanner;

public class MaxNum{
public static void main(String[] args){

int maxval=0;
Scanner sc=new Scanner(System.in);
int m=sc.nextInt(),n=sc.nextInt();
for(int i=sc.nextInt();i<m;i++){
int maxi = 0;
for(int j=sc.nextInt();j<n;j++){

maxi=maxi+n;

maxval=Math.max(maxval,maxi);
}
}
System.out.println(maxval);
}
}