package data_structure;

public class LinearSearch {
	public static int LSearch(int []arr, int a)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == a)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int index = LSearch(arr, 11);
		System.out.println(index);

	}

}
