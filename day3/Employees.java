public class Employees{
public static void main(String[] args){

Employee Ep1=new Employee("Robert","1994","64c-WallsStreet");
Employee Ep2=new Employee("Ashwin","2000","68D-WallsStreet");
Employee Ep3=new Employee("John","1999","26B-WallsStreet");
System.out.println("name   "+"   Year of Joining  "+"   Address   ");
Ep1.Empdetails();
Ep2.Empdetails();
Ep3.Empdetails();


}
}
class Employee{
String name,yoj,Address;
public Employee(String name,String yoj,String Address){
this.name=name;
this.yoj=yoj;
this.Address=Address;
}

public void Empdetails(){

System.out.println(name+"---|---"+yoj+"---|---"+Address);
}
}
