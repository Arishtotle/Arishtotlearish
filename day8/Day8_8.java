import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_8{

public static void main(String[] args){

String str="There are many languages like python to build a application";

System.out.println(Containspython(str));
if(Containspython(str)){
System.out.println("java");
}else{
System.out.println("C++");
}
}
public static boolean Containspython(String str){
Pattern p=Pattern.compile("\\bpython",Pattern.CASE_INSENSITIVE);
Matcher m=p.matcher(str);


return m.find();
}

}



