package beginner.one;

import java.util.Scanner;

public class TheGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer A = scanner.nextInt();
		Integer B = scanner.nextInt();
		Integer C = scanner.nextInt();
		Integer max=A;
		if(B>max)
			max=B;
		if(C>max)
			max=C;
		System.out.println(max+" eh o maior");
	}

}
