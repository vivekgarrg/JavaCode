package data_structure;


public class Merge_two {
	
    public static 	void sort(int arr[], int l, int r)
	{
		if(l<r)
		{
			int m = l + (r-l)/2;
			
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			
			 merge_two(arr,l,m,r);
			
		}
		
	
	}

	public static int[] merge_two(int[] arr1, int l,int m, int n)
	{
	
		int arr[] = new int[m+n];
		int i=l;
		int j=m+1;
		int k=0;
		while(i<m && j<n)
		{
			if(arr1[i]<=arr1[j])
			{
				arr[k] = arr1[i];
				i++;
				k++;
			}
			else
			{
				arr[k] = arr1[j];
				j++;
				k++;
			}
		}
		while(i<m)
		{
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n)
		{
			arr[k] = arr1[j];
			j++;
			k++;
		}
		return arr;
	}
	public static void print_arr(int[] arr) {
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
      
		int arr2[]  = {2,3,8,11,34,60,100,5,6,98,45};
        sort(arr2,0,arr2.length-1);
//        print_arr(arr2);
	
	}

}
