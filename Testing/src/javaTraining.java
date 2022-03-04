import java.util.Scanner;

public class javaTraining {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row= scan.nextInt();
		int col = scan.nextInt();
		int arr[][] = new int[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		
		int rowSum[] = new int[row]; 
		int max = Integer.MIN_VALUE; 
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++ )
			{
				if(arr[i][j]>max)
				{
					max = arr[i][j];
				}
				rowSum[i] = max;
				max =0;
			}
		}
		
		for(int i=0; i<rowSum.length; i++)
		{
			System.out.println(rowSum[i]);
		}

	}

}
