public class BinaryNumbers{
public void addBinary(){
int num1=Integer.parseInt(X, 2);
int num2=Integer.parseInt(Y, 2);
int num=num1+num2;

String res=Integer.toBinaryString(num);

return res;
}
public static void main(String[] args){
String X="0101110",Y="1100101";
System.out.println(add_Binary(X,Y));
}
}

