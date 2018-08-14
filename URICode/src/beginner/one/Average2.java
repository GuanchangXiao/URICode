package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		double MEDIA = (A*2+B*3+C*5)/10;
		DecimalFormat dec = new DecimalFormat("0.0");
		String s= dec.format(MEDIA);
		System.out.println("MEDIA = "+s);
	}

}
