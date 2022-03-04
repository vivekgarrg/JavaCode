import java.util.ArrayList;

public class Infy2 {

	public static String reverseString(String str) {
		ArrayList<Character> ch = new ArrayList<Character>();
		
	
		
		for(int i=0; i<str.length(); i++)
		{
			boolean flag = false;
			for(int j=0; j<ch.size(); j++)
			{
				if(ch.get(j)==str.charAt(i))
				{
					flag = true;
				}
			}
			if(!flag)
			{
				ch.add(str.charAt(i)); 
			}
		}
		
		String s="";
		for(Character ch1:ch)
		{
			s = ch1+s;
		}
		
		str=s;
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "google";
    String s =reverseString(str);
    System.out.println(s);
	}

}
