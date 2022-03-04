import java.util.Scanner;

public class specialMatrix {
	public static void matrixProcess(long[][] matrix, int size)
	{
	long row[] = new long[size];
	long col[] = new long[size];
	
	long sum =0;
		for(int i=0; i<size; i++)
		{
			
			for(int j=0; j<size; j++)
			{
				sum = sum + matrix[i][j]; 
			}
			row[i] = sum;
			sum = 0;
		}
		for(int i=0; i<size; i++)
		{
			
			for(int j=0; j<size; j++)
			{
				sum = sum + matrix[j][i]; 
			}
			col[i] = sum;
			sum = 0;
		}
		
		boolean b= false;
		long row_sum = row[0];
		int row_index = 0;
		for(int k=0; k<size; k++)
		{
			if(row[k]==col[k])
			{
				b= true;
				if(row[k]>row_sum)
				{
					row_sum = row[k];
					row_index = k;
				}
			}
			else
			{
				b=false;
			}
		}
		if(b==true)
		{
			System.out.print(row_index + " " + row_sum);
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long arr[][] = new long[n][n];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = scan.nextLong(); 
			}
		}
		
		matrixProcess(arr,n);

	}

}
