package beginner.two;

import java.util.Scanner;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int min =a;
		int max =a;
		int mid=0;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(min<a&&a<max)
			mid=a;
		if(min<b&&b<max)
			mid=b;
		if(min<c&&c<max)
			mid=c;
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
