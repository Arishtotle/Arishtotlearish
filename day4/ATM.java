import java.util.*;
class Account{

 private long acc_no;
 private String name;
 private int pin;
 private int balance;

    public Account(long acc_no, String name, int pin, int balance){
     this.acc_no = acc_no;
     this.name = name;
     this.pin = pin;
     this.balance = balance;
    }
  
  public long getAccno(){
    
   return acc_no;
  }
  
  public String getName(){

   return name;
  }

  public int getPin(){

  return pin;
   }
  
  public int getBalance(){
   
   return balance;
  }
  public void setBalance(int balance ){
   this.balance = balance;
  }
   
}

public class ATM {

  public static void main(String[] args){
  
   System.out.println("Hey there!..Insert your card to initiate!");
   Account user1 = new Account(1524566225, "Arish", 0000, 100000);
   System.out.println("Hey" + user1.getName() +"!.. Enter your pin please");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   if(n == user1.getPin()){
      System.out.println("Enter the amount");
      int amount = sc.nextInt();
      if(amount < user1.getBalance()){
        System.out.println("Please collect your cash..Thank you!");
        user1.setBalance(user1.getBalance() - amount);
      }
      else{
        System.out.println("Entered amount is greater than your balance");
       }

    }else{
      System.out.println("Entered pin is wrong!");
    }


  }
}
Actions
Type ":" to get emoji suggestions
