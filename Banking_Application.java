import java.util.*;
import java.io.*;

class User{

static List<User> users=new ArrayList<>();

int acNo;
int userId;
String userName;
double acBalance;
String userPassword;
static int ID=0;
public User(int acNo,String userName,double acBalance,String userPassword){
this.acNo=acNo;
this.userName=userName;
this.acBalance=acBalance;
this.userPassword=userPassword;
this.userId=++ID;
}




}

class Bank{

static String lastPassword1="";
static String lastPassword2="";
static String currentPassword="";


static Scanner sc=new Scanner(System.in);

public static void initialization(List<User> users){
System.out.println("please enter the Account number");
int num=sc.nextInt();
System.out.println("please enter the Account holder name");
String name=sc.next();
System.out.println("please enter the Account balance");
double balance=sc.nextDouble();
System.out.println("please enter the User Password");
String password=sc.next();

users.add(new User(num,name,balance,password));
System.out.println("Account detatils added Successfully");

}
public static void encrytption(List<User> users){
System.out.println("please enter the password to be encrypted");
String pass=sc.next();
String newpass="";
for(User user:User.users){
if(pass.equalsIgnoreCase(user.userPassword)){
for(int i=0;i<pass.length();i++){

if(pass.charAt(i)<'Z' ){
newpass =newpass+(char)(pass.charAt(i)-'0'+1);
}else if(pass.charAt(i)<'z' ){
newpass =newpass+(char)(pass.charAt(i)-'0'+1);
}else if(pass.charAt(i)<'9'){
newpass =newpass+(char)(pass.charAt(i)-'0'+1);
}else if( pass.charAt(i)=='Z' ){

newpass =newpass+'A';
}else if(pass.charAt(i)=='z'){
newpass =newpass+'a';
}else if(pass.charAt(i)=='9'){
newpass =newpass+'0';
}else{
break;
}
}

user.userPassword=newpass;
System.out.println("Your password Encrypted Successfully");
}else{
System.out.println("please enter the correct password");
}
}
}

public static void changePassword(List<User> users){

System.out.println("please enter the password to be changed");
String pass=sc.next();
for(User user:User.users){
if(pass.equalsIgnoreCase(user.userPassword)){
lastPassword1=lastPassword2;
lastPassword2=pass;
System.out.println("please enter the new password to be changed");
String newpassword=sc.next();

currentPassword=newpassword;
user.userPassword=newpassword;
System.out.println("password changed successfully");

}else{
System.out.println("please enter correct password to change the new password");
}
}
}
public static void passwordHistory(){

System.out.println(lastPassword1);
System.out.println(lastPassword2);
System.out.println(currentPassword);

}

}
class Transaction{

static Scanner sc=new Scanner(System.in);
static List<Transaction> transaction=new ArrayList<>();
String transType;
int transID;
static int IDT=0;
double amounttrans;
double balance;
public Transaction(String transType,double amounttrans,double balance){
this.transID=++IDT;
this.transType=transType;
this.amounttrans=amounttrans;
this.balance=balance;
}

public Transaction(){
}

public static void atmWithdrawal(List<User> users,List<Transaction> transaction){

System.out.println("please enter the user password to continue");
String pass=sc.next();
for(User user:User.users){
if(pass.equalsIgnoreCase(user.userPassword)){
System.out.println("please enter the amount to be withdraw");
double amount=sc.nextDouble();

if(amount<=user.acBalance){
user.acBalance=user.acBalance-amount;
transaction.add(new Transaction("ATMWithdrawal",amount,user.acBalance));
System.out.println("your transaction successful ...thank you!");
}else{
System.out.println("insufficient fund");
}
}else{
System.out.println("please enter the correct password");
}
}
}

public static void cashDeposit(List<User> users,List<Transaction> transaction){

System.out.println("please enter the user password to continue");
String pass=sc.next();
for(User user:User.users){
if(pass.equalsIgnoreCase(user.userPassword)){
System.out.println("please enter the amount to be deposited");
double amount=sc.nextDouble();

user.acBalance=user.acBalance+amount;
transaction.add(new Transaction("CashDeposited",amount,user.acBalance));
System.out.println("your transaction successful ...thank you!");
}else{
System.out.println("please enter the correct password");
}
}
}

public static void accountTransfer(List<User> users,List<Transaction> transaction){

System.out.println("please enter the user password to continue");
String pass=sc.next();
for(User user:User.users){
if(pass.equalsIgnoreCase(user.userPassword)){

System.out.println("1.send money "+"\n 2. receice money ");
int n=sc.nextInt();
switch(n){
case 1:
System.out.println("please enter the amount ot be send and account number ");
double amount=sc.nextDouble();
String acnum=sc.next();
user.acBalance=user.acBalance-amount;
transaction.add(new Transaction("Cashsendedto"+"  "+acnum,amount,user.acBalance));
break;
case 2:
System.out.println("please enter the amount to be received and account number ");
double amount1=sc.nextDouble();
String acnum1=sc.next();
user.acBalance=user.acBalance+amount1;
transaction.add(new Transaction("Cashreceivedfrom"+"  "+acnum1,amount1,user.acBalance));
break;
default:
System.out.println("please enter the correct option");
break;
}

}
}
}

public static void transcationHistory(List<User> users,List<Transaction> transaction){

System.out.println("please enter the user password to continue");
String pass=sc.next();
for(User user:User.users){
if(pass.equalsIgnoreCase(user.userPassword)){

System.out.println(user.userName);
System.out.println(user.acNo);
System.out.println(user.userId);
System.out.println("S.no      TransType         amount         balance     ");
for(Transaction t:transaction){
System.out.println(t.transID +"       "+t.transType+"          "+t.amounttrans+"        "+t.balance);
}
}else{
System.out.println("please enter correct password");
}
}

}







}




