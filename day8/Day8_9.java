import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_9{

public static void main(String[] args){


String str="There are nine planets in the solar system";

String str2=RemoveVowels(str);
System.out.println(str2);


}
public static String RemoveVowels(String str1){

return str1.replaceAll("[aeiouAEIOU]"," ");
}
}
