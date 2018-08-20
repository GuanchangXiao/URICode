package beginner.four;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int x = scanner.nextInt();
			int sum=0;
			for(int j=1;j<x;j++){
				if(x%j==0)
					sum+=j;
			}
			if(x==sum)
				System.out.println(x+" eh perfeito");
			else
				System.out.println(x+" nao eh perfeito");
		}
	}
}
