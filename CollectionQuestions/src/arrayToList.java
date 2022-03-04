import java.util.*;
public class arrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		ArrayList list = new ArrayList();
		
		for(int i=0; i<arr.length; i++)
		{
			list.add(arr[i]);
		}
		System.out.println(list);
		
		//finding the length of the arraylist
		
		System.out.println(list.size());

	}

}
