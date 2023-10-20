import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_5{

public static void main(String[] args){

String str="gold digger game going good gang";

Pattern p=Pattern.compile("\\b\\w+g\\w+\\b");

Matcher m=p.matcher(str);

while(m.find()){
System.out.println(m.group());
}

}
}
