package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double n = 3.14159;
		double VOLUME = (4.0/3)*n*r*r*r;
		DecimalFormat dec = new DecimalFormat("0.000");
		String s = dec.format(VOLUME);
		System.out.println("VOLUME = "+s);
	}

}
