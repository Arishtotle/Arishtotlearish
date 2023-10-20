class Mythread extends Thread{

  public Mythread(String s){
super(s);
}
public void run(){
try {
for(int j=0;j<S.length;j++){
sleep(10000);
System.out.println("thread execution done here");
}
}catch(Exception e){}
}
}
public class Myclass implements Runnable{
public static void mian(String[] args){

Thread t=new Mythread("s");
t.start();
t.setName("Myclass");
}
}

