 import java.util.Scanner;
public class Armsno{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int val=n,Dec=0;
while(n>0){
int rem =n%10;
Dec=Dec+(rem*rem*rem);
n=n/10;
}
if(Dec==val){
System.out.print("Its Arms Number");
}
else{
System.out.print("Its not Arms Number");
}
}
}
