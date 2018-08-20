package beginner.four;

import java.util.Scanner;

public class FibonacciArray {
	public static int get(int x) {
		int first=0,second=1,ret=0;
		if(x==1)
			return 0;
		if(x==2)
			return 1;
		for(int i=3;i<=x;i++){
			ret = first+second;
			first =second;
			second =first + ret;
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			int x = scanner.nextInt();
			System.out.printf("Fib(%d) = %d\n", x, get(x));
		}
	}
}
