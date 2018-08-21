package beginner.five;

import java.util.Scanner;

public class BobConduit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a+b);
		}
	}
}
