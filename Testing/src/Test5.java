import java.util.Scanner;

public class Test5 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag = false;
		int n =sc.nextInt();
	   int arr[] = new int[n];
	   
	   for(int i=0; i<arr.length; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   int temp = 0;
	   int max = Integer.MIN_VALUE;
	   int min = Integer.MAX_VALUE;
	   for(int i=0; i<arr.length; i++)
	   {
		   flag = false;
		   temp = arr[i];
		   
		   for(int j=2; j <= temp/2; j++)
		   {
			   if(temp%j==0)
			   {
				   flag = true;
				   break;
			   }
		   }
		   System.out.println(flag);
		   if(!flag) {
			   
		   if(temp>max)
			   max=temp;
		   if(temp<min)
			   min=temp;
		   }		   
	   }
		
	   System.out.println(max);
	   System.out.println(min);
	

}
}
