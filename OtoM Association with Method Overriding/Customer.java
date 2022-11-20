import java.lang.*;

public class Customer extends Person
{
	private String cID;
	private Account acc[];
	
	public Customer()
	{
		System.out.println("Empty Customer");
	}
	public Customer(String name, int age, String cID, int noAcc)
	{
		super(name, age);
		System.out.println("Parameterized Customer");
		this.cID = cID;
		acc = new Account[noAcc];
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
			System.out.println("Account added successfully!");
		}
		else
		{
			System.out.println("Account not added");
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
			System.out.println("Account removed successfully!");
		}
		else
		{
			System.out.println("Account not removed.");
		}
		
	}
	
	public void searchAccount(Account a)
	{
		int check = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i] == a)
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
			System.out.println("Account not found.");
		}
	}
	
	
	
	
	
	//removeAccount
	//searchAccount
	public void displayAllAccount()
	{
		for(int i=0; i<acc.length; i++)
		{
			if(acc[i]!=null)
			{
				acc[i].display();
			}
			else
			{
				System.out.println("No account available in this index!");
			}
		}
		
	}
	public void performDeposit(Account a, double amount)
	{
		int check = 0;
		for (int i= 0; i<acc.length; i++)
		{
			if(acc[i] == a)
			{
				acc[i].deposit(amount);
				check = 1;
				break;
			}
		}
		if(check == 1)
		{
			System.out.println("Deposit Successfull");
		}
		else
		{
			System.out.println("Deposit Unsuccessfull");
		}
		
		
	}
	public void performWithdraw(Account a, double amount)
	{
		//make it appropriate
		//acc.withdraw(amount);
	}
	
	public void performTransfer(Account from, Account to, double amount)
	{
		//make it appropriate
		//acc.transfer(a, amount);
	}
	
	
	public void display()
	{
		super.display();
		System.out.println("Customer ID: "+ cID);
	
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