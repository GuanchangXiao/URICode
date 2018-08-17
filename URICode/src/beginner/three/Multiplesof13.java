package beginner.three;

import java.util.Scanner;

public class Multiplesof13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int min=a,max=a,sum=0;
		if(b<min)
			min=b;
		if(max<b)
			max=b;
		for(int i=min;i<=max;i++){
			if(i%13!=0)
				sum+=i;
		}
		System.out.println(sum);
	}
}
