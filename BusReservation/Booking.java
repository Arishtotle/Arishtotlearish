import java.util.*;

public class Booking {

		String passengername;
		int busno;

	public Booking() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter passenger name ");
		passengername=sc.next();
		System.out.println("please enter bus number");
		busno=sc.nextInt();
	}
	public boolean isavailable(ArrayList<Bus> buses, ArrayList<Booking> book) {
		int booked=0;
		int capacity=0;
		for(Bus b:buses) {
			if(b.getBusno()==busno) {
				capacity=b.getCapacity();
			}
			
			for(Bus bus:buses) {
				if(bus.busno==busno) {
					booked++;
				}
			}
		}
		return booked<=capacity?true:false;
	}
}