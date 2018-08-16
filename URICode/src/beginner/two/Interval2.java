package beginner.two;

import java.util.Scanner;

public class Interval2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int in=0,out=0;
		for(int i=0;i<num;i++){
			int temp = scanner.nextInt();
			if(temp>=10&&temp<=20)
				in++;
			else
				out++;
		}
		System.out.println(in+" in");
		System.out.println(out+" out");
	}
}
