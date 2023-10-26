public class Bus {
	
int busno;
private boolean bustype;
private int capacity;

public Bus(int busno,boolean bustype,int capacity) {
	this.busno=busno;
	this.bustype=bustype;
	this.capacity=capacity;
}
public int getBusno(){
	return busno;
}
public boolean getBustype() {
	return bustype;
}
public int getCapacity() {
	return capacity;
}
public void displayBusinfo() {
	System.out.println("Bus no : "+busno+" Ac : "+bustype+" Seat Capacity : "+capacity);
}
}