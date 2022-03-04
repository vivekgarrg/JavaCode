import java.util.Scanner;

public class Test{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int test = scan.nextInt();
		int arr[] =new int[test];
		
		while(n>0)
		{
			for(int i=0; i<test; i++)
			{
				arr[i] = scan.nextInt();
			}
			n--;
		}
		int max = 0;
		for(int i=0; i<test; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		int total_area = max * test;
		int initial_area = 0;
		for(int i=0; i<test; i++)
		{
	       initial_area = initial_area + arr[i];
		}
		int area = total_area - initial_area;
		System.out.println(area);
	}
}
