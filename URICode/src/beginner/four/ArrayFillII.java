package beginner.four;

import java.util.Scanner;

public class ArrayFillII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[1000];
		int j=0;
		for(int i=0;i<1000;i++){
			a[i]=j;
			System.out.println("N["+i+"] = "+j);
			j++;
			if(j==n)
				j=0;
		}
	}
}
