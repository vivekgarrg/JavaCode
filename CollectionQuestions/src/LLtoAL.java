import java.util.*;

public class LLtoAL {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		
		System.out.println(list);
		list.addFirst(25);
		list.addLast(34);
		System.out.println(list.remove(3));
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		list.removeAll(list);
		System.out.println(list);
		
		
		//Converting Linked List to Array List---->
		
		
//		System.out.println(list);
//		ArrayList al = new ArrayList();
//		for(int i=0; i<list.size(); i++)
//		{
//		
//			al.add(list.get(i));
//		}
//		System.out.println(al);

	}

}
