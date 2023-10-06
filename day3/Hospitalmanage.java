import java.util.Scanner;

class Doctors{

String Dis[]={"cancer","Heart Attack","Fever","Sugar","High bp","General"};
Scanner sc=new Scanner(System.in);

public void DoctorDetails(){
int n=sc.nextInt(); 
switch(n){
case 1:
System.out.println("Doctor Muthu,Phone=9865321452,Roomno-32");
break;
case 2:
System.out.println("Doctor Sree,Phone=9878321452,Roomno-11");
break;
case 3:
System.out.println("Doctor Arish,Phone=9865378452,Roomno-25");
break;
case 4:
System.out.println("Doctor Sakarapandi,Phone=9865325452,Roomno-15");
break;
case 5:
System.out.println("Doctor Perumal,Phone=9865321052,Roomno-10");
break;
case 6:
System.out.println("Doctor John,Phone=9865312452,Roomno-1");
break;
default:
System.out.println("Currently no Doctor Available for this .Thank you");
break;
}
}
}
class Patient{
String name,phone,Address,age,patientID,Problem;
public void PatientDetails(String name,String phone,String Address,String age,String PatientID,String Problem){
System.out.println(name+" "+phone+" "+Address+" "+age+" "+patientID+" "+Problem);
}
}

public class Hospitalmanage{
public static void main(String[] args){
Patient pt=new Patient();
pt.PatientDetails("kanna","7998546625","kerala","58","1202","cancer");
Doctors Dr=new Doctors();
Dr.DoctorDetails();
}
}



