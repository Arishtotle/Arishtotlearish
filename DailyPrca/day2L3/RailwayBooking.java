import java.util.*;

public class RailwayBooking{



public static void Booking(){

Scanner sc=new Scanner(System.in);

Userdata();
Availability();
int available=20;
    System.out.println("Please enter the number of ticket you want");
    int tic=sc.nextInt();
       if(tic<=available){
           
            System.out.println("your ticket is confirmed");
            available=available-tic;
            System.out.println("Balance available tickets are "+available);
       
      }else{
            System.out.println("Please check avilability and enter available count of ticket");
      }
}
/*public static void PassengerDetials(){

Scanner sc=new Scanner(System.in);

 Booking();
     String[] passName=new String[tic];
     String [] passAge=new String[tic];

         for(int i=0;i<ticket;i++){
                String[i] passName=sc.next();
                String[i] passAge=sc.next();
                int[i] seatNumber=sc.nextInt();
          }
}*/

public static void Availability(){
  int available=20;
System.out.println("work in process");
}

public static void Cancellation(){
System.out.pritnln("Cancel working ");
}

/*public static void Chart(){
Booking();
   System.out.println("Ticket bookings are completed and Train going to start within a Hour");
   System.out.println("total number of ticket booked"+tic);
   System.out.println("Passengers Name"+passName[]);
   System.out.println("Passengers Age"+passAge[]);
   System.out.println("Passengers Seatnumber"+seatNumber[]);
}*/

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

//boolean exit=false;

//RailwayBooking rb=new RailwayBooking();

System.out.println("please select respective number "+"- 1 for Booking ticket "+"- 2 for Availability "+"- 3 for Cancellation "+"- 4 for chart "+"- 5 for exit");
System.out.println("Please enter the number");
int option=sc.nextInt();


switch(option){
case 1:
 Booking();
 break;
case 2:
  Availability();
  break;
case 3:
  Cancellation();
  break;
case 4:
 // Chart();
  break;

}
}
}