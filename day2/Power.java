import java.util.Scanner;

public class Power{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();

int res=1;
while(m>0){
res=res*n;
m--;
}
System.out.println(res);
}
}
