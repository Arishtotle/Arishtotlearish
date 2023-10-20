class Mythread extends Thread{

public Mythread(String s){
super(s);
}
public void run(){
try{
for(int i=0;i<=2;i++){
System.out.println(getName()+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{}
}
}
public class TwoThread{
public static void main(String[] args){
Mythread mt=new Mythread("T1");
Mythread mt2=new Mythread("T2");
mt.start();
mt2.start();
try{
mt.sleep(10000);
}catch(Exception o){}
mt.setName("Arish");
System.out.println(mt.getName());
}
}

