import java.util.Arrays;

public class One {
	public static int countPreSorted(int arr[])
	{
		int count = 0;
		int arr1[] = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			arr1[i] = arr[i];
		}
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++ )
		{
			if(arr1[i] == arr[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int count = countPreSorted(arr);
		System.out.println(count);
	}

}
