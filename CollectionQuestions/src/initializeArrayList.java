
import java.util.*;
public class initializeArrayList {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 ArrayList list = new ArrayList();
	 
	 for(int i=0; i<n; i++)
	 {
		list.add(sc.nextInt()); 
	 }
	 System.out.println(list);

	}

}
