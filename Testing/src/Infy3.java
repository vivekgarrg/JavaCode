import java.util.*;

public class Infy3 {

	public static String otpString(String str) {
		ArrayList<Character> s = new ArrayList<Character>();
		
		for(int i=1; i<str.length();i=i+2) {
			
			s.add(str.charAt(i));
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(Character a:s) {
			Integer a1 = Character.getNumericValue(a);
			arr.add(a1); 
		}
	
		String s1="";
		for(int i:arr) {
			int b = i*i;
			s1+=b;
			
		}
		str = s1.substring(0,4);
		return str;
	}
	public static void main(String[] args) {
		String str = "5624381275";
		System.out.println(otpString(str));

	}

}
