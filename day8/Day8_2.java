import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_2{

public static void main(String[] args){

String str="aggghhck0qq00qqqq";
boolean b=false;
Pattern p=Pattern.compile("[a-p]| 0|q+");
Matcher m=p.matcher(str);
if(m.matches()){
b=true;
}
while(m.find()){
System.out.println(m.group());
}
if(!b){
System.out.println("true");
}else{
System.out.println("false");
}
}
}
