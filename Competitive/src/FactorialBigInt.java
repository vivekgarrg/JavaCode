import java.math.BigInteger;

public class FactorialBigInt {

	public static void main(String[] args) {
	    BigInteger fact = BigInteger.valueOf(1);
	    System.out.println(fact);
	    for (int i = 1; i <= 8785856; i++)
	        fact =  fact.multiply(BigInteger.valueOf(i));
	 
	    
	    System.out.println(fact);
	}

}
