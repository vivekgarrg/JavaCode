package data_structure;

public class MergeSort 
{
	public static void conqure(int arr[], int si,int mid, int ei)
	{
		int arr1[] = new int[mid-si +1];
		int arr2[] = new int[ei-mid];
		
		int n1 = arr1.length;
		int n2= arr2.length;
		
		for(int i=0; i<n1;i++)
		{
			arr1[i] = arr[si+i];
		}
		for(int j=0; j<n2; j++)
		{
			arr2[j] = arr[mid+1+j];
			
		}
		int i=0;
		int j=0; 
		int k = si;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k] = arr1[i];
				i++;
			}
			else
			{
				arr[k] = arr2[j];
				j++;
			
			}
			
			k++;
		}
		while(i<n1)
		{
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}
	
	public static void print(int arr[]) {
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
	}
	
	
	public static void divide(int arr[],int si,int ei)
	{
		
	   if(si>=ei)
		return;
	
		int mid =si + (ei-si)/2;
	
		divide(arr,si,mid);
		divide(arr,mid+1,ei);
		conqure(arr,si,mid,ei);
	
	
		
	}
		
	
	public static void main(String[] args) 
	{
		int arr[] = {6,3,2,9,5,8,16,6,87,56,89};
		int n=arr.length;
		divide(arr,0,n-1);
		print(arr);
	}

}