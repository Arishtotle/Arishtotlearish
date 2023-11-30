import java.util.*;
import java.nio.*;
import java.time.*;
import java.io.*;

class User{

static List<User> users=new ArrayList<User>();
static Scanner sc=new Scanner(System.in);
String aadharnumber;
String userName;
String cellnumber;
String Password;
  public User(String aadharnumber,String userName,String Password,String cellnumber){
  this.aadharnumber=aadharnumber;
  this.userName=userName;
  this.cellnumber=cellnumber;
  this.Password=Password;
  }
 public User(){
 }
		
public static void signUP(List<User> users){
           System.out.println("Please enter the your Aadhar number");
		String number=sc.next();
		if(number.length() != 12) return;
		System.out.println("Please enter the your Name");
		String name=sc.next();
		System.out.println("Please enter the your Mobile Number");
		String cellnumber=sc.next();
		if(cellnumber.length() != 10) return;
		System.out.println("Please enter the your Password");
		String pass1=sc.next();
		System.out.println("please enter your password again ");
		String pass2=sc.next();
		if(pass1.equals(pass2)){
		String password="";
		for(int i=pass1.length()-1;i>=0;i--){
		password=password+pass1.charAt(i);
		}
					users.add(new User(number,name,cellnumber,password));
			try{
				FileWriter writer=new FileWriter("Credentials.txt");
			writer.write(number+" "+name+" "+cellnumber+" "+password);
			writer.close();
			System.out.println("account created successfully");
			}catch(Exception e){
			e.printStackTrace();
			}
		}else{
		System.out.println("please enter the correct password");
		}
	}

public static boolean signIN(List<User> users){
    boolean f=false;
    System.out.println("please enter the user name ");
    String name=sc.next();
    System.out.println("please enter the password");
    String password=sc.next();
    String pass="";
    for(int i=password.length()-1;i>=0;i--){
    pass=pass+password.charAt(i);
    }
    String[] str;
    String s="";
    try{
    File file=new File("Credentials.txt");
   Scanner scan=new Scanner(file);
   while(scan.hasNextLine()){
   s=scan.nextLine();
   str=s.split(" ");
   if(str[1].equals(name) && str[3].equals(pass) ){
  
   return true;
   
   }
   scan.close();
   }
   }catch (Exception e){
   System.out.println(e);
   }
    return false;
}
}
class Motel{

static Scanner sc=new Scanner(System.in);
static List<Motel> rooms=new ArrayList<>();

int floorNumber;
int roomNumber;
int roomType;
int roomBed;
boolean available;

public Motel(int floorNumber,int roomNumber,int roomType,int roomBed){
   this.floorNumber=floorNumber;
   this.roomNumber=roomNumber;
   this.roomType=roomType;
   this.roomBed=roomBed;
   this.available=true;
}

public Motel(){
}
public void room(){
for(int i=1;i<4;i++){
for(int j=1;j<4;j++){
rooms.add(new Motel(i,j,0,0));
}
}
for(int i=1;i<4;i++){
for(int j=1;j<4;j++){
rooms.add(new Motel(i,j,1,1));
}
}
}
room();
public static void displayRooms(List<Motel> rooms){

System.out.println("Floor number "+"      "+"Room Number "+"      "+"AC/NON-AC"+"       "+"2BED/3BED"+"        "+"Available ");
for(Motel m:rooms){
System.out.println(m.floorNumber+"      "+m.roomNumber+"          "+m.roomType+"        "+m.roomBed+"         "+m.available);
}
}
}

