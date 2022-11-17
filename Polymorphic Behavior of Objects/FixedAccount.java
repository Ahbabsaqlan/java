import java.lang.*;

public class FixedAccount extends Account
{
	private double fixedBalance;
	
	public FixedAccount(int accNo, double balance, double fixedBalance)
	{
		super(accNo, balance);
		this.fixedBalance = fixedBalance;
	}
	public void display()
	{
		super.display();
		System.out.println("Fixed Minimum Balance: "+fixedBalance);
	}
	public void withdraw(double amount)
	{
		if(balance>amount && amount >0 && (balance-amount)>fixedBalance)
		{
			balance = balance-amount;
		}
		else
		{
			System.out.println("Transaction failed!");
		}
	}
}