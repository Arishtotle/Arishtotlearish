import java.util.*;

class User{
int parkingslot;
int parkingtime;
String vehiclenumber;
public User(){
}

static List<User> users=new ArrayList<User>();

public User(String vehiclenumber){
this.parkingslot=parkingslot;
this.parkingtime=paringtime;
this.vehiclenumber=vehiclenumber;
}


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(int parkingTime) {
        this.parkingTime = parkingTime;
    }

    public int getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(int parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

}

class Bike{

int bikeSlotnumber;
int bikeSlotcapacity;
int bikeHourcash;
static Scanner sc=new Scanner(System.in);
		public Bike(){
		}
	public Bike(int bikeSlotnumber){
		this.bikeSlotnumber=bikeSlotnumber;
		this.bikeSlotcapacity=5;
		this.bikeHourcash=10;
	}



	public static void parkingEntryBike(List<Bike> bikeslot,List<User> users){
			for(Bike b:bikeslot){
			for(User u:users){
			System.out.println("please enter the slot number to park the Bike");

				int slot=sc.nextInt;
				
				if(b.bikeslotnumber==slot){
					if(b.get(slot).bikeslotcapacity>0){
						System.out.println("please enter the vehicle number ");
							String vnumber=sc.next();
						System.out.println("please enter the entery time ");
							int enttime=sc.nextInt();
							users.add(new User(vnumber);
						System.out.println("your vwhicle parked successfully .....thank you");
						break;
						b.get(slot).bikeslotcapacity=b.get(slot).bikeslotcapacity-1;
						}else{
						System.out.println("please select the other slot as the slot capacity is full");
						break;
						}

				}else{
					System.out.println("please enter the correct slot number to continue");
					break;
				}
		}
		}

	}
	public static void parkingExitBike(){





	}
	public static void findVehicleBike(List<User> users){
		for(User user:users){
			System.out.println("please enter the Vehicle number to find");
				String number=sc.next();
			if(user.vehiclenumber.equals(number){
				System.out.println("vehicle number "+user.vehiclenumber +"vehicle parked slot "+user.
				break;
			}else{
				System.out.println("please enter the correct vehicle number");
				break;
			}
		}
	}



	}



}

class Car{

int slotnumber;
int slotcapacity;
int hourcash;

	static Scanner sc=new Scanner(System.in);
		public Car(){
		}

	public Car(int slotnumber){
		this.slotnumber=slotnumber;
		this.slotcapacity=5;
		this.hourcash=50;
	}



	public static void parkingEntryCar(List<Car> carslot,List<User> users){
		for(Car b:carslot){
			for(User u:users){
			System.out.println("please enter the slot number to park the Bike");

				int slot=sc.nextInt;
				
				if(b.bikeslotnumber==slot){
					if(b.get(slot).carslotcapacity>0){
						System.out.println("please enter the vehicle number ");
							String vnumber=sc.next();
						System.out.println("please enter the entery time ");
							int enttime=sc.nextInt();
							users.add(new User(vnumber,enttime,slot0);
						System.out.println("your vwhicle parked successfully .....thank you");
						break;
						b.get(slot).carslotcapacity=b.get(slot).carslotcapacity-1;
						}else{
						System.out.println("please select the other slot as the slot capacity is full");
						break;
						}

				}else{
					System.out.println("please enter the correct slot number to continue");
					break;
				}
		}
		}




	}
	public static void parkingExitCar(List<Car> carslot,List<User> users){
		for(Car c:carslot){
			for(User u:users){
					System.out.println("please enter the vehicle number 

			}
		}
	}
	public static void findVehicleCar(List<User> users){
		for(User user:users){
			System.out.println("please enter the Vehicle number to find");
				String number=sc.next();
			if(user.vehiclenumber.equals(number){
				System.out.println("vehicle number "+user.vehiclenumber +"vehicle parked slot "+user.
				break;
			}else{
				System.out.println("please enter the correct vehicle number");
				break;
			}
		}
	}



}

public class ParkingLot{
   
  public static void main(String[] args){

	Bike bike=new Bike();
	Car car=new Car();
	List<Bike> bikeslot=new ArrayList<Bike>();
	for(int i=1;i<=25;i++){
		bikeslot.add(new Bike(i));
	}
	List<Car> carslot=new ArrayList<Car>();
	for(int i=1;i<=25;i++){
		carslot.add(new Car(i));
	}



      Scanner sc=new Scanner(System.in);
	boolean b=false,c=false,a=false;

	while(!b){
		System.out.println("\n 1.CAR "+"\n 2.BIKE "+"\n 3.Exit "+" \n Please enter the number to continue the process");
		int n=sc.nextInt();
		switch(n){
		case 1:
			while(!c){
				System.out.println("\n 1.Parking Entry "+"\n 2.Parking Exit "+"\n 3. Find Vehicle "+"\n 4.Exit "+"\n please enter the option to continue");
				int i=sc.nextInt();
					switch(i){
						case 1:
							bike.parkingEntryBike(bikeslot,users);
							break;
						case 2:
							bike.parkingExitBike(bikeslot,users);
							break;
						case 3:
							bike.findVehicleBike(users);
							break;
						case 4:
							c=true;
							break;
						default :
							System.out.println("please select the correct option to continue");
							break;
					}
				}
			break;
		case 2:
			while(!a){
				System.out.println("\n 1.Parking Entry "+"\n 2.Parking Exit "+"\n 3. Find Vehicle "+"\n 4.Exit "+"\n please enter the option to continue");
				int i=sc.nextInt();
					switch(i){
						case 1:
							car.parkingEntryCar(carslot,users);
							break;
						case 2:
							car.parkingExitCar(carslot,users);
							break;
						case 3:
							car.findVehicleCar(users);
							break;
						case 4:
							a=true;
							break;
						default :
							System.out.println("please select the correct option to continue");
							break;
					}
				}
			break;
		case 3:
			b=true;
			break;
		default :
			System.out.println("please select the correct option to continue");
			break;
		}
	}
   }
}