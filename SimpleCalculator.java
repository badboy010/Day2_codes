package cdacac.com;
import java.util.Scanner;
public class SimpleCalculator {
	static double calculate(double a, double b, char op) {
		if (op == '+') {
			return a + b;
		}
		else if (op == '-') {
			return a - b;
		}
		else if (op == '*') {
			return a * b;
		}
		else if ( op == '/') {
			if (b == 0) {
				System.out.println("cannot divide by zero");
				return 0;
			}
			return a/b;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no. ");
		double num1 = sc.nextDouble();
		System.out.println("Enter the second no. ");
		double num2 = sc.nextDouble();
		System.out.println("Enter the Operator(+, -, *, /): ");
		char op = sc.next().charAt(0);
		double result = calculate(num1, num2, op);
		System.out.println("Result = "+result);
	}
	

}
