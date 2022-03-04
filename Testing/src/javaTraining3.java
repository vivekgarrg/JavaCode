import java.util.*;

public class javaTraining3 {
	
	public static boolean checkString(String str1, String str2)
	{
		int one = str1.length();
		int two = str2.length();
		if(one==two)
		{
		for(int i=0; i<one; i++)
		{
			if(str1.charAt(i)!=str2.charAt((two-1)-i))
				return false;
		}
		}else
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(checkString(str1, str2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
