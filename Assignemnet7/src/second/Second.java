package second;



class Save
{

	int save_num = 10;
	
	public  void incrementing()
	{
		save_num++;
	}
	
}
class Increment extends Thread
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
		synchronized(this)
		{
               
               s.incrementing();
                this.notify();
	
		}
	}
}
class Display extends Thread
{
	Save s;
	Thread t1;
	Display(Save s, Thread t1)
	{
		this.s = s;
		this.t1 = t1;
	}
	
public void run() 
	{
	t1.start();
	 
		synchronized(t1)
		{
			int i = 10;
			  try {
				  while(i >0)
				  {
			     t1.wait();
			     System.out.println(s.save_num);
				  }
				  i--;
			     
			    }
		     	catch(Exception e)
		     	{
				
		         	}
			    
			
			}

	 }
}

public class Second {

	public static void main(String[] args) {
	
          Save s = new Save();
          Increment t1 = new Increment(s);
          Display t = new Display(s,t1);
      t.start();
        
          

	}

}

