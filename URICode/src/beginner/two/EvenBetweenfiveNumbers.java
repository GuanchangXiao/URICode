package beginner.two;

import java.util.Scanner;

public class EvenBetweenfiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int total=0;
		if(a%2==0)
			total++;
		if(b%2==0)
			total++;
		if(c%2==0)
			total++;
		if(d%2==0)
			total++;
		if(e%2==0)
			total++;
		System.out.println(total+" valores pares");
	}
}
