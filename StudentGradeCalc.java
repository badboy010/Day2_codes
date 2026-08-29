package Day2;
import java.util.*;
public class StudentGradeCalc {
	
	public static void calculateGrade(int a) {
		if (a >= 90 && a<=100)
			System.out.println("Grade A");
		else if (a >=75 && a <= 89)
			System.out.println("Grade B");
		else if (a >=60 && a <= 74)
			System.out.println("Grade C");
		else if (a >= 50 && a <= 59)
			System.out.println("Grade D");
		else if (a<50)
			System.out.println("Grade F");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		int marks = sc.nextInt();
		calculateGrade(marks);
	}

}
