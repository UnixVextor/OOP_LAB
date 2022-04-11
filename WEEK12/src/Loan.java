package src;
import java.util.*;
public class Loan {
    private double AnnualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000.0;
    private Date loanDate;

    public Loan(){
        
    }

    public Loan(double AnnualInterestRate,int numberOfYears,double loanAmount){
        this.AnnualInterestRate = AnnualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    } 

    public void seAnnualInterestRate(double AnnualInterestRate){
        this.AnnualInterestRate= AnnualInterestRate;
    }
    public double getAnnualInterestRate(){
        return AnnualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public int getNumberOfYears(){
        return numberOfYears;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getLoanAmount(){
        return loanAmount;
    }
    
    public double getMonthlyPayment(){
        double monthlyInterestRate = AnnualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /(1 - (1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public Date getLoanDate(){
        return loanDate;
    }
}
