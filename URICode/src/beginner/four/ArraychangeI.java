package beginner.four;

import java.util.Scanner;

public class ArraychangeI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[20];
		for(int i=0;i<20;i++){
			int x = scanner.nextInt();
			a[19-i]=x;
		}
		for(int i=0;i<20;i++)
			System.out.println("N["+i+"] = "+a[i]);
	}
}
