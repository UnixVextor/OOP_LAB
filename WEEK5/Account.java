import java.util.*;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate;
    private Date dateCreate;
    
    public Account(){
        dateCreate = new Date();
    }

    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreate = new Date();
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreate(){
        return dateCreate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate/100)/12;
    }

    public double getMonthlyInterest(){
        return balance * this.getMonthlyInterestRate();
    }

    public double withdraw(double withdraw){
        return balance -= withdraw;
    }

    public double deposit(int deposit){
        return balance += deposit;
    }

}
