package beginner.two;

import java.util.Scanner;

public class PositivesandAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = scanner.nextDouble();
		double f = scanner.nextDouble();
		int total =0;
		double sum=0;
		double avg=0;
		if(a>0){
			total++;
			sum+=a;
		}
		if(b>0){
			total++;
			sum+=b;
		}
		if(c>0){
			total++;
			sum+=c;
		}
		if(d>0){
			total++;
			sum+=d;
		}
		if(e>0){
			total++;
			sum+=e;
		}
		if(f>0){
			total++;
			sum+=f;
		}
		avg = sum/total;
		System.out.println(total+" valores positivos");
		System.out.printf("%.1f\n",avg);
	}
}
