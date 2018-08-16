package beginner.two;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		double ss = 0;
		if(salary<=2000){
			System.out.println("Isento");
			return;
		}else if(salary>2000&&salary<=3000)
			ss = (salary-2000)*0.08;
		else if(salary>3000&&salary<=4500)
			ss = 1000*0.08+(salary-3000)*0.18;
		else 
			ss = 1000*0.08+1500*0.18+(salary-4500)*0.28;
		System.out.printf("R$ %.2f\n",ss);
	}
}
