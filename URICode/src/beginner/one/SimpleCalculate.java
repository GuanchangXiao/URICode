package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		double sl1 = scanner.nextInt();
		double price1 = scanner.nextDouble();
		int number2 = scanner.nextInt();
		double sl2 = scanner.nextInt();
		double price2 = scanner.nextDouble();
		double total = sl1*price1+sl2*price2;
		DecimalFormat dec = new DecimalFormat("0.00");
		String s=dec.format(total);
		System.out.println("VALOR A PAGAR: R$ "+s);
	}

}
