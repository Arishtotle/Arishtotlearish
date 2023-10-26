import java.util.ArrayList;
import java.util.Scanner;

public class BusReservation {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> book=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,45));
		for(Bus b:buses) {
			b.displayBusinfo();
		}
		
		Scanner sc=new Scanner(System.in);
		boolean b=false;
		
		while(!b) {
			System.out.println("please enter 1 for booking ");
			System.out.println("please enter 2 for exit");
			
			System.out.println("\n please enter the number : \n");
			int n=sc.nextInt();
			switch(n) {
			case 1:
				Booking booking=new Booking();
				if(booking.isavailable(buses,book)) {
					book.add(booking);
					System.out.println("your booking confirmed");
				}else {
					System.out.println(" please try other buses ...your booking failed here");
				}
				break;
			case 2:
				b=true;
				break;
			default:
			    System.out.println("please enter the correct number ..try again ..");		
					}
		}
		}

}
