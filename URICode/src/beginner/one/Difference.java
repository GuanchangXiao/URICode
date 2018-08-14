package beginner.one;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer A = scanner.nextInt();
		Integer B = scanner.nextInt();
		Integer C = scanner.nextInt();
		Integer D = scanner.nextInt();
		Integer DIFERENCA = A*B-C*D;
		System.out.println("DIFERENCA = "+DIFERENCA);
	}

}
