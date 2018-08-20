package beginner.four;

import java.util.Scanner;

public class ArrayfillI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int v = scanner.nextInt();
		for(int i=0;i<10;i++){
			System.out.println("N["+i+"] = "+(int)Math.pow(2, i)*v);
		}
	}
}
