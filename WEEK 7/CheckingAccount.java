public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(){
        super(); // super keyword to call parent class constructor
        overdraftLimit = -30;
    }
    public CheckingAccount(int id,double balance,double overdraftLimit){
        super(id,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
        else{
            System.out.println("Error");
        }
    }

    public String toString(){
        return "\nChecking Account" + "\nOverdraft Limit : " + overdraftLimit
        +"\nBalance is " + getBalance() + "\nThis account was created at " + getDateCreate();
    }
}
