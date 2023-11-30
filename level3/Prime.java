public class Prime{

public static void main(String[] args){

int x,y,z;
int n=10;
for(x=1;x<n;x++){

if(x==0 || x==1){
continue;
}
z=1;
for(y=2;y<=x/2;++y){

if(x%y==0){
z=0;
break;
}

}
if(z==1){
System.out.println(x);
}
}
}
}
