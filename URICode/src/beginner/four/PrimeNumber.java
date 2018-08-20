package beginner.four;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int x = scanner.nextInt();
			int t=0;
			for(int j=1;j<=x;j++){
				if(x%j==0)
					t++;;
			}
			if(t>2)
				System.out.println(x+" nao eh primo");
			else
				System.out.println(x+" eh primo");
		}
	}
}
