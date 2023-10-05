import java.util.Scanner;
public class Prime{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
boolean prime = true;
for(int j=2;j<n;j++) {
if(n%j==0) prime = false;
}
if(prime) System.out.print("It is a prime number");
else System.out.print("It is not a prime number");
}
}
