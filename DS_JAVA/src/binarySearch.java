
public class binarySearch {
	public static int bSearch(int[] arr, int key)
	{
		int n = arr.length;
		int start = 0;
		int end = n-1;
		int mid = end + (start-end)/2;
		
		while(start <= end)
		{
			if(arr[mid] == key)
			{
				return mid;
			}
			else if(arr[mid] < key)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		 mid = end + (start-end)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10,15,20,25,30};
		
		System.out.println(bSearch(arr,10));

	}

}
