import java.util.*;

class Red extends Thread{

public void run(){

try{
System.out.println("...........Red Signal Please Dont Cross................");
Thread.sleep(100000);
}catch(Exception e){
System.out.println(e);
}
}
}

class Greeen extends Thread{

public void run(){

try{
System.out.println("...........Green  Signal Please Go safe And Don't rash Drive................");
Thread.sleep(7000);
}catch(Exception i){
System.out.println(i);
}
}
}

class Yellow extends Thread{

public void run(){
System.out.println("...........Yellow Signal Please Get Ready For YOur Drive................");
Thread.sleep(40000);
}catch(Exception j){
System.out.println(j);
}
}
}

public class TrafficSignal{

public static void main(String[] args){

Red R=new Red();
Green G=new Green();
Yellow Y=new Yellow();

Scanner sc=new Sacnner(System.in);
System.out.pritnln("please enter time to Run the Traffic Signal as Working ");

double Time=sc.nextDouble();

if(Time>6.00 && time<22.00){

R.start();
G.start();
Y.start();
}else{
System.out.println("please enter the correct Working time between 6 to 22");
}
}
}