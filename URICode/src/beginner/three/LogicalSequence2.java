package beginner.three;

import java.util.Scanner;

public class LogicalSequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		for(int i=1;i<=m;i++){
			if(i%n!=0)
				System.out.print(i+" ");
			if(i%n==0)
				System.out.println(i);
		}
	}
}
