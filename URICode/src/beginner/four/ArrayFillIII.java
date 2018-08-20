package beginner.four;

import java.util.Scanner;

public class ArrayFillIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		double d = scanner.nextDouble();
		for(int i=0;i<100;i++){
			System.out.printf("N[%d] = %.4f\n",i,d);
			d=d/2;
		}
	}
}
