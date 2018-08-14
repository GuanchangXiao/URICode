package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarywithBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		double salary = scanner.nextDouble();
		double sell = scanner.nextDouble();
		double total = salary+sell*0.15;
		DecimalFormat dFormat  = new DecimalFormat("0.00");
		String s = dFormat.format(total);
		System.out.println("TOTAL = R$ "+s);
	}
}
