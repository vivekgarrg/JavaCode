
public class R1 {
	
	public static boolean isArraySorted(int arr[] )
	{
		boolean b = false;
		if(arr.length == 0 || arr.length == 1  )
		{
			return true;
		}
		
		if(arr[0] > arr[1])
		{
			return false;
		}
		
		b = isArraySorted(arr);
		return b; 
	}

	public static void main(String[] args) {
		System.out.println("Hello Recursion 1");

	}

}
