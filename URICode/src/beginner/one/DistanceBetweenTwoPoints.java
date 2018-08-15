package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float x1 = scanner.nextFloat();
		float y1 = scanner.nextFloat();
		float x2 = scanner.nextFloat();
		float y2 = scanner.nextFloat();
		double pf = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		double dis = Math.sqrt(pf);
		DecimalFormat decimalFormat = new DecimalFormat("0.0000");
		String string = decimalFormat.format(dis);
		System.out.println(string);
	}

}
