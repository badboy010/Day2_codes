package Day2;
import java.util.Scanner;
public class EmpSalCal {

		static double calculateSalary(double s) {
			double sal = s, fsal;
			if (sal >= 50000)
				fsal = sal + (sal * 0.2);
			else 
				fsal = sal + (sal * 0.1);
			return fsal;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary :");
		double sal = sc.nextDouble();
		System.out.println("Final Salary : " + calculateSalary(sal));
		sc.close();
	}

}
