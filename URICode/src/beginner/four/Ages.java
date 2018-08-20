package beginner.four;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum=0,t=0;
		double avg;
		while(true){
			int x = scanner.nextInt();
			if(x<0)
				break;
			sum+=x;
			t++;
		}
		avg = (sum*1.0)/t;
		System.out.printf("%.2f\n",avg);
	}
}
