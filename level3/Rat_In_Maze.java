import java.util.*;

public class Rat_In_Maze{

public static void main(String[] args){

Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int[][] ar=new int[n][m];
int[][] ar1=new int[n][m];
int l=0,k=0;

for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
ar[i][j]=sc.nextInt();
}
}

for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
ar1[i][j]=0;
}
}
boolean b=false;
ar1[l][k]=1;
while(!b){
if(ar[l][k+1]==1 && k != m){
k=k+1;

if(ar[l][k]==1){
ar1[l][k]=1;
}
}else if(ar[l+1][k]==1 && l != n){
l=l+1;
if(ar[l][k]==1){
ar1[l][k]=1;
}
}
if(l==n-1 && k==m-1){
b=true;
}
}
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
System.out.print(ar1[i][j] +" ");
}
System.out.println();
}
}
}

