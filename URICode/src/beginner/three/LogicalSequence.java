package beginner.three;

import java.util.Scanner;

public class LogicalSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int b = i*i,c=i*b,d=b+1,e=c+1;
			System.out.println(i+" "+b+" "+c);
			System.out.println(i+" "+d+" "+e);
		}
	}
}
