import java.util.*;

public class HashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();  
		int arr[] = {1,2,3,1,2,45,2,3,4,2,4,2,5};
		
		for(int i=0; i<arr.length; i++)
		{
			if(!m.containsKey(arr[i]))
			{
				m.put(arr[i], 1);
			}
			else
			{
				int k = (int)m.get(arr[i]);
				m.put(arr[i], ++k);
			}
		}
		int max = 0;
		int key = -1;
//		Set i = m.entrySet();
//		System.out.println(i);
		Collection c = m.values();
		System.out.println(c);
		for(Map.Entry h : m.entrySet())
		{
			if((int)h.getValue()>max) {
				max = (int)h.getValue();
				key = (int)h.getKey();
			}
		}
		
		System.out.println(m);
		System.out.println(max);
		System.out.println(key);
		

		
   
   
      

	}

}
