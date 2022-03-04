import java.util.Scanner;
public class javaTraining1 {
	
	public static boolean squareMatrix(int[][] arr,int n)
	{
		//forward diagonal
				int f_diagonal = 0;
				for(int i=0; i<n; i++)
				{
					f_diagonal += arr[i][i];
				}
				//backward diagonal
				int b_diagonal = 0;
				for(int i=n-1; i>=0; i--)
				{
					int j = 0;
						b_diagonal += arr[i][j];
						j++;
				}
				if(f_diagonal != b_diagonal)
					return false;
		
		
		int rowSum[] = new int[n]; 
		int colSum[] = new int[n];
		int row_sum = 0;
		int col_sum = 0;
		//row and column sum for square matrix
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++ )
			{
				row_sum += arr[i][j];
				col_sum += arr[j][i];
			}
			rowSum[i] = row_sum;
			colSum[i] = col_sum;
			row_sum =0;
			col_sum =0;
			if(rowSum[i]!=colSum[i] || f_diagonal != rowSum[i])
				return false;
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[][] = new int[n][n];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = scan.nextInt();
			}
		}
		if(squareMatrix(arr, n))
			System.out.println("Square Matrix");
		else
			System.out.println("No");
		
		
	}

}
