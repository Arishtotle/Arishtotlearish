abstract class Parent{
 public abstract void Message();

}
class Child1 extends Parent{
      public void Message(){
                  System.out.println("this is first Subclass");
          }
}
class Child2 extends Parent{
        public void Message(){
                  System.out.println("this is second Subclass");
         }            
}

public class Absexp{

public static void main(String[] args){

 Child1 ch1=new Child1();
Child2 ch2=new Child2();
ch1.Message();
ch2.Message();
}
}
