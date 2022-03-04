package data_structure;

import java.util.Scanner;

public class Selection_sort {
	public static void  selection_sort(int[] arr)
	{
		
		for(int i=0; i<arr.length-1; i++) //running the loop from 0 to n-1;
		{
		
		int minimum = Integer.MAX_VALUE; // taking maximum value in minimum variable type
		int min_index = -1; // taking index of j 
		for(int j =i; j<arr.length;j++) //we will run the j loop till n from the i index ;
		{
			if(arr[j]<minimum) // if value at j index is minimum then we will store it in minimum;
			{
				minimum= arr[j];
				min_index = j;
				System.out.println(minimum +"value of minimm" );
			}
	    }
		int temp = arr[min_index];
		arr[min_index] = arr[i];
		arr[i] = temp;
		
		}
	}

	public static void print_arr(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
       System.out.println("Enter the array length");
       
       Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
		int arr[]  = new int[n];
        for(int i=0; i<n; i++)
        {
	       arr[i] = scan.nextInt();
        }
       selection_sort(arr);	
       print_arr(arr);
	
	}

}
