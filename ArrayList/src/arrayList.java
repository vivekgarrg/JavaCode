import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
//		list.remove(list.indexOf(5));
//		Object arr[] = new Integer[list.size()];
//		arr = list.toArray();
		
//		for(Object elem : arr)
//		{
//			System.out.print(elem + " ");
//		} 
		
		for(int elem : list)
		{
			System.out.println(elem + " ");
		}
		System.out.println(list.size());
	}

}
