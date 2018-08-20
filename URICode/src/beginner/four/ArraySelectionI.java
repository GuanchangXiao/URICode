package beginner.four;

import java.util.Scanner;

public class ArraySelectionI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<100;i++){
			double x = scanner.nextDouble();
			if(x<=10)
				System.out.printf("A[%d] = %.1f\n",i,x);
		}
	}
}
