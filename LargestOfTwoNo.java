package Day2;
import java.util.Scanner;
public class LargestOfTwoNo {
	public static int findLargest(int a, int b) {
		int n= 0;
		if (a > b)
			n = a;
		else if(b > a)
			n = b;
		else if (a == b)
			n = a;
		return n;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First no.: ");
		int f = sc.nextInt();
		System.out.println("Enter Second no.: ");
		int s = sc.nextInt();
		System.out.println("The Largest no. is : "+findLargest(f,s));
		
	}

}
