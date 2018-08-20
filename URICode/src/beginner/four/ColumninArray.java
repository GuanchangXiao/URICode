package beginner.four;

import java.util.Scanner;

public class ColumninArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String c = scanner.next();
		double sum=0,avg=0;
		for(int i=0;i<12;i++){
			for(int j=0;j<12;j++){
				double x = scanner.nextDouble();
				if(n==j)
					sum+=x;
			}
		}
		avg = sum/12;
		if(c.equals("S"))
			System.out.printf("%.1f\n",sum);
		if(c.equals("M"))
			System.out.printf("%.1f\n",avg);
	}
}
