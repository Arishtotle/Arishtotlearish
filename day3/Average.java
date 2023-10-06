import java.util.Scanner;

public class Average{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        double num3=sc.nextDouble();

        System.out.println("the average of three numbers "+Averageval(num1,num2,num3));
       }
      public static double Averageval(double num1,double num2,double num3){
          return (num1+num2+num3)/3;
     }
}