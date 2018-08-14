package beginner.one;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Average1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double MEDIA = (A*0.35+B*0.75)/1.1;
		DecimalFormat dec = new DecimalFormat("0.00000");
		String s= dec.format(MEDIA);
		System.out.println("MEDIA = "+s);
	}

}