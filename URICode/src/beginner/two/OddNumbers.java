package beginner.two;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=1;i<=num;i++){
			if(i%2==1)
				System.out.println(i);
		}
	}
}
