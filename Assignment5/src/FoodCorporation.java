
public class FoodCorporation {
	
	double base_pay;
	int hours;

	public void Salary_Cal(double base_pay, int hours)
	{
		double total_salary = 0;
		
		if(hours <= 40)
		{
			total_salary = base_pay * hours;

			if(total_salary>80)
			{
			System.out.println(total_salary);
			}
			else
			{
				System.out.println("Error!!! base pay is less than the minimum wage");
			}
		}
		else if(hours > 40 && hours <= 60)
		{
			int extra_hours = hours - 40;
			total_salary = base_pay * 40 + (base_pay * 1.5 * extra_hours);
			if(total_salary>80)
			{
			System.out.println(total_salary);
			}
			else
			{
				System.out.println("Error!!! base pay is less than the minimum wage");
			}
		}
		else if(hours > 60)	
		{
		  System.out.println("Error!!! Working hours is more than 60");	
		}
	   }

	public static void main(String[] args) {
		FoodCorporation E1=new FoodCorporation();
		FoodCorporation E2=new FoodCorporation();
		FoodCorporation E3=new FoodCorporation();
		E1.base_pay = 7.5;
		E1.hours = 35;
		E2.base_pay = 8.20;
		E2.hours = 47;
		E3.base_pay = 10.00;
		E3.hours = 73;
		E1.Salary_Cal(E1.base_pay, E1.hours);
		E2.Salary_Cal(E2.base_pay, E2.hours);
		E3.Salary_Cal(E3.base_pay, E3.hours);
		       
	}

}
