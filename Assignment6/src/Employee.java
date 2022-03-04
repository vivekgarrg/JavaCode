import java.util.Scanner;

public class Employee {
	private int epno;
	private char[] ename = new char[20];
	private float basic, hra, da, netpay;
	private float calculate(float a, float b, float c)
	{
		basic = a;
		hra = b;
		da =c;
		netpay = basic + hra + da;
		return netpay;	
	}
	public  void havedata(int epno, char[] ename, float basic, float hra, float da)
	{
		
		this.epno = epno;
		this.ename = ename;
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		netpay = calculate(this.basic,this.hra,this.da);
		disdata();
	}
	public void disdata()
	{
		System.out.println("Employee id:"+epno);
		System.out.print("Employee name:");
		System.out.print(ename);
		System.out.print("\n");
		System.out.println("Basic salary:"+basic);
		System.out.println("House rent allowance:"+hra);
		System.out.println("Dearness Allowance:"+da);
		System.out.println("Total Salary:"+netpay);
		
	}
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
         Employee e=new Employee();
         System.out.println("Enter the employee id:");
         int eid = scan.nextInt();
         System.out.println("Enter the name:");
         scan.nextLine();
         String str = scan.nextLine();
         char name[]=new char[str.length()];
         for(int i=0;i<name.length;i++)
         {
        	 name[i] = str.charAt(i);
         }
         System.out.println("Enter basic salary:");
         float bs = scan.nextFloat();
         System.out.println("Enter the ha:");
         float ha = scan.nextFloat();
         System.out.println("Enter the da:");
         float d = scan.nextFloat();
         
         e.havedata(eid,name,bs, ha, d);
	}

}
