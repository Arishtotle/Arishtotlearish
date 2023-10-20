import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class day8_1{

public static void main(String[] args){

String str="Arish1234";
Pattern p=Pattern.compile("^[a-z,A-Z,0-9]*$");
Matcher m=p.matcher(str);
if(m.matches()){

System.out.println("the String contains only specified characters");
}else{
System.out.println("The string contains some other Special characters too");
}
}
}

