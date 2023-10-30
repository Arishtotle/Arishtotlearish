import java.util.*;

public class Customer {
private int customerId;
private char frompoint;
private char topoint;
public Customer(int customerId, char frompoint, char topoint) {
	this.customerId = customerId;
	this.frompoint = frompoint;
	this.topoint = topoint;
}
public int getCustomerId() {
	return customerId;
}

public char getFrompoint() {
	return frompoint;
}

public char getTopoint() {
	return topoint;
}

}
public class Taxi {
private int taxino;
private int earning;
private char currentpoint;
private char droppoint;
private int droptime;
private int amount;
public Taxi(int taxino) {
	this.taxino = taxino;
	this.earning = 0;
	this.currentpoint = 'A';
	this.droppoint ='A';
	this.droptime = 0;
	this.amount = 0;
}

public int getEarning() {
	return earning;
}

public void taxiCustomer(Customer customer,int pickuptime) {
	this.currentpoint=customer.getFrompoint();
	this.droppoint=customer.getTopoint();
	int distance=Math.abs(droppoint-currentpoint)*15;
	int traveltime=distance*4;
	this.droptime=pickuptime+traveltime/60;
	this.amount=amount+100+(distance-5)*10;
	this.earning=earning+amount;
	System.out.println("taxi number is : "+taxino+"is assigned for customer : "+customer.getCustomerId());
	}
public void displayDetailsOfTaxiEarning() {
	System.out.println("Taxi number is : "+taxino+" total earning of taxi : "+earning);
}
}
public class TaxibookingSystem {

	public static void main(String[] args) {
		List<Taxi> taxis=new ArrayList<>();
		for(int i=1;i<=4;i++) {
			taxis.add(new Taxi(i));
		}
		Customer customer1=new Customer(1,'A','B');
		Customer customer2=new Customer(2,'B','D');
		Customer customer3=new Customer(3,'B','C');
		taxis.get(0).taxiCustomer(customer1,9);
		taxis.get(1).taxiCustomer(customer2,9);
		taxis.get(0).taxiCustomer(customer3,11);
		for(Taxi taxi:taxis) {
			taxi.displayDetailsOfTaxiEarning();
		}
	}

}
