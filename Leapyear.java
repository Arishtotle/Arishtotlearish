import java.util.Scanner;
public class Leapyear{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


if(n%4==0 && n%100==0 && n%400==0) System.out.println(" its leap year");

else if(n%4==0 && n%100!=0 )System.out.println(" its leap year");

else if(n%4==0 && n%100==0 && n%400!=0 ) System.out.println(" its  not leap year");

else if(n%4!=0 ) System.out.println(" its  not leap year");
}
}