public class Operationsperform{

public static void main(String[] args){

String[] n={"++X","++X","X++"};
int X=0;

for(int i=0;i<n.length;i++){
if(n[i] == "--X"){
--X;
}else if(n[i] == "++X"){
++X;
}else if(n[i] == "X++"){
X++;
}else{
X--;
}
}
System.out.println(X);
}
}
