
public class StringReverse {
	public static String stringReverse(String str)
	{
		String ans ="";
		
		int start=0, end=0;
		for(int i=0;i<str.length();i++)
		{
			
			String reverse = "";
			if(str.charAt(i)==' ')
			{
				end = i-1;
		        for(int j=start; j<=end;j++)
		        {
		        	reverse = str.charAt(j) + reverse;
		        }
		        ans +=reverse + " ";
		        start = i+1;
			}	
		}
		    String rev="";
		   for(int j=end + 2; j<str.length();j++)
	        {
	        	rev = str.charAt(j) + rev;
	        }
	        ans +=rev;
		return ans;
	}

	public static void main(String[] args) {
		String str = "abc def ghi jkl mno";
		String reverse = stringReverse(str);
		System.out.println(reverse);
		

	}

}
