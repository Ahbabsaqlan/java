

public class Start
{
	public static void main(String[] args)
	{
		Account a1 = new Account(123, 1500);
		Account a2 = new Account(456, 1200);
		Account a3 = new Account(643, 2200);
		Account a4 = new Account(564, 3200);
		
		Customer c1 = new Customer("C-01", 2);
		c1.addAccount(a1);
		c1.addAccount(a2);
		c1.addAccount(a3);
		c1.performDeposit(a1, 1000);
		c1.performTransfer(a1, a2, 500);
		c1.searchAccount(456);
		
		c1.performDeposit(a1, 500);
		c1.performDeposit(a2, 500);
		
		c1.displayAllAccount();
		c1.removeAccount(a2);
		//c1.searchAccount(a2);
		
		c1.displayAllAccount();
		
		
		
		
		
		/*Customer c1 = new Customer("C-01", a1);
		c1.showDetails();
		
		c1.performDeposit(400);
		c1.performWithdraw(100);
		c1.performTransfer(bondhu, 400);
		
		c1.showDetails();*/
		
		
		
	}
}