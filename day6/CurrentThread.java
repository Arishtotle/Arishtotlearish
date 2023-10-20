public class CurrentThread{
public static void main(String[] args){

     Thread T=new Thread();
        System.out.println("name "+T.getName());
        System.out.println("id "+T.getId());
       
       // System.out.println("name "+T.setName("Arish"));//name can't be set in void type.
        System.out.println("name "+T.getName());
}
}
