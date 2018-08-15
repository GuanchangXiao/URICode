package beginner.one;

import java.util.Scanner;

public class SelectionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer A = scanner.nextInt();
		Integer B = scanner.nextInt();
		Integer C = scanner.nextInt();
		Integer D = scanner.nextInt();
		if(B>C&&D>A&&((C+D)>(A+B)&&C>0&&D>0&&(A%2==0)))
			System.out.println("Valores aceitos");
		else {
			System.out.println("Valores nao aceitos");
		}
	}
}
