import java.util.*;

class Bank{
String username;
public Bank(){
}
public Bank(String username){
this.username=username;
}
public void getName(String name){
this.username=name;
}
}

class BankFunction{
static double balance=100;
static Scanner sc=new Scanner(System.in);
Bank bank=new Bank();

public static void withdrawn(ArrayList<Bank> banks){

System.out.println("please enter the user name ");
String name=sc.next();
//bank.getName(name);
//banks.add(bank.getName());
System.out.println("please enter the abount to be withdrawn");
double withdrawn=sc.nextDouble();
if(withdrawn<=balance){
balance=balance-withdrawn;
System.out.println(name+" has withdrawn "+withdrawn);
}else{
System.out.println(name+" withdrawn failed insufficient balance "+balance);
}
}



public static  void deposit(ArrayList<Bank> banks){
System.out.println("please enter the user name");
String name=sc.next();
//banks.add(name);
System.out.println("please enter the amount to be deposited");
double deposit=sc.nextDouble();
balance=balance+deposit;
System.out.println(name+"amount has been deposited is "+deposit);
}


public static void getBalance(){

System.out.println("the avilable balanve is "+balance);

}
}


public class BankingTransactionSystem{

static ArrayList<Bank> banks=new ArrayList<Bank>();

public static void main(String[] args){

BankFunction bf=new BankFunction();
Bank bank=new Bank();
banks.add(bank);

Scanner sc=new Scanner(System.in);

boolean b=false;
while(!b){

System.out.println("please enter 1 for Withdrawal \n"+"please enter 2 for deposit \n"+"please enter 3 for get balance \n"+"please enter 4 for exiting \n"+"please select any of the option to perform ");
int n=sc.nextInt();
switch(n){

case 1:

bf.withdrawn(banks);
break;

case 2:

bf.deposit(banks);
break;

case 3:

bf.getBalance();
break;

case 4:
b=true;
break;

default:
System.out.println("please enter the correct number to proceed");
break;
}
}
}
}

 

