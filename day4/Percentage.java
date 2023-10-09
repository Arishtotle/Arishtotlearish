abstract class Marks{
  public abstract double getPercentage();
}
class StudentA extends Marks{
double m1,m2,m3;
StudentA(double m1,double m2,double m3){
this.m1=m1;
this.m2=m2;
this.m3=m3;
}
public double getPercentage(){
return (m1+m2+m3)/3;
}
}
class StudentB extends Marks{
double m1,m2,m3,m4;
  StudentB(double m1,double m2,double m3,double m4){
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.m4=m4;
}
public double getPercentage(){
return (m1+m2+m3+m4)/4;
}
}
public class Percentage{
public static void main(String[] args){
StudentA s1=new StudentA(55,56,67);
StudentB s2=new StudentB(55,56,67,98);
System.out.println(s1.getPercentage());
System.out.println(s2.getPercentage());
}
}

