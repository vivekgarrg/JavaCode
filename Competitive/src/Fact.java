import java.math.BigInteger;

public class Fact {

	public static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		
		long m =(long)Math.pow(10, 9)+7;
		int res1 = fact(n-1);
		long ans1 = res1%m;
		long ans2 = n%m;
		long res = (ans1*ans2);
		int ans = (int)(res%m);
		
		return ans;
		
	}
	public static void main(String[] args) {
		int n = fact(33);
		System.out.println(n);

	}

}
