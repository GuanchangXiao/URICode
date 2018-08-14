package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double n = 3.14159;
		double area = n*r*r;
		DecimalFormat dec = new DecimalFormat("0.0000");
		String s= dec.format(area);
		System.out.println("A = "+s);
	}

}
