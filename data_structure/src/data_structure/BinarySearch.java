package data_structure;

public class BinarySearch {
	public static int Search(int []arr, int a)
	{
		int start =0;
		int end = arr.length -1;
		int mid = (end-start)/2;
		while(start <= end)
		{
			if(arr[mid]>a)
			{
				end = mid-1;
			}
			else if(arr[mid]<a)
			{
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	//recursive function for binary search
	public static int RBSearch(int arr[], int l, int r, int key)
	{
		if(r>=l && l<=arr.length-1)
		{
			int mid = l + (r-l)/2;
			
			if(arr[mid] == key)
				return mid;
			else if(arr[mid]>key)
				return RBSearch(arr,l,mid-1,key);
			else
				return RBSearch(arr,mid+1,r,key);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		int index = Search(arr, 2);
//		System.out.println(index);
		
		System.out.println("Vivek : "+" "+arr);
		int result = RBSearch(arr,0,arr.length-1,7);
		System.out.println(result);

	}

}
