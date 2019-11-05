package Practice;
import java.util.Scanner;
public class Array {

public static void main(String[] args) {
		
		final int Num_Employees = 7;
		int[] employeeID = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
		

		System.out.println("Enter the " + Num_Employees + " employee's work hours and payrate:");
		
		double[] wages = returnWages(employeeID);

		System.out.println("The hours and payrate entered are as follows:");
		
		for (int i = 0; i < employeeID.length; i++) 
		{

			System.out.printf("The total wages for the employees #%d is $%.2f\n " , employeeID[i] , wages[i]);

		}

	}

	public static double[] returnWages(int[] employeeID) {
		final int Num_Employees = 7;
		int[] hours = new int [Num_Employees];
		double[] payrate = new double[Num_Employees];
		double[] wages = new double[Num_Employees];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < Num_Employees; i++) 
		{

			System.out.println("Employees number " + employeeID[i] + " hours : ");
			hours[i] = input.nextInt();
			while (hours[i] < 0) {

				System.out.println("Please enter a positive Number!");

				System.out.println("Employees number " + employeeID[i] + " hours : ");
				hours[i] = input.nextInt();

			}
			System.out.println("Enter the payrate of the current employee:");
			payrate[i] = input.nextDouble();
			
			while (payrate[i] < 6) {

				System.out.println("Enter the payrate of the current employee:");
				payrate[i] = input.nextDouble();

			}

			wages[i] = hours[i] * payrate[i];

		}

		return wages;
		
		
	}
	
	
	
}

	
	
	
	
	
	

