import java.util.*;
public class DataSmoothing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the total number of data");
		int n =sc.nextInt();
		System.out.println("Enter the data:--->");
		for(int i=0; i<n; i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println("Enter the no.  of bin");
		int bin = sc.nextInt();
		
		ArrayList<List<Integer>> result = new ArrayList<>();
		
		int sizeOfBin = list.size()/bin;
		int from = 0;
		int to =sizeOfBin;
		for(int i=0; i<bin; i++)
		{
			List<Integer> a= list.subList(from, to);
			result.add(a);
			from = to;
			to += to;
			
		}
		
//	     for(List<Integer> a:result ) {
//	    	 String str = a+"";
//	    	str = str.substring(1);
//	    	str = str.substring(0, str.length()-1);
//	    	System.out.print(str);
//	     }
		
		for(int i=0; i<bin; i++)
		{
			for(int j=0; j<result.get(i).size(); j++)
			{
				System.out.print(result.get(i).get(j)+",");
			}
			System.out.println();
		}
		
		
	}

}
