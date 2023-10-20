import java.util.Scanner;

public class Test3_10{

public static void main(String[] args){

int Positive=0,Negative=0,Zero=0,Even=0,Odd=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=0;i<n;i++){
int num=sc.nextInt();
if(num==0){
Zero++;
continue;
}else if(num>0){
Positive++;
}else if(num<0){
Negative++;
continue;
}
if(num%2==0){
Even++;
}else if(num%2!=0){
Odd++;
}
}
System.out.println(Even);
}
}
