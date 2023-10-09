import java.util.*;

public class SumofString{

public static String DigitTotal(String s,int k){

while(s.length()>k){

String trp="";
for(int i=0;i<s.length();i++){
int sum=0,count=0;
while(i<s.length() && count<k){
sum+=s.charAt(i++)-'0';
count++;
}
trp+=Integer.toString(sum);
i--;
}
s=trp;
}
return s;
}

public static void main (String[] args){
String s="11111222223";
int k=3;
String out=DigitTotal(s,k);
System.out.println(out);
}
}
