class Visit{
 public static int Totalper(int T){
 return T;
}
public int Totalper(int T, int H){
return T+H;
}
}
public class Preventloading{
public static void main (String[] args){
Visit Vs=new Visit();
Visit Vs1=new Visit();
Vs.Totalper(4);
Vs1.Totalper(4,5);//method Overloading Cannot be prevented ....
System.out.println(Vs.Totalper(4));
System.out.println(Vs1.Totalper(4,5));
}
}
