package lab_question;

import java.util.Scanner;

public class Account {
	private String name, account_type, address;
	private int balance;
	private long account_no;
	
	Account(int balance, String name, long account_no)
	{
		this.balance = balance;
		this.name = name;
		this.account_no= account_no;
	}
	
	Account(String name, long account_no, String address, String account_type, int balance)
	{
		this.balance = balance;
		this.name = name;
		this.account_no= account_no;
		this.address = address;
		this.account_type = account_type;
	}
	public void Deposit(int amnt)
	{
		balance += amnt;
		System.out.println("Rs."+amnt+ " Credited Successfully");
	}
	public void Withdraw(int amnt)
	{
		balance -= amnt;
		System.out.println("Rs."+amnt+ " Withraw Successfully");
	}
	public void GetBalance()
	{
		System.out.println("Balance: "+balance);
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the balance");
		int bal = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the name");
		String n = scan.nextLine();
		System.out.println("Enter account no.");
		int ac_no = scan.nextInt();
		scan.nextLine();
		System.out.println("Eneter Account type");
		String ac_type = scan.nextLine();
		System.out.println("Address");
		String add = scan.nextLine();
		Account ac = new Account(bal, n, ac_no);
		Account ac1= new Account(n, ac_no, add, ac_type, bal);
  System.out.println("Eneter coice:");
  System.out.println("1. Deposit");
  System.out.println("2. Withdraw");
  System.out.println("3. Balance");
  int choice = scan.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("Enter Ammount");
		int amnt = scan.nextInt();	
		ac.Deposit(amnt);
		break;
		case 2:
		System.out.println("Enter Ammount");
		int amt = scan.nextInt();	
		ac.Withdraw(amt);
		break;
		case 3:
		ac.GetBalance();
		break;
		}
	}

}
