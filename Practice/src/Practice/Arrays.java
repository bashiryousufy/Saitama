package Practice;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		double[][] m = createArray();
		double sum = 0.0;

		for (int column = 0; column < m.length; column++) {

			sum = sumOfRow(m, column);
			System.out.println("Sum of elements at row " + column + " is " + sum);

		}

	}

	public static double[][] createArray() {
		double[][] array = new double[3][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + array.length + "-by-" + array[0].length + " matrix row by row: ");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {

				System.out.println("Enter the row" + i + "and the column" + j);
				array[i][j] = input.nextDouble();

			}
			input.close();

		}
		return array;
		
	}

	public static double sumOfRow(double[][] m, int rowIndex) {

		double total = 0.0;

		for (int column = 0; column < m[0].length; column++) {

			total += m[rowIndex][column];

		}
		return total;

	}

}
