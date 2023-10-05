public class Reverse{
   public static void main(String[] args){
int n=4,i=1,update=1;

while(i!=0){
for(int j=i;j>1;j--){
System.out.print(j);
}
for(int j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();

if(i==n){
update=-1;
}

i=i+update;

}


}
}
