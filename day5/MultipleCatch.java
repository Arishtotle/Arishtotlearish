public class MultipleCatch{
public static void main(String[] args){
try{
int[] ar=new int[-1];


}catch(Exception e){
System.out.println(e);
}
try{
int a=10/0;
}catch(Exception i){
System.out.println(i);
}
System.out.println("Two Try Catch Method also Implemented");
}
}