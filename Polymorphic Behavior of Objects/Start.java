import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("C-01", 2);
		
		Account a1 = new SavingsAccount(123, 1500, 3);
		Account a2 = new FixedAccount(456, 2500, 500);
		
		c1.addAccount(a1);
		c1.addAccount(a2);
		
		c1.performWithdraw(a2, 2200);
		
		c1.displayAllAccount();
	}
}