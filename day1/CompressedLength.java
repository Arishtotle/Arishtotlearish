public class CompressedLength{

public static void main(String[] args){

int [] i={1,2,3,4};

for(int k=1;k<i.length;k+=2){
for(int j=0;j<i[k-1];j++){

System.out.print(i[k]);

}
}
}
}




