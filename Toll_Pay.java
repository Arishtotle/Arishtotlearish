import java.util.*;

class Vehicle{
	
	int start;
	int end;
	boolean vip;
	String vtype;
	String vnumber;
	int amount;
	public Vehicle(int start,int end,boolean vip,String vtype,String vnumber){
		this.start=start;
		this.end=end;
		this.vip=vip;
		this.vtype=vtype;
		this.vnumber=vnumber;
        this.amount=0;		
	}
	public Vehicle(boolean vip,String vtype,String vnumber,int amount){
		this.vip=vip;
		this.vtype=vtype;
		this.vnumber=vnumber;
		this.amount=amount;
	}
	
}
public class Toll_Pay{
		
	public static void tollPlaza(List<Vehicle> vehicle,List<Vehicle> toll_1,List<Vehicle> toll_2,List<Vehicle> toll_3){
		int tollfee=0;
		for(Vehicle v:vehicle){
		if(v.start<=1 && v.end>=1){
			if(v.vtype.equals("car")){
				if(v.vip==true){
				tollfee=80;
				v.amount=v.amount+tollfee;
				toll_1.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));
				System.out.println("passed");
				}else{
				tollfee=100;
				v.amount=v.amount+tollfee;	
				toll_1.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));	
				}
				
			}else if(v.vtype.equals("truck")){
				if(v.vip==true){
					tollfee=160;
					v.amount=v.amount+tollfee;
				toll_1.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));
					
				}else{
					tollfee=200;
					v.amount=v.amount+tollfee;	
				toll_1.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));	
				}
			}
		}
		if(v.start<=2 && v.end>=2){
			if(v.vtype.equals("car")){
				if(v.vip==true){
				tollfee=80;
				v.amount=v.amount+tollfee;
				toll_2.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));
				}else{
				tollfee=100;
				v.amount=v.amount+tollfee;	
				toll_2.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));	
				}
				
			}else if(v.vtype.equals("truck")){
				if(v.vip==true){
					tollfee=160;
					v.amount=v.amount+tollfee;
				toll_2.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));
					
				}else{
					tollfee=200;
					v.amount=v.amount+tollfee;	
				toll_2.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));	
				}
			}
		}
			
		
		if(v.start<=3 && v.end>=3){
			
			if(v.vtype.equals("car")){
				if(v.vip==true){
				tollfee=80;
				v.amount=v.amount+tollfee;
				toll_3.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));
				}else{
				tollfee=100;
				v.amount=v.amount+tollfee;	
				toll_3.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));	
				}
				
			}else if(v.vtype.equals("truck")){
				if(v.vip==true){
					tollfee=160;
					v.amount=v.amount+tollfee;
				toll_3.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));
					
				}else{
					tollfee=200;
					v.amount=v.amount+tollfee;	
				toll_3.add(new Vehicle(v.vip,v.vtype,v.vnumber,tollfee));	
				}
			}
		}
				
		}
	}
		
		
	
	
	
	public static void displayVehicle(List<Vehicle> vehicle){
		System.out.println("Start from      End At          Is VIP       Vehicle Type      Vehicle Number   Amount Paid");
		for(Vehicle v:vehicle){
		System.out.println(v.start+"             "+v.end+"             "+v.vip+"              "+v.vtype+"             "+v.vnumber+"         "+v.amount);
		}
	}
	public static void displayToll_1(List<Vehicle> toll_1){
		System.out.println("Is VIP       Vehicle Type      Vehicle Number   Amount Paid");
		for(Vehicle v:toll_1){
		System.out.println(v.vip+"            "+v.vtype+"             "+v.vnumber+"            "+v.amount);
		}
	}
	public static void displayToll_2(List<Vehicle> toll_2){
		System.out.println("Is VIP       Vehicle Type      Vehicle Number   Amount Paid");
		for(Vehicle v:toll_2){
		System.out.println(v.vip+"            "+v.vtype+"            "+v.vnumber+"            "+v.amount);
		}
	}
	public static void displayToll_3(List<Vehicle> toll_3){
		System.out.println(" Is VIP       Vehicle Type      Vehicle Number   Amount Paid");
		for(Vehicle v:toll_3){
		System.out.println(v.vip+"            "+v.vtype+"             "+v.vnumber+"           "+v.amount);
		}
	}
	
	public static void shortestPath(List<Vehicle> vehicle){
		System.out.println("shortest path foe ypur route is ");
		for(Vehicle v:vehicle){
		int s=v.start;
		int e=v.end;
		System.out.println(e-s);
		}
	}
	static List<Vehicle> vehicle=new ArrayList<>();
	static List<Vehicle> toll_1=new ArrayList<>();
	static List<Vehicle> toll_2=new ArrayList<>();
	static List<Vehicle> toll_3=new ArrayList<>();
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		
	vehicle.add(new Vehicle(1,3,true,"car","Tn-32-1698"));
	vehicle.add(new Vehicle(2,3,false,"truck","Tn-32-3454"));
	
	
	boolean b=false;
	while(!b){
		System.out.println("1.Pass vehicle "+"\n2.Display vehicles "+"\n3.Display Toll-1 "+"\n4.Display Toll-2 "+"\n5.Display Toll-3 "+"\n6.Shortest Path."+"\n7.Exit "+"\n please select the option to continue");
		
		int num=sc.nextInt();
		switch(num){
			case 1:
			tollPlaza(vehicle,toll_1,toll_2,toll_3);
			break;
			case 2:
			displayVehicle(vehicle);
			break;
			case 3:
			displayToll_1(toll_1);
			break;
			case 4:
			displayToll_2(toll_2);
			break;
			case 5:
			displayToll_3(toll_3);
			break;
			case 6:
			shortestPath(vehicle);
			break;
			case 7:
			b=true;
			break;
			default:
			System.out.println("please select the vald option to continue");
			break;
		}
	}
	}
}