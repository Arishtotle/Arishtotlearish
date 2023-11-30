import java.util.*;

public class StringEncrupt{

public static void main(String[] args){

String str="aabbc";
int n=5;
int k=26-n;
int l=str.length();
int[] ar=new int[l];

for(int i=0;i<l;i++){
int count=0;
for(int j=0;j<l;j++){
if(str.charAt(i)==str.charAt(j)){
count++;

}
}
ar[i]=count;
}

char[] ch=new char[l];
for(int i=0;i<l;i++){
if(ar[i]>=2){
ch[i]=(char)(str.charAt(i)+n);

}else if(ar[i]<=1){
ch[i]=(char)(str.charAt(i)+k);

}

}
for(int i=0;i<l;i++){
System.out.println(ch[i]);
}
}
}
