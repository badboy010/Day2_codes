package Day2;
import java.util.Scanner;

public class TempConv {

		public static double convertTemperature(Double celsius) { 
			double faherenheit = (celsius * 9/5) + 32;
			
					return faherenheit; 
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celcius :");
		double f = sc.nextDouble();
		System.out.println("Th Temperature from Celsius to Fahrenheit is :"+convertTemperature(f));
		sc.close();

	} 

}
