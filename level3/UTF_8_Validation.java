import java.util.*;

public class UTF_8_Validation{

public static boolean out(int[] ar){

int count=0;

for(int data:ar){

if(count==0){

if(data >> 3 == 0b11110){
count=3;
}else if(data >> 4 ==0b1110){
count=2;
}else if(data >> 5 == 0b110){
count=1;
}else if(data >> 7 ==0b0){
count=0;
}else{
return false;
}
}else{
if(data >> 6 ==0b10){
count--;
}else{
return false;
}
}
}
return count==0;

}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++) ar[i]=sc.nextInt();
if(out(ar)) System.out.println(true);

else System.out.println(false);

}

}