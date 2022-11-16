
public class Customer
{
	private String cID;
	private Account acc[];
	
	public Customer()
	{
		System.out.println("Empty Customer");
	}
	public Customer(String cID, int noAcc)
	{
		System.out.println("Parameterized Customer");
		this.cID = cID;
		acc = new Account[noAcc]; //c1 -> acc = new Account[2];
	}
	
	public void addAccount(Account a)
	{
		int check = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i] == null)
			{
				acc[i] = a;
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account added!");
		}
		else
		{
			System.out.println("Account not added!");
		}
	}
	public void removeAccount(Account a)
	{
		int check = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i] == a)
			{
				acc[i] = null;
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account removed!");
		}
		else
		{
			System.out.println("Account not removed!");
		}
	}
	public void searchAccount(int acNo)
	{
		int check = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i].getAccNo() == acNo)
			{
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Account found!");
		}
		else
		{
			System.out.println("Account not found!");
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
				System.out.println("No account available in this index.");
			}
		}
	}
	
	public void performDeposit(Account a, double amount)
	{
		int check =0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i]==a)
			{
				acc[i].deposit(amount);
				check =1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Deposit successful");
		}
		else
		{
			System.out.println("Deposit unsuccessful");
		}
		
	}
	public void performWithdraw(Account a, double amount)
	{
		int check =0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i]==a)
			{
				acc[i].withdraw(amount);
				check =1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Withdraw successful");
		}
		else
		{
			System.out.println("Withdraw unsuccessful");
		}
	}
	
	public void performTransfer(Account from, Account to, double amount)
	{
		int check =0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i]==from)
			{
				acc[i].transfer(to, amount);
				check =1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Transaction Successful!");
		}
		else
		{
			System.out.println("Transaction Unsuccessful!");
		}
	}
	
	
	
	
	
	/*public void setCid(String cID)
	{
		this.cID = cID;
	}
	public void setAcc(Account acc)
	{
		this.acc = acc;
	}
	public String getCid()
	{
		return cID;
	}
	public Account getAcc()
	{
		return acc;
	}
	
	public void performDeposit(double amount)
	{
		acc.deposit(amount);
	}
	public void performWithdraw(double amount)
	{
		acc.withdraw(amount);
	}
	public void performTransfer(Account a, double amount)
	{
		acc.transfer(a, amount);
	}
	public void showDetails()
	{
		System.out.println("Customer ID: "+ cID);
		acc.display();
	}*/
	
	
}