public static void bookRoom(List<Motel> rooms,File file){
System.out.println("enter your Aadhar Number ");
String number=sc.next();
  String[] str;
    String s="";
    try{
    File file=new File("Credentials.txt");
   Scanner scan=new Scanner(file);
   while(scan.hasNextLine()){
   s=scan.nextLine();
   str=s.split(" ");
   if(number.equals(str[0]){
   System.out.println("please enter the floor number ");
   int floor=sc.nextInt();
   System.out.println("please enter the room number ");
   int room=sc.nextInt();
   System.out.println("please enter the Room type Ac/Non-Ac   (0/1)");
   int ac=sc.nextInt();
   System.out.println("please enter the room type 2BED/3BED   (0/1)");
   int bed=sc.nextInt();
   for(Motel m:rooms){
   
   if(floor==m.floorNumber && room==m.roomNumber && ac==m.roomType && bed==m.roomBed && m.available==true){
   m.avaialble=false;
   LocalDateTime d = LocalDateTime.now();
   try{
      FileWriter writer=new FileWriter("Bookingdb.txt");
       FileWriter writer1=new FileWriter(file);
      writer.write(floor+" "+room+" "+ac+" "+bed+" "+d+" "+str[0]+" "+str[1]+" "+str[2]+" "+str[3]);
      writer1.write(floor+" "+room+" "+ac+" "+bed+" "+d+" "+str[0]+" "+str[1]+" "+str[2]+" "+str[3]);
      writer.close();
      writer1.close();
   }catch(Exception e){
   System.out.println(e);
   }
   }else{
   System.out.println("the room you selected is already occupied");
   displayRooms(rooms);
   }
   }
   }else{
   System.out.println("please enter the correct aadhar number ");
   }
   }
   scan.close();
   }catch(Exception ex){
   System.out.println(ex);
   }
   }
   
public static void changeRoom(List<Motel> rooms,File file){
   System.out.println("enter your Aadhar Number ");
String number=sc.next();
  String[] str;
    String s="";
    try{
    File file=new File("Credentials.txt");
   Scanner scan=new Scanner(file);
   while(scan.hasNextLine()){
   s=scan.nextLine();
   str=s.split(" ");
   if(number.equals(str[0]){
   String[] str1;
    String s1="";
    try{
    File file1=new File("Bookingdb.txt");
   Scanner scan=new Scanner(file1);
   while(scan.hasNextLine()){
   s=scan.nextLine();
   str=s.split(" ");
   
   System.out.println("please enter the room number ");
   int room1=sc.nextInt();
     for(Motel m1:rooms){
   
   if(room1==str1[1] && m1.available==false){
   m1.avaialble=true;
   }
   }scan.close();
   }catch(Exception io){
   System.out.println(io);
   }
   System.out.println("please enter the floor number ");
   int floor=sc.nextInt();
   System.out.println("please enter the room number ");
   int room=sc.nextInt();
   System.out.println("please enter the Room type Ac/Non-Ac   (0/1)");
   int ac=sc.nextInt();
   System.out.println("please enter the room type 2BED/3BED   (0/1)");
   int bed=sc.nextInt();
   int pay=100;
   for(Motel m:rooms){
   
   if(floor==m.floorNumber && room==m.roomNumber && ac==m.roomType && bed==m.roomBed && m.available==true){
   m.avaialble=false;
   LocalDateTime d = LocalDateTime.now();
   try{
      FileWriter writer=new FileWriter("ChangeBookingdb.txt");
       FileWriter writer1=new FileWriter(file);
      writer.write(floor+" "+room+" "+ac+" "+bed+" "+d+" "+str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+pay);
      writer1.write(floor+" "+room+" "+ac+" "+bed+" "+d+" "+str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+pay);
      writer.close();
      writer1.close();
   }catch(Exception e){
   System.out.println(e);
   }
   }else{
   System.out.println("the room you selected is already occupied");
   displayRooms(rooms);
   }
   }
   }else{
   System.out.println("please enter the correct aadhar number ");
   }
   }
   scan.close();
   }catch(Exception ex){
   System.out.println(ex);
   }
   }
   public static void roomReport(File file){
     String s="";
   try{
    Scanner sc=new Scanner(file);
   while{s.hasNextLine()){
   
   System.out.println(s.nextLine());
   }
   sc.close();
   }catch(Exception e){
   
   System.out.pritln(e);
   }
   
   }
   
}


public class Motel_Reservation_System{

public static void main(String[] args){

User user=new User();
Motel motel=new Motel();
Scanner sc=new Scanner(System.in);
boolean b=false;
while (!b){
System.out.println("1.Sign Up "+"\n2.Sign In "+"\n 0.Exiting "+"\nplease enter the opiton to continue ");
int n=sc.nextInt();
switch(n){
case 1:
user.signUP(User.users);
break;
case 2:
if(user.signIN(User.users)){
boolean c=false;
while(!c){
System.out.println("1.Book room "+"\n2.Change Room "+"\n3.Leave the Room "+"\n4.Generate bill "+"\n5.Report Generate "+"\n0.Exiting "+"\nplease enter the   avobe choice to continue ");
int i=sc.nextInt();
switch(i){
    case 1:
    motel.bookRoom(Motel.rooms);
    break;
    case 2:
    motel.changeRoom(Motel.rooms,"Roomdb.txt");
    break;
    case 3:
    
    break;
    case 4
    
    break;
    case 5:
    motel.rooms_Report("Roomdb.txt");
    break;
    case 0:
    c=true;
    break;
    default:
    System.out.println("please enter the valid option to continue");
    break;
  }
}
}else{
System.out.println("please enter the correct user data ");
}
break;
case 0:
b=true;
break;
default:
System.out.println("please enter the valid option to continue");
break;
}
}
}
}