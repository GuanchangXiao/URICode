package beginner.two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalaryIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		double add =0;
		double total =0;
		String rate="";
		DecimalFormat dec=new DecimalFormat("0.00");
		if(0<salary&&salary<=400){
			add=salary*0.15;
			total = salary+add;
			rate ="15 %";
		}
		if(400<salary&&salary<=800){
			add=salary*0.12;
			total = salary+add;
			rate ="12 %";
		}
		if(800<salary&&salary<=1200){
			add=salary*0.10;
			total = salary+add;
			rate ="10 %";
		}
		if(1200<salary&&salary<=2000){
			add=salary*0.07;
			total = salary+add;
			rate ="7 %";
		}
		if(salary>2000){
			add=salary*0.04;
			total = salary+add;
			rate ="4 %";
		}
		System.out.println("Novo salario: "+dec.format(total));
		System.out.println("Reajuste ganho: "+dec.format(add));
		System.out.println("Em percentual: "+rate);
	}
}
