import java.util.ArrayList;
import java.util.List;

class User{
	private String fullname;
	private String email;
	private String mobilenumber;
	private String hID;
	private String password;
	private double rcbalance;
	private double zcoinBalance;
	public User(String fullname,String email,String mobilenumber,String hID,String password,double rcbalance,double zcoinBalance) {
		this.fullname=fullname;
		this.email=email;
		this.mobilenumber=mobilenumber;
		this.hID=hID;
		this.password=password;
		this.rcbalance=rcbalance;
		this.zcoinBalance=0.0;
	}
}
class Zemployee{
	private String email;
	private String password;
	
	public Zemployee(String email,String password) {
		this.email=email;
		this.password=password;
	}
}

class Zcoinexchange{
	List<User> users=new ArrayList<>();
	List<Zemployee> zemployee=new ArrayList<>();
	public void Createuser(String fullname,String email,String mobilenumber,String hID,String password,double rcbalance) {
		User newUser=new User(fullname,email,mobilenumber,hID,password,rcbalance, rcbalance) ;
		
	}
	public void Loginuser(String email,String password) {
		
	}
	
	}





public class ZcoinUSerLoginDetails {

	public static void main(String[] args) {
		Zcoinexchange exchange=new Zcoinexchange();
		exchange.Createuser("Arish","Arish@gmail.com","9856854785","12345678","PAssword@123",10000.0);
	}
	
	
	
	
}
