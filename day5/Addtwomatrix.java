import java.util.*;

public class Addtwomatrix{
public static void main(String[] args){

int i[][]={{1,2,3},{4,5,6},{7,8,9}};
int j[][]={{9,8,7},{6,5,4},{3,2,1}};
int i1=i.length-1;
int j1=j.length-1;

int[][]  k=new int [i1][j1];
for(int s=0;s<=i1;s++){
for(int r=0;s<=j1;r++){
k[s][r]=i[s][r]+j[s][r];
}
}
System.out.print(Arrays.toString(k));
}
}

