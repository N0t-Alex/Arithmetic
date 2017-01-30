import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		int product;
		int difference;
		int quotient;
		
		System.out.print("Please enter your first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Please enter your second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		product = number1 * number2;
		difference = number1 - number2;
		quotient = number1 / number2;
		
		System.out.printf("The sum of %d and %d is %d.%n", number1, number2, sum);
		System.out.printf("The product of %d and %d is %d.%n", number1, number2, product);
		System.out.printf("The difference between %d and %d is %d.%n", number1, number2, difference);
		System.out.printf("The quotient of %d and %d is %d.%n", number1, number2, quotient);

	}

}
