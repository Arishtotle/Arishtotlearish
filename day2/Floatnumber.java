import java.util.Scanner;

public class Floatnumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
float f=sc.nextFloat();

if(f==0){
System.out.print("zero");
}else if(f>0){
System.out.print("positive");
}else if(f<0){
System.out.print("negative");
}
float m=Math.abs(f-0);

if(m<1){
System.out.print(" small");
}else if(m>1000000){
System.out.print(" large");
}
}
}
