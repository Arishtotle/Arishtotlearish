class Subclass{

public int MSG()throws Exception{

int i=10/0;
return i;

}
}
public class BaseSubException extends Subclass{
public static void main(String[] args){
try{

int ar[]=new int[3];
//int ar[4]=4;
System.out.println(ar[4]);

} catch (Exception e){
System.out.println(e);
}



Subclass sub=new Subclass();

//System.out.println(sub.MSG());
}
}
