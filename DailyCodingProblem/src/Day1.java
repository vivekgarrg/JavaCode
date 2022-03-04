import java.util.Arrays;

public class Day1 {
	
//	public static boolean checkSum(int[] arr, int k)
//	{
//		for(int i=0; i<arr.length-1; i++)
//		{
//			for(int j=1; j<arr.length; j++)
//			{
//				if(arr[i] + arr[j] == k)
//					return true;
//			}
//		}
//		
//		return false;
//	}
	
	public static boolean checkSum(int[] arr, int k)
	{
		Arrays.sort(arr);
		for(int l:arr)
		{
		System.out.println(l);
		}
		
		int i=0;
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]+arr[j]==k)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = {10,15,3,7};
		System.out.println(checkSum(arr,22));

		
	

	}

}
