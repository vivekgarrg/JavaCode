import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(15);
		arr.add(15);
		
		//to set a value at particular value
		arr.set(0, 50);
		
		//for adding element at particular element 
		arr.add(1,20);
		
		//For removing a particular value
		Integer j = 50;
		arr.remove(j);
		//For Each Loop
		for(int i:arr)
		{
			System.out.println(i);
		}
		System.out.println(arr);
		
	}

}
