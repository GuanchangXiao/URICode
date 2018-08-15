package beginner.one;

import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		if(num>=0&&num<=25){
			System.out.println("Intervalo [0,25]");
			return;
		}else if(num>25&&num<=50){
			System.out.println("Intervalo (25,50]");
			return;
		}else if(num>50&&num<=75){
			System.out.println("Intervalo (50,75]");
			return;
		}else if(num>75&&num<=100){
			System.out.println("Intervalo (75,100]");
			return;
		}else {
			System.out.println("Fora de intervalo");
			return;
		}
	}

}
