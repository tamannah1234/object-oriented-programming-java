package OOPS;

//Encapsulation (Done)
//Private Variable and method can be access through gettter and set value use setter
class BalanceAccount{
private double balance;  //Indirect Access Allowed
private double borrowing;
private double SI;


public void deposit(double amount){
if(amount>0){
    balance += amount;
    System.out.println("Deposited : "+ amount);
}
}

public void withdraw(double amount){
if(amount<=balance){
    balance -= amount;
    System.out.println("Withdrawn : "+ amount);
}
}

//here getter is used
public double getBalance(){
return balance;
}

public void setBorrowAmount(double amount,int years,int rate){
    this.borrowing = amount;
    SI = (amount*years*rate)/100.0;
}

public double getBorrowAmount(){
return borrowing;
}
public double getSimpleInterest(){
return SI;
}
}

public class Encaptulation {
 public static void main(String[] args) {
    
    //Object
    BalanceAccount account = new BalanceAccount();
    account.deposit(100);
    account.withdraw(100);
    double balance=account.getBalance();
    System.out.println("Current Balance :"+ balance);

    account.setBorrowAmount(1000,2,10);
    System.out.println(account.getBorrowAmount());
    System.out.println("Simple interest :"+ account.getSimpleInterest());
 }   
}
