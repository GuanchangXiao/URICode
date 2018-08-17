package beginner.three;

import java.util.Scanner;

public class SquaredandCubic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int b = i*i,c=i*b;
			System.out.println(i+" "+b+" "+c);
		}
	}
}
