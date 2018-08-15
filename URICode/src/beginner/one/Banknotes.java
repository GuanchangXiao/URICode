package beginner.one;

import java.util.Scanner;

public class Banknotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0;
		Integer cp = scanner.nextInt();
		a=cp/100;
		b=(cp-a*100)/50;
		c=(cp-a*100-b*50)/20;
		d=(cp-a*100-b*50-c*20)/10;
		e=(cp-a*100-b*50-c*20-d*10)/5;
		f=(cp-a*100-b*50-c*20-d*10-e*5)/2;
		g=cp-a*100-b*50-c*20-d*10-e*5-f*2;
		System.out.println(cp);
		System.out.println(a+" nota(s) de R$ 100,00");
		System.out.println(b+" nota(s) de R$ 50,00");
		System.out.println(c+" nota(s) de R$ 20,00");
		System.out.println(d+" nota(s) de R$ 10,00");
		System.out.println(e+" nota(s) de R$ 5,00");
		System.out.println(f+" nota(s) de R$ 2,00");
		System.out.println(g+" nota(s) de R$ 1,00");
	}
}
