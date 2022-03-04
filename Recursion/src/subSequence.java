import java.util.*;
public class subSequence {
	
	public static ArrayList<String> gss(String str)
	{
		if(str.length() == 0)
		{
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
			
		}
		
		char ch = str.charAt(0);
		ArrayList<String> rres = gss(str.substring(1));
		
		ArrayList<String> mres = new  ArrayList<String>();
		
		for(String a : rres)
		{
			mres.add(""+a);
			mres.add(ch+a);
		}
		
		return mres;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str = s.next();
		ArrayList<String> res = gss(str);
		
		for(String a:res) {
			System.out.print(a+" ");
		}

	}

}
