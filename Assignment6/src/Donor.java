import java.util.Scanner;

public class Donor {
private int donor_no;
private char[] name = new char[20];
private char[] blood_group = new char[2];

public void input()
{
	System.out.println("Enter the donor no:");
	Scanner scan = new Scanner(System.in);
	donor_no = scan.nextInt();
	scan.nextLine();
	System.out.println("Enter the name");
	String str = scan.nextLine();
	for(int i=0; i<str.length();i++)
	{
		name[i] = str.charAt(i);
	}
	System.out.println("Enter the Blood Group");
	String str1 = scan.next();
	scan.close();
	for(int i=0; i<2;i++)
	{
		blood_group[i] = str1.charAt(i);
	}
	
}
public void output()
{
	System.out.println("Donor no: "+donor_no);
	System.out.print("Name : ");
	System.out.print(name);
	System.out.print("\n");
}
public void checkblood()
{
	System.out.print("Blood group : ");
	System.out.print(blood_group);
}
public static void main(String args[])
{
	Donor d = new Donor();
	d.input();
	d.output();
	d.checkblood();

	
}
}
