package beginner.one;

import java.util.Scanner;

public class SimpleProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer A = scanner.nextInt();
		Integer B = scanner.nextInt();
		Integer PROD = A * B;
		System.out.println("PROD = "+PROD);
	}

}
