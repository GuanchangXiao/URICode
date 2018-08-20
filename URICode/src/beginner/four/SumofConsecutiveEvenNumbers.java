package beginner.four;

import java.util.Scanner;

public class SumofConsecutiveEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
			int x = scanner.nextInt();
			int f=0,sum=0;
			if(x==0)
				break;
			while(true){
				if(f==5)
					break;
				if(x%2==0){
					sum+=x;
					f++;
				}
				x++;
			}
			System.out.println(sum);
		}
	}
}
