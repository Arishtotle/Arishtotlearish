import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Date;


class TelephoneBill{
	private static final String Writer = null;
	private String phonenumber;
	private double callduration;
	private Date calldate;
	private double totalamount;
	
	public TelephoneBill(String phonenumber,double callduration,Date calldate) {
		this.phonenumber=phonenumber;
		this.callduration=callduration;
		this.calldate=calldate;
		this.totalamount=Calculatemount(callduration);
	}
	private double Calculatemount( double callduration) {
		double Apm=1.5;
		return callduration*Apm;
	}
	public void SavetoFile() throws IOException {
		try (FileWriter writer=new FileWriter("telephone_bill.txt",true);
			PrintWriter print=new PrintWriter(Writer)){
			print.println("Phone number : "+phonenumber);
			print.println("Call Duration : "+callduration);
			print.println("Call Date : "+calldate);
			print.println("Total Amount : $"+totalamount);
		}
		
	}
	
}
public class TelephoneBillGeneration {
	public static void main(String[] args) throws Exception {
		TelephoneBillGeneration telebill=new TelephoneBillGeneration();
		Date calldate1=new Date();
		Date calldate2=new Date();
		TelephoneBill bill1=new TelephoneBill("9566569783",20.0,calldate2);
		TelephoneBill bill2=new TelephoneBill("9791956648",18.25,calldate1);
		bill1.SavetoFile();
		bill2.SavetoFile();
		telebill.DisplayBillsFromFile();
		
	}
	public void DisplayBillsFromFile() {
		try(BufferedReader reader=new BufferedReader(new FileReader("telephone_bill.txt"))){
			String line;
			while((line=reader.readLine())!=null) {
			System.out.println(line);	
			}
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}