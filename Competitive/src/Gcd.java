
public class Gcd {

	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = gcd(16,4);
		System.out.println(r);

	}

}
