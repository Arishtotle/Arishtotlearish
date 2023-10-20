import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_10{

public static void main(String[] args){

double num=143.143143143143;
int decicount=CountDecimal(num);

System.out.println(decicount);

}
public static int CountDecimal(double num){

String numstr=String.valueOf(num);

Pattern p = Pattern.compile("\\.\\d+");
Matcher m=p.matcher(numstr);
int count=0;
while(m.find()){
count=count+m.group().length();
}
return count;
}
}
