import java.util.*;

class Coach{

static Scanner sc=new Scanner(System.in);

public static void addNewCoach(){
System.out.println("please enter number of new Coach to be added ");
int n=sc.nextInt();
if(n>0){
Cabin c=new Cabin();
c.addNewCabin();
}
}
}

class Cabin{

static Scanner sc=new Scanner(System.in);

static int ub=2;
static int lb=2;
static int mb=2;
static int rac=2;
static int sb=1;
public static void addNewCabin(){

System.out.println("please enter the number of new cabin to be added ");
int n=sc.nextInt();
if(n>0){
ub=ub*n;
lb=lb*n;
mb=mb*n;
rac=rac*n;
sb=sb*n;

System.out.println(" UB "+" MB "+" LB "+" SB "+" RAC ");
System.out.println(ub+" "+mb+" "+lb+" "+sb+" "+rac);
}
}
}

class User{

static Scanner sc=new Scanner(System.in);

public User(){
}

public static void initialization(List<Train> trains){

System.out.println("enter berth type ");
String berthtype=sc.next();

trains.add(new Train(berthtype));

}

public static void bookForAdult(List<Train> trains){

Train ts=new Train();
Random r=new Random();
int n=r.nextInt(99999);
System.out.println("enter the passenger name");
String name=sc.next();
System.out.println("enter the age");
int age=sc.nextInt();
System.out.println("enter the berth type you prefer");
String berthtype=sc.next();
for(Train t:Train.trains){

if(berthtype.equalsIgnoreCase(t.berthType) && t.currentType.equals("AVL")){
t.pnr=n;
t.userName=name;
t.userAge=age;
t.currentType="CRN";
break;
}else{
System.out.println("please select alternative berth as the berth is already occupied ");
break;
}
}
}

public static void printDetailsOfPNR(List<Train> trains){
System.out.println(" enter the PNR number to be display to user");
int PNR=sc.nextInt();

for(Train t:Train.trains){
if(PNR==t.pnr){
System.out.println("S.no "+"   Name    "+"    Age    "+"    current Status    "+" Berth  ");
System.out.println(t.berthno+"   "+t.userName+"   "+t.userAge+"   "+t.currentType+"     "+t.berthType);

}else{
System.out.println("please enter the correct PNR number ");
}
}
}

public static void cancelTicket(List<Train> trains){
System.out.println(" enter the PNR number to be display to user");
int PNR=sc.nextInt();

for(Train t:Train.trains){
if(PNR==t.pnr){
System.out.println("S.no "+"   Name    "+"    Age    "+"    current Status    "+" Berth  ");
System.out.println(t.berthno+"   "+t.userName+"   "+t.userAge+"   "+t.currentType+"     "+t.berthType);
System.out.println("please enter yes to cancel the ticket ");
String yes=sc.next();
if(yes.equalsIgnoreCase("yes")){
trains.remove(t.userName);
trains.remove(t.pnr);
t.currentType="AVL";
}else{
System.out.println("please enter the correct option");
}
}else{
System.out.println("please enter correct PNR number");
}
}
}

public static void multipleTicket(List<Train> trains){

Train ts=new Train();

Random r=new Random();
int n=r.nextInt(99999);
System.out.println("enter number of ticket to be booked ");
int num=sc.nextInt();
for(int i=0;i<num;i++){

System.out.println("enter the passenger name");
String name=sc.next();
System.out.println(" enter the age");
int age=sc.nextInt();
System.out.println(" enter the berth type you prefer");
String berthtype=sc.next();
for(Train t:Train.trains){

if(berthtype.equalsIgnoreCase(t.berthType) && t.currentType.equals("AVL")){
t.pnr=n;
t.userName=name;
t.userAge=age;
t.currentType="CNF";
break;
}else{
System.out.println("please select alternative berth as the berth is already occupied ");
i=i-1;
break;
}
}
}
}


}
class Train{
static Scanner sc=new Scanner(System.in);
static List<Train> trains=new ArrayList<Train>();

int pnr;
int berthno;
String currentType;
String berthType;
String userName;
int userAge;
static int i=0;
public Train(){
}
public Train(String berthType){
this.pnr=0;
this.berthno=++i;
this.currentType="AVL";
this.berthType=berthType;
this.userName="";
this.userAge=0;
}

}

public class Zylker_Railways_Booking{

public static void main(String[] args){
Cabin cabin=new Cabin();
Coach coach=new Coach();
Train train=new Train();
User user=new User();
Scanner sc=new Scanner(System.in);
boolean b=false;
while(!b){

System.out.println("\n 1.initialization " + "\n 2.book ticket for adult " + " \n 3.search details by PNR " + "\n 4.book ticket with same PNR " + "\n 5.cancel Ticket " + "\n 6.Reallocate ticket for cancellation " + "\n 7.add two new cabin " + "\n 8.add new coach " + "\n 9.exiting " + "\n please select option to continue "); 

int n=sc.nextInt();
switch(n){
 
case 1:
user.initialization(Train.trains);
break;
case 2:
user.bookForAdult(Train.trains);
break;
case 3:
user.printDetailsOfPNR(Train.trains);
break;
case 4:
user.multipleTicket(Train.trains);
break;
case 5:
user.cancelTicket(Train.trains);
break;
case 6:

break;
case 7:
cabin.addNewCabin();
break;
case 8:
coach.addNewCoach();
break;
		case 9:
			b=true;
		break;
		default:
			System.out.println("please enter the correct option to continue");
		break;

}


}
}
}
