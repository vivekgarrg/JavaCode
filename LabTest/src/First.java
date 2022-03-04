import java.util.Scanner;

public class First {
	
	public static void speedLimit(int speed)
	{
		if(speed < 0)
		{
			System.out.println("Invalid speed");
		}
		if(speed<70  && speed >0)
		{
			System.out.println("Ok");
		}
		else
		{
			int actual_speed =  speed - 70;
			
			int point = actual_speed/5;
			
			if(point < 12 && point > 0)
			{
				System.out.println("Points: "+point);
			}
			else
			{
				System.out.println("License Cancelled.");
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed : ");
		int speed = sc.nextInt();
		speedLimit(speed);
		
		
		
		

	}

}
