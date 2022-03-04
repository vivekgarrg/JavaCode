
import java.util.*;
public class inbuiltQueue {

	public static void main(String[] args) {
		Queue<Integer> qu =  new LinkedList<>();
		
		qu.add(10);
		System.out.println(qu);
		qu.add(20);
		qu.add(30);
		qu.add(40);
		qu.remove(10);
		System.out.println(qu);
		System.out.println(qu.peek());

	}

}
