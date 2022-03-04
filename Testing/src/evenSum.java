import java.util.Scanner;

public class evenSum {
	
	static int eSum(int[] arr)
	{
		int sum =0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
		arr[i] = scan.nextInt();	
		}
		
		int sum = eSum(arr);
		System.out.println(sum);

	}

}
