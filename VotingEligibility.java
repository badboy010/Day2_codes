package Day2;
import java.util.Scanner;
public class VotingEligibility {
	public static boolean isEligible(int age) {
		boolean a;
		if (age >= 18)
			a = true;
		else
			a = false;
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person's Age :");
		int age = sc.nextInt();
		System.out.println(isEligible(age));
		sc.close();
	}

}
