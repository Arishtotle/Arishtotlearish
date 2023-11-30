import java.util.*;

public class Boggle_Board{

static int n,m,q;
static char[][] ch=new char[10][10];
static String[] word=new String[10];
static boolean[][] vis=new boolean[10][10];
static int[] row={-1,-1,-1,0,0,1,1,1};
static int[] col={-1,0,1,-1,1,-1,0,1};


public static boolean fun(int r,int c,String word,int i){
if(i==word.length()) return true;
if(r<0 || c<0 || r>n-1 || c>n-1 || ch[r][c]!=word.charAt(i) || vis[r][c] == true) return false;

vis[r][c]=true;
boolean ans=false;
for(int k=0;k<8;k++){
ans |=fun(r+row[k],c+col[k],word,i+1);
}
vis[r][c]=false;
return ans;


}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=sc.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
ch[i][j]=sc.next().charAt(0);
}
}
System.out.pritnln("please enter no of words to find ");
q=sc.nextInt();
for(int i=0;i<q;i++){
word[i]=sc.next();
}
ArrayList<String> al=new ArrayList<>();
for(int i=0;i<q;i++){
boolean has=false;
for(int r=0;r<n;r++){
for(int c=0;i<m;c++){
	has |=fun(r,c,word[i];0);
}
}
if(has){
al.add(word[i]);
}
}
System.out.println(al);


}
}
