class Table{
public final void Total(){
System.out.println("total NUmbers Are 12"
}
}
class Chair extends Table{
public void Total(){
System.out.println("Total is 15");//can prevent the metho using final keyword
}
}

public class Preventriding{
public static void main(String[] args){

Chair T=new Chair();
T.Total();
}
}
