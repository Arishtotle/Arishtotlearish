import java.util.*;

class Patient{

int patientId;
String patientName;
double inTime;

		public Patient(int patientId,String patientName,double inTime){
			this.patientId=patientId;
			this.patientName=patientName;
			this.inTime=inTime;
		}



}

class Hospital{
Random rand=new Random();
 double time=rand.nextDoule(rand>=2 && rand <=20);
int waittime=0;
public void consultant1(){




}
public void consultant2(){



}
public void doctor(rand){




}
public void medicalRecept(){



}

class Functions{

public void addPatients(){


System.out.println("new patients account was created");
}






}

public class HospitalManagement{
Scanner sc=new Scanner(System.in);

	public static void main(String[] args){
		Functions f=new Functions();
		boolean b=false;
		while(!b){
				System.out.println("1 for checkup in hospital \n"+" 2 for exiting the application \n"+" please enter your choice ");
				int n=sc.nextInt();
                     switch(n){

				case 1:
                        System.out.println("please enter the Patient ID");
				int searchId=sc.nextInt();
				if(searchId.equals(p.patientId)){


				}else{
					System.out.println("patient Id not found please enter 1 to create new id or press any key to exit"){
						int createid=sc.nextInt();
						if(createid==1){
						  f.addPatients();
							
						}else{
							System.out.pritnln("Patient id not founded and exiting the from here");
						}
						break;
					case 2:
						b=true;
						System.out.println("exiting the program");
						break;
					default:
						System.out.printn("please enter the correct option");
						break;
				}

			}

	}

}