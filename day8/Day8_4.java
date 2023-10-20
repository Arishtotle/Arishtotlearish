import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_4{

public static void main(String[] args){

String str="pamdhkclkasclislkll xosihslkskjaicls ilsjaslllsklhioosklhkq";

Pattern p=Pattern.compile("p.*q");
Matcher m=p.matcher(str);
while(m.find()){
System.out.println(m.group());
}
}
}
