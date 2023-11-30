import java.util.*;

public class K_Closest_point_origin{

public static void main(String[] args){


Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int m=sc.nextInt();
int k=sc.nextInt();
int[][] ar=new int[n][m];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
ar[i][j]=sc.nextInt();
}
}
int[] out=new int[m];
ArrayLIst<> al=new ArrayList<>();
for(int i=0;i<m;i++){
int ans=0;
for(int j=0;j=<n;j++){
int o=ar[i][j];
int l=Math.pow(o,2);
ans=ans+l;
if(j==n-1){
out[i]=ans;
}
}
}


}

}