public class Banking_Application{

public static void main(String[] args){

Bank bank=new Bank();
Transaction trans=new Transaction();
Scanner sc=new Scanner(System.in);
boolean b=false;

while (!b){

System.out.println("1.Initialization"+"\n2.add new customer "+"\n 3.password encryption "+"\n 4. password Authenticarion "+"\n 0.exiting "+"\n please select the avobe operations to perform");
 
int n=sc.nextInt();

switch(n){
case 1:
bank.initialization(User.users);
break;
case 2:
bank.initialization(User.users);
break;
case 3:
bank.encrytption(User.users);
break;
case 4:
System.out.println("please enter the password to be authenthicated");
String pass=sc.next();
for(User user:User.users){
if(pass.equalsIgnoreCase(user.userPassword)){
boolean f=false;
while(!f){
System.out.println(" 1.Basic Support operations"+"\n 2.persistence of transaction history "+"\n3.top rated customers "+"\n 4.change password "+"\n 5.password history "+"\n 0.exiting"+"\n please select an option to continue ");

int i=sc.nextInt();
switch(i){

case 1:
boolean a=false;
while(!a){
System.out.println("1.ATM withdrawal"+"\n2.Cash deposit "+"\n3.Account Transfer "+"\n 0.exiting"+"\n please enter the option to continue ");
int t=sc.nextInt();
switch(t){
case 1:
trans.atmWithdrawal(User.users,Transaction.transaction);
break;
case 2:
trans.cashDeposit(User.users,Transaction.transaction);
break;
case 3:
trans.accountTransfer(User.users,Transaction.transaction);
break;
case 0:
a=true;
break;
default:
System.out.println("please enter the correct option to continue");
break;
}
}
break;

case 2:
trans.transcationHistory(User.users,Transaction.transaction);
break;

case 3:

break;

case 4:
bank.changePassword(User.users);
break;
case 5:
bank.passwordHistory();
break;

case 0:
f=true;
break;

default:
System.out.println("please enter the correct option to continue ");
break;
}

}
}else{
System.out.println("please enter the correct password to continue");
break;
}
}

break;
case 0:
b=true;
break;
default:
System.out.println("please enter te correct option to perform an operation ");
break;

}
}



}
}
