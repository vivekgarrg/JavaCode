import java.util.Scanner;

public class Student {
private int roll_no;
private char[] name = new char[20];
private char[] class_st = new char[8];
private int[]  marks = new int[5];
private float percentage;
private float calculate()
{
	int tmarks =0;
	for(int i=0; i<marks.length; i++)
	{
		tmarks += marks[i];
	}
    float totalmarks = (float) tmarks;
    percentage = ((totalmarks/500)*100);
	return percentage;
}
public void marks()
{

	System.out.println("Enter the marks of 1st Subject:");
	Scanner scan = new Scanner(System.in);
	marks[0] = scan.nextInt();
	System.out.println("Enter the marks of 2nd Subject:");
	marks[1] = scan.nextInt();
	System.out.println("Enter the marks of 3rd Subject:");
	marks[2] = scan.nextInt();
	System.out.println("Enter the marks of 4th Subject:");
	marks[3]= scan.nextInt();
	System.out.println("Enter the marks of 5th Subject:");
	marks[4]= scan.nextInt();
	scan.close();
}
public void displaymarks()
{
	System.out.println("Subject 1: " + marks[0]);
	System.out.println("Subject 2: " + marks[1]);
	System.out.println("Subject 3: " + marks[2]);
	System.out.println("Subject 4: " + marks[3]);
	System.out.println("Subject 5: " + marks[4]);
	float p = calculate();
	System.out.println("Percentage:" +p);
	
}

public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	Student s=new Student();
	System.out.println("Enter the roll no:");
    s.roll_no = scan.nextInt();
	System.out.println("Enter the name:");
    scan.nextLine();
    String str = scan.nextLine();
    for(int i=0;i<str.length();i++)
    {
   	 s.name[i] = str.charAt(i);
    }
    System.out.println("Enter the class Straem:");
   String str1 = scan.nextLine();
   for(int i=0; i<str1.length();i++)
   {
	   s.class_st[i] = str1.charAt(i);
   }
    s.marks();
    s.displaymarks();
}
}
