class Mythread extends Thread{

public Mythread(String name){
super(name);

}

String[] s={"java","aromatic","invigoratting"};
public void run(){
try{

for(int i=0;i<=s.length;i++){
sleep(100000);
System.out.println(getName()+" "+s[i]);
}
}catch(Exception e){}
}
}
public class ConcurTwoThread{
public static void main(String[] args){
Mythread mt=new Mythread("T1");
Mythread mt2=new Mythread("T2");
mt.start();
mt2.start();
}
}

