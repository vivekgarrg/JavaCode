
import java.io.*;
import java.util.Scanner;

class Test1
{
	static int isComposite(int n)
	{
		int count =0;
		if(n<=1)
		{
			count++;
		}
		else if(n>1)
		{
			count++;
		}
		for(int i=2; i<=n; i++)
		{
			for(int j=2; j<=i; j++)
			{
				if(i%j == 0 && j==i)
					count++;
					
					
			}
		}
		int fin = n-count;
		return fin;
	}

	// Driver Program to test above function
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		
		count += isComposite(n);
		System.out.println(count);
						
		
	}
}

