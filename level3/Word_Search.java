import java.util.*;

public class Word_Search{

static int n,m
static boolean [][] b;
static char[][] ch;
static[] int row={-1,0,1,0};
static[] int col={0,1,0,-1};


public static boolean out(int i,int j,String s,int in){
if(in==s.length()){
return true;
}
b[i][j]=true;
for(int l=0;l<4;l++){
out(row[l]+i,col[l]+j,s,ind+1);
}
b[i][j]=false;

return true;
}

 public static void main(String[] args){
 
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 m=sc.nextInt();
 
  ch=new char[n][m];
   b=new boolean[n][m];
 System.out.println("enter the char board to find the words ");
 for(int i=0;i<n;i++){
 for(int j=0;j<m;j++){
 ch[i][j]=sc.nextInt();
 }
 }
 System.out.println("enter number of words to be find and words ");
 int l=sc.nextInt();
 String[] s=new String[l];
 for(int i=0;i<l;i++){
 s[i]=sc.next();
 }
 ArrayList<String> al=new ArrayList<>();
 for(int k=0;k<n;k++){
 for(int i=0;i<n;i++){
 for(int j=0;j<m;j++){
 if(out(i,j,s[k],0)==true){
 al.add(s[k]);
 }
 }
 }
 }
 System.out.println(al);
 }
 }
 