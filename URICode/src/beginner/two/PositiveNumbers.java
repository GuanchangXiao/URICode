package beginner.two;

import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		int total =0;
		if(a>0)
			total++;
		if(b>0)
			total++;
		if(c>0)
			total++;
		if(d>0)
			total++;
		if(e>0)
			total++;
		if(f>0)
			total++;
		System.out.println(total+" valores positivos");
	}
}
