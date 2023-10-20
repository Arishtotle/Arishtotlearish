import java.util.Scanner;


public class Calculatorapp{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
double x=sc.nextDouble();
double y=sc.nextDouble();
String[] s={"+","-","*","/","%","+%","-%"};
String n=sc.next();



switch(n){
case "+":
   System.out.println(x+y);
       break;
case "-":
   System.out.println(x-y);
       break;
case "*":
   System.out.println(x*y);
       break;
case "/":
   System.out.println(x/y);
       break;
case "%":
   System.out.println(x%y);
       break;
case "+%":
       double z=(x/y)*100;
   System.out.println("+"+z);
       break;
case "-%":
         double a=(x/y)*100;
   System.out.println("-"+a);
       break;
}

}
}
