
public class Pro1_64010806_7{
    public static void main(String[] args) {
        Account account = new Account(1122,5000);
        CheckingAccount checkingAccount = new CheckingAccount(1001,5000,5000);
        SavingAccount savingAccount = new SavingAccount(1004,5000);

        account.setAnnualInterestRate(4.5);
        checkingAccount.setAnnualInterestRate(4.5);
        savingAccount.setAnnualInterestRate(4.5);
        
        account.withdraw(5500);
        checkingAccount.withdraw(5500);
        savingAccount.withdraw(5500);

       
        System.out.println(account.toString());
        System.out.println(savingAccount.toString());
        System.out.println(checkingAccount.toString());
        
    }
}