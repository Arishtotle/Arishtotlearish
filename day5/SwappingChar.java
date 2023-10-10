public class SwappingChar{
public static void main(String[] args){
String a="Arishtotle";
int l=a.length();
String b=new String();
for(int i=0;i<l-2;i++){
 b+=a.charAt(i);
}
b+=a.charAt(l-1);
b+=a.charAt(l-2);
System.out.println(b);
}
}

