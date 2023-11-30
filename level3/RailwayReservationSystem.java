import java.util.*;

class Ticket{
 String name;
 int ticketnumber;
 int userid;
static int ID=0;
		public Ticket(String name,int ticketnumber){
			this.name=name;
			this.ticketnumber=ticketnumber;
			this.userid=++ID;
		}
			public int getTicketNumber(){
				return ticketnumber;
			}
		public String getName(){
			return name;
		}
	public int getUserID(){
		return userid;
	}
}

class Train{
	private int trainnumber;
	private int totalseat;
	private int availableseat;
	Scanner sc=new Scanner(System.in);
		public Train(int trainnumber,int totalseat){
			this.trainnumber=trainnumber;
			this.totalseat=totalseat;
			this.availableseat=totalseat;
		}

		public int getTrainNumber(){	
			return trainnumber;
		}
		public int getTotalSeat(){
			return totalseat;
		}
		public int getAvailableSeat(){
			return availableseat;
		}

	public void booking(){
		System.out.println("enter the number od tickets to be booked");
		int noOfSeats=sc.nextInt();
	if(noOfSeats <= availableseat){
		availableseat-=noOfSeats;
		System.out.println("Tickets booked");
	}
	else{
		System.out.println("booking failed");
	}
	}
	
	public void availability(){
		System.out.println("number of ticket avilable are : "+availableseat);
         }


	public void cancellation(){
		System.out.println("please enter the user id");
		int userID=sc.nextInt();
		for(Ticket ticket:RailwayReservationSystem.user){
	if(userID==(ticket.userid)){
			System.out.println("please enter tickets number to be cancelled ");
			int ticketcancel=sc.nextInt();
				System.out.println("please enter number of tickets to be cancelled ");
					int n=sc.nextInt();
			if(ticket.ticketnumber==ticketcancel){
				if(n<=5){
					availableseat+=n;
					System.out.println("Tickets cancelled");
					
				}else{
					System.out.println("cancellation failed.only lessthan 5 ticket can be cancelled");
				}
				}else{
				System.out.println("please enter correct ticket number");
			}
			}else{
		System.out.println("please enter the correct userid");
	}

}
}
}


public class RailwayReservationSystem {

static ArrayList<Ticket> user=new ArrayList<Ticket>();


	public static void main(String[] args){

		ArrayList<Train> trains=new ArrayList<Train>();

		Scanner sc=new Scanner(System.in);

		Ticket ticket1=new Ticket("Arish",100);
		Ticket ticket2=new Ticket("deeps",101);

		user.add(ticket1);
		user.add(ticket2);

		Train train=new Train(1,50);
		trains.add(train);

      
		
boolean b=false;
		while(!b){
			System.out.println("please enter 1 for booking");
			System.out.println("please enter 2 for availability check");
			System.out.println("please enter 3 for cancellation");
			System.out.println("please enter 4 for perparerchart");
			System.out.println("please enter 5 for exit");
		
			int i=sc.nextInt();
		
			switch(i){
		case 1:
                  train.booking();
			break;
		
		case 2:
                  train.availability();
			break;
		case 3:
                  train.cancellation();
			break;
		case 4:
              //   train.prepareChart();
			break;
		case 5:
                  b=true;
			break;
                
		default :
	 		System.out.println("please select the correct number ");

			}

		}
    	}
}




