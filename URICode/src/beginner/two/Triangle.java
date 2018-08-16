package beginner.two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		DecimalFormat dec=new DecimalFormat("00.0");
		if(a+b>c&&a+c>b&&b+c>a){
			System.out.println("Perimetro = "+dec.format(a+b+c));
			return;
		}else {
			float area = (float)((a+b)*c/2.0);
			System.out.println("Area = "+dec.format((area)));
			return;
		}
	}
}
