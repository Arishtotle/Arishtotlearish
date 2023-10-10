import java.util.Scanner;

public class TwoLexicographicString{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
if(a.equals(b)){
System.out.println("two strings are lexicographically Equal");
}else{
System.out.println("two strings are lexicographically not Equal");
}
}
}
