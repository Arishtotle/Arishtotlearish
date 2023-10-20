public class RankBasedArraySort{
public static void main(String[] args){
int[] ar={1,5,6,3,10};
int[] ra={100,0,1,100,2};
int temp = 0; 
int temp1=0; 
if(ar.length== ra.length){
for(int i=0; i <ra.length; i++){  
for(int j=1; j < (ra.length-i); j++){  
if(ra[j-1] > ra[j]){                                     
temp = ra[j-1];  
ra[j-1] = ra[j];  
ra[j] = temp;
  temp1 = ar[j-1];  
  ar[j-1] = ar[j];  
  ar[j] = temp1;

}  
}
}  

}

for(int i=0;i<ar.length;i++){
System.out.print(ar[i]);
}
}
}
