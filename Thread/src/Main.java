class MyThread extends Thread
{
	int[] arr = new int[5];
	MyThread(int[] arr)
	{
		this.arr = arr;
	}
	public void run()
	{
	for(int i=0; i<arr.length; i++)
	{
	 arr[i] = arr[i] + 4;
	 System.out.println(arr[i] + "thread 1 ");
	}
	System.out.println();
	}
}
class MyThread1 extends Thread
{
	int[] arr = new int[20];
	int sum =0;
	MyThread1(int[] arr)
	{
		this.arr = arr;
	}
	public void run()
	{
	for(int i=0; i<arr.length; i++)
	{
	 arr[i] = arr[i] + 5;
	 System.out.println(arr[i] + "thread 2 ");
	}
	System.out.println();
	}
}
public class Main{

	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		MyThread t=new MyThread(arr);
		MyThread1 t1 = new MyThread1(arr);
		t.start();
		t1.start();
	
	}

}
