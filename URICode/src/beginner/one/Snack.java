package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int code = scanner.nextInt();
		int qua = scanner.nextInt();
		double total=0;
		switch (code) {
		case 1:
			total=4.0*qua;
			break;
		case 2:
			total=4.5*qua;
			break;
		case 3:
			total=5.0*qua;
			break;
		case 4:
			total=2.0*qua;
			break;
		case 5:
			total=1.5*qua;
			break;
		default:
			break;
		}
		DecimalFormat dec=new DecimalFormat("0.00");
		System.out.println("Total: R$ "+dec.format(total));
	}

}
