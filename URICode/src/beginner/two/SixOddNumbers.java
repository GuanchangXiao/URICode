package beginner.two;

import java.util.Scanner;

public class SixOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int t=0;
		while(t<6){
			if(num%2==1){
				System.out.println(num);
				t++;
			}
			num++;
		}
	}
}
