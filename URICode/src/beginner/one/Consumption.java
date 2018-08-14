package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Consumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer X = scanner.nextInt();
		float Y = scanner.nextFloat();
		float xh = X / Y;
		DecimalFormat dec = new DecimalFormat("0.000");
		String string = dec.format(xh);
		System.out.println(string+" km/l");
	}

}
