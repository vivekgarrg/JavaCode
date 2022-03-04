import java.util.Scanner;


class myException extends RuntimeException
{
	myException(String s)
	{
	super(s);
	}
}
public class ExceptionTest {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a = s.nextInt();
		if(a>10)
		{
			throw new myException("NOOO");
		}
		
		

	}

}