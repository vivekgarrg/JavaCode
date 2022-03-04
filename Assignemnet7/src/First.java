class Save
{

	int save_num = 10;
	
	public void saveNumber(int num)
	{
	     	save_num = num;
	}
}
class Increment implements Runnable
{
	Save s;
	int num;
	Increment(Save s)
	{
		this.s = s;
		num = s.save_num;
	}
	public void run()
	{
	 
		for(int i=1; i<=10; i++)
		{
			int result = num + i;
			s.saveNumber(result);
		}
	}
}
class Display implements Runnable
{
	Save s;
	Display(Save s)
	{
		this.s = s;
	}
	
	public void run()
	{
		System.out.println(s.save_num);
	}
}

public class First {

	public static void main(String[] args) {
		Save s = new Save();
		System.out.print("Before Increment: ");
		System.out.println(s.save_num);
		System.out.println();
		
		System.out.print("After Increment: ");
		Increment i = new Increment(s);
		Thread t1 = new Thread(i);
		t1.start();
		Display d = new Display(s);
		Thread t2 = new Thread(d);
		t2.start();
		

	}

}
