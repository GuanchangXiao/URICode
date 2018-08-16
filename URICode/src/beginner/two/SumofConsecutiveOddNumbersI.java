package beginner.two;

import java.util.Scanner;

public class SumofConsecutiveOddNumbersI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int min=x,max=x,sum=0;
		if(max<y)
			max=y;
		if(y<min)
			min=y;
		for(int i=min+1;i<max;i++){
			if(Math.abs(i)%2==1)
				sum+=i;
		}
		System.out.println(sum);
	}
}
