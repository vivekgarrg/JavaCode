
public class t1 {

	public static int check(int arr[])
	{
		int count = 0;
		
		for(int i=0;i<arr.length; i++)
		{
			for(int j=1; j<arr.length; j++)
			{
				if(i==j)
					continue;
				else if((arr[i]+arr[j])%3==0)
					count++;
			}
		}
		
		for(int i=0;i<arr.length; i++)
		{
			for(int j=1; j<arr.length; j++)
			{
				for(int k=2;k<arr.length;k++)
				{
					if(i==j || j==k)
						continue;
					else if((arr[i]+arr[j]+arr[k])%3==0)
					{
						count++;
					}
				}
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
	int arr[] = {4,5,3,6,2};
	int count = check(arr);
	System.out.println(count);

	}

}
