public class StringLexicographical{
public static void main(String[] args){
int count =0;
String [] st={"abc","bce","cae"};
for(int k=0;k<st[0].length();k++){
boolean sorted = true;
for(int i=1;i<st.length;i++){
if(st[i-1].charAt(k) > st[i].charAt(k)) sorted = false;
}
if(!sorted) count++;
}
System.out.print(count);
}
}
