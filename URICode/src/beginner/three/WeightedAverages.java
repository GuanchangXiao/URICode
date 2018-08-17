package beginner.three;

import java.util.Scanner;

public class WeightedAverages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] ds = new double[n];
		for(int i=0;i<n;i++){
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			ds[i] = (a*2+b*3+c*5)/10.0;
		}
		for(int i=0;i<n;i++)
			System.out.printf("%.1f\n",ds[i]);
	}
}
