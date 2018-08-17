package beginner.three;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<11;i++){
			System.out.println(i+" x "+n+" = "+i*n);
		}
	}
}
