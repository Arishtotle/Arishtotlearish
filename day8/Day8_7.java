import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_7{

public static void main(String[] args){

String ipadd="192.168.001.001";

String NonzeroIpadd=RemoveZero(ipadd);
System.out.println(NonzeroIpadd);
}
public static  String RemoveZero( String ipadd){
Pattern p=Pattern.compile("(\\b|\\.)(0+)([0-9])");
Matcher m=p.matcher(ipadd);
ipadd=m.replaceAll("$1$3");

return ipadd;
}
}