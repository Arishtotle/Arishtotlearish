import java.util.*;

public class ElectriBill_Generation{

public static void UserDetails(){

Scanner sc=new Scanner(System.in);

         System.out.println("Please Enter the user name and EBID");
         String Name=sc.next();
         long EBID=sc.nextLong();
         System.out.println("User Name : "+Name);
         System.out.println("User EB-ID : "+EBID);
}

public static void main(String[] args){

ElectriBill_Generation EB=new ElectriBill_Generation();
EB.UserDetails();

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Connection type as Domestic or Commercial");
String Type=sc.next();
double cost;
if(Type.equalsIgnoreCase("Domestic")){
{
   System.out.println("Enter the Total Watts used");
   double Watt=sc.nextDouble();
  if(Watt<=100 && Watt>=0){
  System.out.println("There is no Fee if less than 100 watts");
   }else if(Watt<=200 && Watt>=100){
     cost=Watt*2;
  System.out.println("Cost for EB is : "+cost);
  }else if(Watt<=300 && Watt>=200){
     cost=Watt*4;
  System.out.println("Cost for EB is : "+cost);
  }else if(Watt<=400 && Watt>=300){
     cost=Watt*6;
  System.out.println("Cost for EB is : "+cost);
  }else if(Watt>=400){
     cost=Watt*7.5;
  System.out.println("Cost for EB is : "+cost);
  }
System.out.println("please Pay the bill within 15 days");
}

}else if(Type.equalsIgnoreCase("Commercial")){{
   System.out.println("Enter the Total Watts used");
   double Watt=sc.nextDouble();
  if(Watt<=100 && Watt>=0){
    cost=Watt*1.5;
  System.out.println("Cost for EB is : "+cost);
   }else if(Watt<=200 && Watt>=100){
     cost=Watt*2.5;
  System.out.println("Cost for EB is : "+cost);
  }else if(Watt<=300 && Watt>=200){
     cost=Watt*3.5;
  System.out.println("Cost for EB is : "+cost);
  }else if(Watt<=400 && Watt>=300){
     cost=Watt*5.5;
  System.out.println("Cost for EB is : "+cost);
  }else if(Watt>=400){
     cost=Watt*7.5;
  System.out.println("Cost for EB is : "+cost);
  }
System.out.println("please Pay the bill within 15 days");
}
}else{
System.out.println("Please enter the Correct Connection Type ");

}


}
}