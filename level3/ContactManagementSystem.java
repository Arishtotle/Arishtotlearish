import java.util.Scanner;
import java.util.HashMap;
class Contact{
	String name;
	String phone;
	String company;
	int CallCount;
	public Contact(String name,String phone,String company) {
		this.name=name;
		this.phone=phone;
		this.company=company;
		
	}
	public void MakeCall() {
		System.out.println(" Making call to : "+this.phone+" Speaking .");
	    this.CallCount++;
	}
	public Contact gets(String phone) {
		
		return null;
	}
}
public class ContactManagementSystem {
	public static void main(String[] args) {
	    boolean b=false;
		Scanner sc=new Scanner(System.in);
		HashMap<String,Contact> contact=new HashMap<String,Contact>();
		while(!b) {
			System.out.println("options : ");
			System.out.println("1 for call");
			System.out.println("2 for search contact");
			System.out.println("3 for edit contact");
			System.out.println("4 for phone call history");
			System.out.println("5 for delete contact");
			System.out.println("6 for exit");
			System.out.println(" please enter your choice as wish :");
			int n=sc.nextInt();
			sc.next();
			switch(n) {
			case 1:
				System.out.println(" please neter tyhe number to make call : ");
				String phone=sc.next();
				Contact contact1=contact.gets(phone);
				if(Contact != null) {
					contact1.MakeCall();
				}else {
					System.out.println(" contact not found");
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println(" Enter the mobile number to delete : ");
				phone=sc.next();
				contact1=contact1.get(phone);
				if(contact1 !=null) {
					contact1.remove(phone);
					System.out.println("contact deleted as per your request");
				}else {
					System.out.println(" contact not found ");
				}
				break;
			case 6:
				b=true;
				System.out.println("Exiting the contact as per your request ....bye Buddy...");
				break;
				
				default:
					System.out.println("Invalid choice please try with valid choice as mentioned above ...thankyour buddy..");	
			}
			
		}
	}
}