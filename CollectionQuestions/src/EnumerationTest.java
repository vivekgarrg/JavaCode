import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {
	
		Vector v = new Vector();
		
		for(int i=1; i<=10; i++)
		{
			v.addElement(i+10);
		}
		
		Enumeration e = v.elements();
		
		System.out.println(v);
     
		System.out.println("Even Numbers are: "); 
		while(e.hasMoreElements())
		{
			Integer i = (Integer)e.nextElement();
			
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
