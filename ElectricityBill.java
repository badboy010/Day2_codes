package Day2;
import java.util.*;
public class ElectricityBill {
	
	public static double calculateBill(int unit){
		double billamt;
		if(unit > 0 && unit <= 100)
			billamt = unit * 2;
		else if (unit > 100 && unit <= 200)
			billamt = unit * 3;
		else if (unit > 200 && unit <= 300)
			billamt = unit * 5;
		else
			billamt = unit * 7;
		return (billamt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Units Consumed : ");
		int units = sc.nextInt();
		System.out.println("The Total Electricity Bill is :"+calculateBill(units));
		//calculateBill(units);
	}

}
