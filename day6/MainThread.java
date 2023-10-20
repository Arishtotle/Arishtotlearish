class Child extends Thread{

public void run(){
for(int i=0;i<=2;i++){
 try{
 Thread.sleep(500);
}catch(Exception e){

}
System.out.println("Run method of thread goes to Running state");

}
}
}
public class MainThread extends Child{
public static void main (String[] args){

Child c=new Child();
c.start();
for(int i=0;i<3;i++){
System.out.println("main method thread goes for running");
}
}
}
