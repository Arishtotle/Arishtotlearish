public class ReplaceSubstring{
public static void main(String[] args){
String s="The quick brown fox jump over the lazy dog";
String[] m=s.split(" ");
for(int i=0;i<m.length;i++){
if(m[i].equals("fox")){
m[i]="cat";
}
}
String convert="";
for(String C:m){
convert=convert+" "+C;
}
System.out.println(convert);
}
}
