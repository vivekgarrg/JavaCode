
class Thread1 extends Thread
{
public void run()
{
	for(int i=1; i<=100; i++)
	{
		if(i%7==0 && i%11==0)
		{
			System.out.print(i+" ");
		}
	}
}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%5==0 || i%13==0)
			{
				System.out.print(i + " ");
			}
		}
	}
}

public class Second {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();

	}

}
