import java.util.*;

class User{
int userfrom;
int userto;
int usercapacity;

public User(int userfrom,int userto,int usercapacity){
this.userfrom=userfrom;
this.userto=userto;
this.usercapacity=usercapacity;
}
}

class Lift{
	
	String liftnumber;
	int liftcapacity;
	int floornumber;
	int maintainace;
       Scanner sc=new Scanner(System.in);
	
		public Lift(){
		}
		public Lift(String liftnumber){
			this.liftnumber=liftnumber;
			this.liftcapacity=10;
			this.floornumber=0;
			this.maintainace=0;
}
		public static void liftPosition(List<Lift> lifts){
			
			for(Lift li:lifts){
				System.out.print(li.liftnumber+" ");
			}
			System.out.println();
			for(Lift le:lifts){
				System.out.print(le.floornumber+" ");
			}
		}

	public static void assignLift(List<Lift> lifts){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the floor from ");
		int from=sc.nextInt();
		System.out.println("please enter the floor to ");
		int to=sc.nextInt();
		System.out.println("please enter the total persons ");
		int capacity=sc.nextInt();
		for(Lift li:lifts){
		if(capacity<=li.liftcapacity){
			if((from>=1 && from<=5 ) && (to<=5 && to>=1)){
				int i,j;
				i=lifts.get(0).floornumber-from;
				j=lifts.get(1).floornumber-from;
				if(i<j){
				lifts.get(0).floornumber=to;
				System.out.println("lift number : "+lifts.get(0).liftnumber+" is assigned");
				}else{
				lifts.get(1).floornumber=to;
				System.out.println("lift number : "+lifts.get(1).liftnumber+" is assigned");
				}
			}else if((from>=6 && from<=10 ) && (to<=10 && to>=6)){
				int i,j;
				i=lifts.get(2).floornumber-from;
				j=lifts.get(3).floornumber-from;
				if(i<j){
				lifts.get(2).floornumber=to;
				System.out.println("lift number : "+lifts.get(2).liftnumber+" is assigned");
				}else{
				lifts.get(3).floornumber=to;
				System.out.println("lift number : "+lifts.get(3).liftnumber+" is assigned");
				}
				
			}else{
				
				lifts.get(4).floornumber =to;
				System.out.println("lift number : "+lifts.get(4).liftnumber+" is assigned");
				
			}

		break;
		}else{
		System.out.println("can't allow more user than allowed capacity......sorry");
		break;
		}

		}
	}
	     public static void liftMovingFloors(){
			System.out.println("Lift 1 and 2 Will go maximum 5th floor from ground floor");
			System.out.println("Lift 3 and 4 will go from 6th floor to 10th floor");
			System.out.println("lift 5 will go from ground floor to 10th floor");
		}   

	public static void liftUnderMaintainace(List<Lift> lifts){
		Scanner sc=new Scanner(System.in);
		for(Lift li:lifts){
		System.out.println("please enter the lift name what to go under maintainace");
		String  name=sc.next();
		if(name.equals(li.liftnumber)){
			
			lifts.remove(li.liftnumber);
		System.out.println("lift number : "+li.liftnumber+" Under maintainace ");
		break;
		}else{
		System.out.println("please enter correct lift number ");
		break;
		}
		}
	}

		public static void sameDirectionLift(List<Lift> lifts){
			Scanner sc=new Scanner(System.in);
		System.out.println("please enter the floor from ");
		int from=sc.nextInt();
		System.out.println("please enter the floor to ");
		int to=sc.nextInt();
		System.out.println("please enter the total persons ");
		int capacity=sc.nextInt();
		for(Lift li:lifts){
		if(capacity<=li.liftcapacity){
			if((from>=1 && from<=5 ) && (to<=5 && to>=1)){
				
				if(lifts.get(0).floornumber<from){
				lifts.get(0).floornumber=to;
				System.out.println("lift number : "+lifts.get(0).liftnumber+" is assigned");
				}else{
				lifts.get(1).floornumber=to;
				System.out.println("lift number : "+lifts.get(1).liftnumber+" is assigned");
				}
			}else if((from>=6 && from<=10 ) && (to<=10 && to>=6)){
				
				if(lifts.get(2).floornumber<from){
				lifts.get(2).floornumber=to;
				System.out.println("lift number : "+lifts.get(2).liftnumber+" is assigned");
				}else{
				lifts.get(3).floornumber=to;
				System.out.println("lift number : "+lifts.get(3).liftnumber+" is assigned");
				}
				
			}else{
				
				lifts.get(4).floornumber =to;
				System.out.println("lift number : "+lifts.get(4).liftnumber+" is assigned");
				
			}

		break;
		}else{
		System.out.println("can't allow more user than allowed capacity......sorry");
		break;
		}

		}
	

	}
}

public class LiftSystem{



	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		List<Lift> lifts=new ArrayList<>();
		
		lifts.add(new Lift("L1"));
		lifts.add(new Lift("L2"));
		lifts.add(new Lift("L3"));
		lifts.add(new Lift("L4"));
		lifts.add(new Lift("L5"));
		Lift lift=new Lift();
		User user=new User(8,9,8);
		boolean b=false;
	while(!b){
		System.out.println("\n1.Lift position \n"+"2.Assign Lift \n"+"3.lift moving condition \n"+"4.Lifts Under Maintainace \n"+"5. Quicklymove one floor to other\n"+"6.exit \n"+"Please enter the option ");
			int n=sc.nextInt();
	switch(n){
		case 1:
			lift.liftPosition(lifts);
			break;
		case 2:
			lift.assignLift(lifts);
			break;
		case 3:
			lift.liftMovingFloors();
			break;
		case 4:
			lift.liftUnderMaintainace(lifts);
			break;
		case 5:
			lift.sameDirectionLift(lifts);
			break;
		case 6:
			b=true;
			break;
		default:
			System.out.println(".......please enter the correct option to continue .......");
			break;
		}
	}





}
}


