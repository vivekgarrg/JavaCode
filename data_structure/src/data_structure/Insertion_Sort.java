package data_structure;

import java.util.Scanner;

public class Insertion_Sort {
   
	public static void insert_sort(int[] arr)
	{
	int n = arr.length;
	for(int i=1; i<n; i++)
	{
		int j = i-1;
		int temp = arr[i];
		while(j>=0 && arr[j]>temp)
		{
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = temp;
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
          insert_sort(arr);
          print_arr(arr);
	  }
}
