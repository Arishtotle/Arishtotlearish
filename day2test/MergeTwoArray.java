import java.util.*;

public class MergeTwoArray{
public static void main(String[] args){

int[] ar1={2,3,3,4,5,7,9};
int[] ar2={1,2,4,5,7,7,9};
int[] ar3=new int[ar1.length+ar2.length];
for(int i=0;i<ar1.length;i++){
ar3[i]=ar1[i];

}
for(int j=0;j<ar2.length;j++){
ar3[ar1.length+j]=ar2[j];

}
Arrays.sort(ar3);

for(int k=0;k<ar3.length;k++){
//System.out.print(ar3[k]);

if(ar3[k-1]!=ar3[k]){

System.out.print(ar3[k]);

}
if(ar3[k+1]==ar3[k]){
continue;
}
}
}
}

