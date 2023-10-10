public class ZeroSum{
public static void main(String[] args){
int num1[]={1,2,-2,3,4,5,6};
int sum=0;
boolean b=false;
for(int i=0;i<num1.length;i++){
for(int j=0;j<num1.length;j++){
for(int k=i;k<j;k++){
sum=num1[i]+num1[j];
if(sum==0){
b=true;
}
}
}
}
System.out.println(b);
}
}
