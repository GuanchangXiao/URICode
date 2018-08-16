package beginner.two;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=0;i<num;i++){
			int temp = scanner.nextInt();
			if(Math.abs(temp)%2==1&&temp<0)
				System.out.println("ODD NEGATIVE");
			if(Math.abs(temp)%2==0&&temp<0)
				System.out.println("EVEN NEGATIVE");
			if(temp%2==1&&temp>0)
				System.out.println("ODD POSITIVE");
			if(temp%2==0&&temp>0)
				System.out.println("EVEN POSITIVE");
			if(temp==0)
				System.out.println("NULL");
		}
	}
}
