package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int hours = scanner.nextInt();
		double per = scanner.nextDouble();
		double salay = hours*per;
		DecimalFormat dFormat  = new DecimalFormat("0.00");
		String s = dFormat.format(salay);
		System.out.println("NUMBER = "+number);
		System.out.println("SALARY = U$ "+s);
	}
}
