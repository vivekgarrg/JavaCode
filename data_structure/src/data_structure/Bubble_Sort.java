package data_structure;

import java.util.Scanner;

public class Bubble_Sort {

	public static void bubble_sort(int[] arr)
	{
		for(int i=0; i<arr.length -1; i++)
		{
			for(int j=0; j< arr.length - 1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
       bubble_sort(arr);	
       print_arr(arr);
	
	}

}
