public class Firstnonrepeat{
public static void main(String[] args){

String s="arishtotle";
boolean b=false;
for(int i=0;i<s.length();i++){

for(int j=i+1;j<s.length();j++){

if(s.charAt(i)==s.charAt(j)){
b=true;
}
}
if(b==false){
System.out.println(s.charAt(i));
break;
}

}


}
}