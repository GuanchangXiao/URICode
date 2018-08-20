package beginner.four;

import java.util.Scanner;

public class SimpleFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s=1;
		for(int i=1;i<=n;i++)
			s*=i;
		System.out.println(s);
	}
}
