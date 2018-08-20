package beginner.four;

import java.util.Scanner;

public class SumofConsecutiveOddNumbersIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			if (x % 2 == 0)
				x = x + 1;
			System.out.println((x+y-1)*y);
		}
	}
}
