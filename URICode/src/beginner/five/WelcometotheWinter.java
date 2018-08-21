package beginner.five;

import java.util.Scanner;

public class WelcometotheWinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a>b&&b<=c)
			System.out.println(":(");
		else if(a<b&&b>=c)
			System.out.println(":(");
		else if(a<b&&b<c&&(c-b)<(b-a))
			System.out.println(":(");
		else if(a<b&&b<c&&(c-b)>(b-a))
			System.out.println(":)");
		else if(a>b&&b>c&&(a-b)>(b-c))
			System.out.println(":)");
		else if(a>b&&b>c&&(a-b)<(b-c))
			System.out.println(":(");
		else if(a==b&&b<c)
			System.out.println(":)");
		else if(a==b&&b>c)
			System.out.println(":(");
	}
}
