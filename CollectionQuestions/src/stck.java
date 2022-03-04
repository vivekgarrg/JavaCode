import java.util.*;
public class stck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<String> s = new Stack<>();
       s.push("A");
       s.push(null);
       s.push("vivek");
       System.out.println(s);
       s.pop();
       s.pop();
       System.out.println(s.empty());
	    System.out.println(s.peek());
	    System.out.println(s.search("A"));
	}
	

}
