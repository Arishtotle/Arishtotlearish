import java.util.*;

public class SalaryGeneration{


public static void Netsalary(){

Scanner sc=new Scanner(System.in);

System.out.println("Please enter the basic salary of Emp:");
double BasicSalary=sc.nextDouble();

double DA=BasicSalary*0.12;
double HRA=BasicSalary*0.0125;
double TA=BasicSalary*0.01;
double Others=BasicSalary*0.0375;
double PF=BasicSalary*0.14;
double IT=BasicSalary*0.15;


double Netsalary=BasicSalary+DA+HRA+TA+Others-(PF+IT);

System.out.println("Basic Salary : $ "+BasicSalary);
System.out.println("DA : $ "+DA);
System.out.println("HRA : $ "+HRA);
System.out.println("TA : $ "+TA);
System.out.println("Others : $ "+Others);
System.out.println("PF : $ "+PF);
System.out.println("IT : $ "+IT);
System.out.println("Net salary : $ "+Netsalary);

}
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Please enter the Emplyoee Name");
String EmpName=sc.next();



SalaryGeneration sg=new SalaryGeneration();
sg.Netsalary();
}
}