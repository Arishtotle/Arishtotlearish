public class Zig_Zag{

public static void main(String[] args){

int[] ar={1,5,4};

int count=0;

for(int i=1;i<ar.length;i++){
if(i%2==0){
if(ar[i-1]<ar[i] || ar[i-1]<ar[i+1]  && i <=ar.length-2  ){
count++;
break;
}
}else{
if(ar[i-1]>ar[i] || ar[i-1]>ar[i+1] && i <= ar.length-2 ){
count++;
break;
}
}
}
System.out.println(count);
}
}
