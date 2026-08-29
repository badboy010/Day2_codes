package Day2;
import java.util.Scanner;
public class ProductDis {

	public static double calculateFinalPrice(double p) {
		double price = p;
		double finalamt = 0;
		if (price >= 10000)
			finalamt = price - (price * 0.2);
		else if (price >= 5000 && price <= 9999)
			finalamt = price - (price * 0.1);
		else if (price >= 2000 && price <= 4999)
			finalamt = price - (price * 0.05);
		else if (price <= 2000)
			finalamt = price;
		return finalamt;
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Product ID : ");
	int id = sc.nextInt();
	System.out.println("Enter the Product Name : ");
	String pn = sc.next();
	System.out.println("Enter the Price : ");
	int p = sc.nextInt();
	System.out.println("The Final Price is :"+calculateFinalPrice(p));

	}

}
