package beginner.two;

import java.util.Scanner;

public class EvenSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=2;i<=num;i++){
			if(i%2==0)
				System.out.println(i+"^2"+" = "+i*i);
		}
	}
}
