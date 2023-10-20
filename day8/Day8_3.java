import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Day8_3{

public static void main(String[] args){

String str="the_sentence_enterer_here_has_no_space_instead_of_space_UnderScope_is_used";

Pattern p=Pattern.compile("\\b[a-z]+_[a-z]+\\b");
Matcher m=p.matcher(str);
while(m.find()){
System.out.println(m.group());
}
}
}


