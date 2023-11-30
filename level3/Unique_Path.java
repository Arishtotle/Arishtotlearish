import java.util.*;

public class Unique_Path{

public static void main(String[] args){

String s="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
Scanner sc=new Scanner(System.in);
int cpunt=0;
String str=sc.next();
ArrayList<String> al=new ArrayList<>();
for(int i=0;i<str.length();i++){
for(int j=i+1;j<str.length();j++){
al.add(Str.substring(i,j));

}
}
for(String out:al){
if(out.contains(s)){
count++;

}
}
System.out.println(count);

}
}
