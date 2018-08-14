package beginner.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float A = scanner.nextFloat();
		float B = scanner.nextFloat();
		float C = scanner.nextFloat();
		double pi = 3.14159;
		double TRIANGULO = A*C*0.5;
		double CIRCULO = pi*C*C;
		double TRAPEZIO = (A+B)*C*0.5;
		double QUADRADO = B*B;
		double RETANGULO = A*B;
		DecimalFormat dec = new DecimalFormat("0.000");
		System.out.println("TRIANGULO: "+dec.format(TRIANGULO));
		System.out.println("CIRCULO: "+dec.format(CIRCULO));
		System.out.println("TRAPEZIO: "+dec.format(TRAPEZIO));
		System.out.println("QUADRADO: "+dec.format(QUADRADO));
		System.out.println("RETANGULO: "+dec.format(RETANGULO));
	}
}
