package beginner.three;

import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int a=1+4*(i-1),b=a+1,c=a+2;
			System.out.println(a+" "+b+" "+c+" "+"PUM");
		}
	}
}
