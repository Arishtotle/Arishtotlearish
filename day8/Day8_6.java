import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_6{

public static void main(String[] args){

String str="Arish_1234";

Pattern p=Pattern.compile("[a-zA-Z0-9_]+$");
Matcher m=p.matcher(str);
while(m.find()){
System.out.println(m.group());
}
if(m.matches()){
System.out.println("the Given All conditions are present");
}else{
System.out.println("String contaions other that Conditions");
}
}
}
