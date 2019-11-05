package Practice;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		char operator;
		double answer = 0.0;

		System.out.println("Welcome to Simple Calculator :)");

		System.out.println("Enter the first value:");
		num1 = input.nextInt();

		System.out.println("Enter the Second value:");
		num2 = input.nextInt();

		System.out.println("What operation do you to perform?");
		operator = input.next().charAt(0);

		switch (operator) {

		case '+':
			answer = num1 + num2;
			break;
		case '-':
			answer = num1 - num2;
			break;
		case '*':
			answer = num1 * num2;
			break;
		case '/':
			answer = num1 / num2;

		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
		input.close();
	}

}
