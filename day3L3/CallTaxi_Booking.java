import java.util.*;

class Taxi{

int TaxiNumber;
char Currentloc;
int Balance;
double Time;

public Taxi(int TaxiNumber){

this.TaxiNumber = TaxiNumber;
this.Currentloc="A";
this.Balance=0;
this.Time=6.00;
}
public char Getlocation(){
return Currentloc;
}

public int Getbalance(){
return Balance;
}
public double Getime(){
return Time;
}

}

}

class Booking{

int CustomerID;
char PickUpLocation;
char DropLocation;
double PickupTime;

     public booking(int CustomerID,char PickUpLocation,char DropLocation,double PickupTime){
	this.Customerid=CustomerID;
	this.PickUpLocation=PickUpLocation;
	this.DropLocation=DropLocation;
	this.PickupTime=PickupTime;
   }
    public int GetCustomerID(){
	return CustomerID;
   }
    public char GetPickUpLocation(){
	return PickUpLocation;
   }
    public char GetDropLocation(){
	return DropLocation;
   }
    public int GetPickupTime(){
	return PickupTime;
   }

}


public class CallTaxi_Booking{


public static void main(String[] args){


ArrayList<Taxi> TaxiList=new ArrayList<>();

    for(int i=1;i<=4;i++){
       Taxi taxi=new Taxi(i);
       TaxiList.add(Taxi);
    }

System.out.println("Hey I'm here to Book Taxi");


ArrayList<Customer> Users=new ArrayList<>();

for(int j=1;j<=3;j++){
CustomerID=users.add(i);
System.out.println("Enter the pickup location");
char P=sc.next().charAt(0);
System.out.println("Enter the drop location");
char D=sc.next().charAt(0);
System.out.println("Enter the pickup Time");
double T=sc.nextDouble();
}
Booking b=new Booking(CustomerID,P,D,T);


}
}