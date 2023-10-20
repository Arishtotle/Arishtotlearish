import java.util.*;

public class Test3_4{

public static void main(String[] args){

int[] n={-1,5,4,2,0,3,1};
boolean b=false;

Arrays.sort(n);

for(int i=0;i<n.length;i++){
for(int j=i+1;j<n.length;j++){
if(n[i]<n[j]){
b=true;
continue;
}
}
}
if(!b){
System.out.println("The array is not a consecutive integer element");
}else{
System.out.println("The array is a consecutive integer element");
}
}
}

