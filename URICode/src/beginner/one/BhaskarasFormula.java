package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BhaskarasFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();
		if(A==0){
			System.out.println("Impossivel calcular");
			return;
		}
		else if(((B*B-4*A*C))<0){
			System.out.println("Impossivel calcular");
			return;
		}
		else {
			double R1 = (-B + Math.sqrt(B*B-4*A*C))/(2.0*A);
			double R2 = (-B - Math.sqrt(B*B-4*A*C))/(2.0*A);
			DecimalFormat dec=new DecimalFormat("0.00000");
			System.out.println("R1 = "+dec.format(R1));
			System.out.println("R2 = "+dec.format(R2));
			return;
		}	
	}
}
