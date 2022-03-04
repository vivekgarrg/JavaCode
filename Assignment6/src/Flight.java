
public class Flight {
	private int flight_no;
	private String destination;
	private float distance;
	private float fuel;
	
	private float CalFuel(float distance)
	{
		if(distance <= 1000)
		{
			 fuel = 500;
		}
		else if(distance >1000 && distance <= 2000)
		{
			 fuel = 1100;
		}
		else if(distance > 2000)
		{
		  fuel = 2200;	
		}
		return fuel;
	}
	 public void FEEDINFO(int flightno, String des, float dis )
	 {
		 flight_no = flightno;
		 destination = des;
		 distance = dis;
		 fuel = CalFuel(dis);
		 
	 }
	 public void SHOWINFO() {
		 System.out.println("Flight no: "+flight_no);
		 System.out.println("Destination : "+destination);
		 System.out.println("Distance: "+distance);
		 System.out.println("Fuel Required: "+fuel);
	 }

	public static void main(String[] args) {
		
		Flight f=new Flight();
		f.FEEDINFO(2001,"chennai", 3444.5F);
		f.SHOWINFO();
		
	
	}

}
