import java.util.Scanner;

public class fabbonaciSeries {
	public static int fSeries(int n)
	{
		if(n==1 || n==0)
		{
		return 1;	
		}
		int k = fSeries(n-1) + fSeries(n-2);
		System.out.println(k);
		return k;
		
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
	     int n = scan.nextInt();
	    int k = fSeries(n);
//	    System.out.println(k);
	}

}
