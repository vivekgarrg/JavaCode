import java.util.*;
public class LinkedHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.4 V 
		LinkedHashSet lhs = new LinkedHashSet();//Insertion order is preserved because it uses linked list data structure 
		
		
		//adding items to the hashSet
		lhs.add(5);
		lhs.add("Vivek");
		lhs.add("A");
		
		
		System.out.println(lhs.add("A")); //No duplicate data is stored.
		
		System.out.println(lhs);
		
		//this is generally used in the cache memory because no duplicates are
		//allowed and insertion order is preserved..
		
		
		

	}

}
