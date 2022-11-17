import java.lang.*;
public class Customer
{
	private String cID;
	private Account acc[];
    
	public Customer(String cID, int noAcc)
	{
		this.cID = cID;
		acc = new Account[noAcc];
	}
	public void addAccount(Account a)
	{
		int check = 1;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i]==null)
			{
				acc[i] = a;
				check = 0;
				break;
			}
		}
		if(check == 0)
		{
			System.out.println("Account added!");
		}
		else
		{
			System.out.println("Account not added!");
		}
	}
	
	public void displayAllAccount()
	{
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i]!=null)
			{
				
				acc[i].display();
			}
			else
			{
				System.out.println("Null!");
			}
		}
	}
	
	public void performWithdraw(Account a, double amount)
	{
		int check = 1;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i]==a)
			{
				acc[i].withdraw(amount);
				break;
			}
		}
		if(check == 0)
		{
			System.out.println("Transaction Successful!");
		}
		else
		{
			System.out.println("Transaction Unsuccessful!");
		}
	}
}