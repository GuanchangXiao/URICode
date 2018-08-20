package beginner.four;

import java.util.Scanner;

public class ArrayReplacementI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0;i<10;i++){
			int t = scanner.nextInt();
			array[i]=t;
			if(t<=0)
				array[i]=1;
			System.out.println("X["+i+"] = "+array[i]);
		}
	}
}
