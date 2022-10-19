import java.lang.*;
public class Account{
	private int accountNumber;						//attributes
	private String accountHolderName;
	private double balance;

	public void setAccountNumber(int an){			//setter method
		accountNumber=an;
	}
	public void setAccountHolderName(String ahn){
		accountHolderName=ahn;
	}
	public void setBalance(double b){
		balance=b;
	}
	public int getAccountNumber(){					//getter method
		return accountNumber;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	public double getBalance(){
		return balance;
	}
	public void showDetails(){						//display method
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+balance);
	}
}
	
	
		