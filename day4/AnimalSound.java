abstract class Animal{
    public abstract void sound();
}
class Cats extends Animal{
    public void sound(){
         System.out.println("cat meow");
      }
}
class Dogs extends Animal{
    public void sound(){
         System.out.println("Dog bark");
      }
}
public class AnimalSound{
public static void main(String[] args){
 Cats c=new Cats();
 Dogs d=new Dogs();
c.sound();
d.sound();

}
}
