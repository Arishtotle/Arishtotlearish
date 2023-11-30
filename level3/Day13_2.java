
public class Day13_2{

public static void main(String[] args){


int cur=1;
int multi=1;
for(int i=0;i<ar.length;i++){
cur *=ar[i];
for(int j=i+1;j<ar.length;j++){

multi *=ar[j];
}
ar[i]=multi;
multi=cur;
}
System.out.print("{");
for(inti=0;i<ar.length;i++){
System.out.print(ar[i]+"'");
}
System.out.print("}");


}
}