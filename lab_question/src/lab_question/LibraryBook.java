package lab_question;

import java.util.Scanner;

interface Library{
	public void drawbook();
    public void returnbook();
	public int checkstatus();
}

class Book implements Library{
	Scanner sc = new Scanner(System.in);
		
		int book_no, total_copies, copies_issued;
		String name, author, publisher;
		float price;   	
		
		void getData(){
		System.out.println("\n**********************");
		
		System.out.print("Enter book no : ");
		book_no = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter book name :");
		name = sc.nextLine();
		
		System.out.print("Enter author name : ");
		author = sc.nextLine();
		
		System.out.print("Enter publisher : ");
		publisher = sc.nextLine();
		
		System.out.print("Enter price : ");
		price = sc.nextFloat();
		
		System.out.print("Enter Total copies :");
		total_copies = sc.nextInt();
		
		System.out.print("Enter no. of copies issued : ");
		copies_issued = sc.nextInt();
		
		System.out.println("\n**********************");
	}
	
	public void drawbook(){
		int a= checkstatus();
		if(a==1){
			copies_issued += 1;
		
			System.out.println("\n**********************");
			System.out.println("\nBook Issued Successfully...\n");
		}
		else{
			System.out.println("\n**********************");
			System.out.println("\nNot available!! All copies are already issued...\n");
		}
	}
	
	public void returnbook(){
		copies_issued -= 1;
		
		System.out.println("\n**********************");
		System.out.println("\nBook Returned Successfully...\n");
	}
	
	public int checkstatus(){
		if(copies_issued < total_copies) {
			System.out.println("\nBook available in the library");
			return 1;
		}
		else {
			return 0;
		}
	}
}

public class LibraryBook{
	public static void main(String arg[]){
		Book b = new Book();
		b.getData();
		Scanner sc = new Scanner(System.in);
		
		char ch='y';
		while(ch == 'y' || ch == 'Y'){
			System.out.println("1.drawbook\n2.returnbook");
			System.out.println("Enter Option");
			int op = sc.nextInt();
			
			switch(op)
			{
				case 1:
					b.drawbook();
					break;
				case 2:
					b.returnbook();
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