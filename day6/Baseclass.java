class Mythread extends Thread{

    public Mythread(String name){

        super(name);
        System.out.println(getName());
    this.run();
}
   public void run(){
      for(int i=0;i<2;i++){
try{
          Thread.sleep(500);
}catch(Exception c){

}

         System.out.println("run method "+i);
}
}
}
public class Baseclass {
public static void main(String[] args){

Mythread mt=new Mythread("Mythread");
mt.setName("Arish");
for(int i=0;i<=1;i++){
System.out.println("main thread "+i);
}
}
}
