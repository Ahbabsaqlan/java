import java.lang.*;

public class Account
{
	private int accNo;
	protected double balance;
	
	public Account(int accNo, double balance)
	{
		this.accNo = accNo;
		this.balance = balance;
	}
	public void display()
	{
		System.out.println("ACC NO: "+accNo);
		System.out.println("ACC Balance: "+balance);
	}
	
	public void withdraw(double amount)
	{
		if(balance>amount && amount >0)
		{
			balance = balance-amount;
		}
		else
		{
			System.out.println("Transaction failed!");
		}
	}
}