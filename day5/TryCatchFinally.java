public class TryCatchFinally{
public static void main{String[] args){
int [] ar=new int[4];
try{
int i=ar[4];
System.out.println(ar[]);
}catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("finally block code");
}
System.out.println("all blocks are runned");
}
}
