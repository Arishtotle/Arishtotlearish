import java.util.*;

public class Mean{

   public static void main(String[] args){

    int[] n =  {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
    Arrays.sort(n);
    int c = (int)(n.length*0.05);
    int sum =0 ;
    for(int i=c;i<n.length-c;i++){
      sum+=n[i];
    }
    
    double ans = (double)sum/(n.length-2*c);
    
    System.out.printf("%.5f", ans);
   }

}