import java.util.*;

public class BricksAndBalls{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int l=sc.nextInt();

String[][] ar=new String[l][l];

for(int i=0;i<l;i++){
for(int j=0;j<l;j++){
if(i==0 || j==0 || i==l-1 || j==l-1){
ar[i][j]="w";

}else{
ar[i][j]=" ";
}
for(int k=0;k<l;k++){
ar[l-1][k]="g";
}

ar[l-1][l/2]="o";
System.out.print(ar[i][j]);
}
System.out.println(" ");

}
}


}
