package lab_question;

import java.util.Scanner;

abstract class Reservation{
    abstract void Reserve();
}

class ReserveTrain extends Reservation{
	int train_no,age;
	String name,des; 
	
	public void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n**********************");
		
		System.out.print("\nEnter Train no :");
		train_no = sc.nextInt();
		
		sc.nextLine();	
		System.out.print("\nEnter name :");
		name = sc.nextLine();
		
		System.out.print("\nEnter age :");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("\nEnter Destination :");
		des = sc.nextLine();
	}
	
	public void Reserve(){
		getData();
		System.out.println("\nSeats reserved successfully!!");
    }
}

class ReserveBus extends Reservation {
	int bus_no,age;
	String name,des;
	
	public void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n**********************");
		
		System.out.print("\nEnter Bus no :");
		bus_no = sc.nextInt();
		
		sc.nextLine();	
		System.out.print("\nEnter name :");
		name = sc.nextLine();
		
		System.out.print("\nEnter age :");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("\nEnter Destination :");
		des = sc.nextLine();
	}
	
    public void Reserve(){
		getData();
        System.out.println("\nSeat reserved successfully!!\n");
    }
}
   
public class  MainClass{
    public static void main(String args[]){
		ReserveTrain rt = new ReserveTrain();
        ReserveBus rb = new ReserveBus();
		
		Scanner sc = new Scanner(System.in);
		
		char ch='y';
		while(ch == 'y' || ch == 'Y'){
			System.out.println("\n1.Reserve Train\n2.Reserve Bus");
			System.out.print("\nEnter Option :");
			int op = sc.nextInt();
			
			switch(op)
			{
				case 1:
					rt.Reserve();
					break;
				case 2:
					rb.Reserve();
					break;
				default:
					System.out.println("Invalid Option ");
			}
			System.out.println("do u want to continue y/n ");
			ch = sc.next().charAt(0);
			if(!(ch=='y' || ch=='Y' || ch=='n' || ch=='N'))
				System.out.println("Invalid Input..");
		}
    }
}