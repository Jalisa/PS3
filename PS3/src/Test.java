//Account.java is called to main
public class Test {
	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000);
		
		account1.setAnnualInterestRate(4.5 / 100);
		try {
			account1.withdraw(2500);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account1.deposit(3000);
		
		
		System.out.println(account1.getBalance());
		System.out.println(Account.getAnnualInterestRate());
		System.out.println(account1.getDate());
	}
}