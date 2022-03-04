import java.util.*;

public class zigZag {
	
	
	public static void rizz(int n)
	{
		if(n==0)
        return;
		
		System.out.println("Pre "+n);
		rizz(n-1);
		System.out.println("In "+n);
		rizz(n-1);
		System.out.println("Post "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		rizz(n);
		

	}

}
