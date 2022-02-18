public class SavingAccount extends Account{
    public SavingAccount(){
        super();
    }

    public SavingAccount(int id,double balance){
        super(id,balance);
    }

    public void withdraw(double amount){
        if(amount < getBalance()){
            setBalance(getBalance() - amount);
        }else{
            System.out.println("Error! you cannot withdraw");
        }
    }

}
