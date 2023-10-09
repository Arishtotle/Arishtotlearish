abstract class Bank{
public abstract double getBalance();
public abstract void Deposit(double money);
}

class BankA extends Bank{
private double bal;
public void Deposit(double money){
bal+=money;
}

public double getBalance(){
return bal;
}
}

class BankB extends BankA{

}

class BankC extends BankA{

}
public class Getbalance{
public static void main(String[] args){

BankA a=new BankA();
BankB b=new BankB();
BankC c=new BankC();

a.Deposit(100);
b.Deposit(150);
c.Deposit(200);

System.out.println("$"+a.getBalance());
System.out.println("$"+b.getBalance());
System.out.println("$"+c.getBalance());
}
}
