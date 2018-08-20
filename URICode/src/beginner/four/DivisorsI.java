package beginner.four;

import java.util.Scanner;

public class DivisorsI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.println(i);
		}
	}
}
