import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_11{

public static void main(String[] args){


String pin1="123456";
String pin2="12345";
String pin3="1234";
String pin4="12345678";

System.out.println(" The First pin is :"+ValidatePin(pin1));
System.out.println(" The Second pin is :"+ValidatePin(pin2));
System.out.println(" The Third pin is :"+ValidatePin(pin3));
System.out.println(" The Fourth  pin is :"+ValidatePin(pin4));



}
public static boolean ValidatePin(String pin){

Pattern p=Pattern.compile("\\d{4}|\\d{6}|\\d{8}");

Matcher m=p.matcher(pin);

return m.matches();
}
}
