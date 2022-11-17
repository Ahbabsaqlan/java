import java.lang.*;

public class SavingsAccount extends Account
{
	private int tYear;
	
	public SavingsAccount(int accNo, double balance, int tYear)
	{
		super(accNo, balance);
		this.tYear = tYear;
	}
	public void display()
	{
		super.display();
		System.out.println("Tenure Year: "+tYear);
	}
	public void withdraw(double amount)
	{
		if(balance>amount && amount >0 && tYear>=2)
		{
			balance = balance-amount;
		}
		else
		{
			System.out.println("Transaction failed!");
		}
	}
}