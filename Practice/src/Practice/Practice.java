package Practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int id;
		double grosspay , statetax , federaltax , netpay;
		
		System.out.println("Enter the Employees ID:");
		id = scanner.nextInt();
		
		while (id < 0) {
			
			System.out.println("Renter a Positive Value:");
			id = scanner.nextInt();
			
			continue;
					
		}
		
		while (id > 0 ) {
			System.out.println("Enter the Gross pay: ");
			grosspay = scanner.nextDouble();
			
			if (grosspay > 0) {
				
				System.out.println("Renter the Gross pay: ");
				grosspay = scanner.nextDouble();
			  }
			
		     System.out.println("Enter the State tax:");
		     statetax = scanner.nextDouble();
		     
			if (statetax < 0) {
				
				System.out.println("Renter the State tax :");
				statetax = scanner.nextDouble();
				
			
			}
			
			System.out.println("Enter the Federal Tax:");
			 federaltax = scanner.nextDouble();
			 
			 if(federaltax < 0) {
				 
				 System.out.println("Renter the federal tax : ");
				 federaltax = scanner.nextDouble();
				 
			 }
			
			 if (statetax > grosspay || federaltax > grosspay ) {
				 
				 System.out.println("Please Renter the state tax:");
				 statetax = scanner.nextDouble();
				 
				 System.out.println("Please Renter the federal tax:");
				 federaltax = scanner.nextDouble();
			 }
				 
			if ((statetax + federaltax) > grosspay) {
				
				System.out.println("Please Renter the gross pay:");
				
				
				continue;
				
				
			}	 
				 
			
			 netpay = grosspay - statetax - federaltax;
			 System.out.println("The Gross pay: " + grosspay);
			 System.out.println("The State Tax: " + statetax);
			 System.out.println("The Federal Tax : " + federaltax);
			 System.out.println("The Net Pay : " + netpay);
			 
			 
			 
			 
			 
		}
		
		scanner.close();
		
	}

}
