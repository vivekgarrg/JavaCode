import java.util.*;

public class ArrayTest {
	
	//Last index of key
	public static int lastIndex(int[] arr,int idx, int key)
	{
		if(idx == arr.length)
			return -1;
		
		int fiisa = lastIndex(arr,idx+1,key);
		if(fiisa  == -1)
		{
			if(arr[idx] == key)
				return idx;
			else
				return fiisa;
		}
		else
			return fiisa;
	}
	
	//First index of key
	public static int indexOfArr(int[] arr,int idx, int key)
	{
		if(idx  == arr.length)
			return -1;
		
		if(arr[idx] == key)
			return idx;
		else
			return indexOfArr(arr,idx+1,key);
	}
	
	//Print max element in an array
	public static int printMax(int[] arr, int idx)
	{
		if(idx == arr.length -1)
			return arr[idx];
		
		int misa = printMax(arr,idx+1);
		if(misa > arr[idx])
			return misa;
		else 
			return arr[idx];
	}
	
	//Print array in reverse order
	public static void printArrayReverse(int[] arr, int idx) {
		
		if(idx == arr.length)
			return;
	
		printArrayReverse(arr, idx+1);
		System.out.println(arr[idx]);
		
	}
	//Print elements of array
	public static void printArray(int[] arr, int idx)
	{
		if(idx == arr.length)
		{
			return;
		}
		
		System.out.println(arr[idx]);
		printArray(arr, idx+1);
	}

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int n = s.nextInt();
	  
	  int[] arr = new int[n];
	   for(int i=0; i<n; i++)
	   {
		   arr[i] = s.nextInt();
	   }
    
//	   printArray(arr, 0);
//	   printArrayReverse(arr,0);
	   
	   int max= printMax(arr,0);
	   System.out.println(max);
	   
//	   int index = indexOfArr(arr,0,6);
//	   System.out.println(index);
	   
	   int Lindex = lastIndex(arr,0,4);
	   System.out.println(Lindex);
	   
	}

}
