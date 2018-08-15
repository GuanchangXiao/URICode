package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelSpent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer time = scanner.nextInt();
		Integer speed = scanner.nextInt();
		double cost = (time*speed)/12.0;
		DecimalFormat decimalFormat=new DecimalFormat("0.000");
		String s=decimalFormat.format(cost);
		System.out.println(s);
	}

}
