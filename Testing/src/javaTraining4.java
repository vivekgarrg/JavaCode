import java.util.*;

public class javaTraining4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%7==0 || number%10==7)
			System.out.println("It is a Buzz Number");
		else
			System.out.println("It is not a Buzz Number");

	}

}
