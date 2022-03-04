import java.util.*;
public class reverseDiagonal {
	
	public static void revDiag(int arr[][],int row)
	{
		//first row
		int sum[] = new int[row-1];
		int max_dig =0;
		int max = Integer.MIN_VALUE;
		int row1 = row;
		while(row1>0)
		{
		int i=row1-1;
		for(int j=0; j<row1; j++)
		{
			System.out.print(arr[i][j]);
		max_dig += arr[i][j]; 
		i--;
		}
		if(sum[0] == 0)
		sum[0] = max_dig;
		max_dig = 0;
		System.out.println();
		row1--;
		}
		
		System.out.println(sum[0]);
	//second row
		int row2 = row-1;
		while(row2>0)
		{
		int j = row2;
		for(int i=3; i>=row2;i--)
		{
		System.out.print(arr[i][j]);
			j++;
		}
		row2--;
		System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int row = scan.nextInt();
	int col = scan.nextInt();
	
	int arr[][] = new int[row][col];
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<col; j++)
		{
			arr[i][j] = scan.nextInt();
		}
	}
	

	
	
	revDiag(arr,row);

	}

}
