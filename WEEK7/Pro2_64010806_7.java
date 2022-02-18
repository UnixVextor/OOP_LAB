public class Pro2_64010806_7 {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("George",1122,1000);

        account.setAnnualInterestRate(1.5);

		
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

		
		System.out.println("       Account Summary"); 
		System.out.println("------------------------------------");
		System.out.println("Account holder name: " + account.getName());
		System.out.println("Interest rate: " + account.getAnnualInterestRate());
		System.out.printf("Balance: %.2f\n", account.getBalance());
        System.out.println("Date\t                        Type\tAmount\tBalance");
		for (int i = 0; i < account.getTransactions().size(); i++) {
			System.out.print(account.getTransactions().get(i).getDate());
			System.out.print("\t" + account.getTransactions().get(i).getType());
			System.out.print("\t" + account.getTransactions().get(i).getAmount());
			System.out.print("\t" + account.getTransactions().get(i).getBalance());
            System.out.println();
		}
	
    }
       
}
