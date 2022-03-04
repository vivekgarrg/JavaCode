import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		ListIterator i = list.listIterator();
		int count = 0;
		while(i.hasNext())
		{
			
			System.out.println("count: "+count);
			Integer j = (Integer)i.next();
			System.out.println(j);
			count++;
		}
		while(i.hasPrevious())
		{
			Integer k = (Integer)i.previous();
			System.out.println(k);
		}
		
//		//converting list to object array
		Object arr[] = list.toArray();
		for(int k=0;k<arr.length; k++)
		{
			System.out.print(arr[k] + " ");
		}
		System.out.println();

		//converting object array to int array
		int arr1[] = new int[arr.length];
		
		for(int k=0; k<arr.length; k++)
		{
			arr1[k] =(int) arr[k];
			System.out.print(arr[k] + " ");
		}
		
		//checking value in ArrayList
		
		System.out.println(list.contains(1));
		

	}

}
