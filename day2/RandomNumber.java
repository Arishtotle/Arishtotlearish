import java.util.Scanner;
import java.util.Random;

public class RandomNumber{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
Random rand=new Random();
int n=rand.nextInt(1000);
for(int i=1;i<=10;i++){
int m=sc.nextInt();
if(m==n) {
System.out.println("the number is same");
}
else if (m>n)
{
System.out.println("too high,try again");
}
else
{
System.out.println("too low,try again");
}
if(i==10){
System.out.println("too many attempt,try again later");
}
}
}
}



