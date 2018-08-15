package beginner.one;

import java.util.Scanner;

public class BanknotesandCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0;
		float fl = scanner.nextFloat();
		int cp = (int) Math.floor(fl);
		int xs = (int)((fl*100)-(cp*100));
		a=cp/100;
		b=(cp-a*100)/50;
		c=(cp-a*100-b*50)/20;
		d=(cp-a*100-b*50-c*20)/10;
		e=(cp-a*100-b*50-c*20-d*10)/5;
		f=(cp-a*100-b*50-c*20-d*10-e*5)/2;
		g=cp-a*100-b*50-c*20-d*10-e*5-f*2;
		h=xs/50;
		i=(xs-h*50)/25;
		j=(xs-h*50-i*25)/10;
		k=(xs-h*50-i*25-j*10)/5;
		l=xs-h*50-i*25-j*10-k*5;
		System.out.println("NOTAS:");
		System.out.println(a+" nota(s) de R$ 100.00");
		System.out.println(b+" nota(s) de R$ 50.00");
		System.out.println(c+" nota(s) de R$ 20.00");
		System.out.println(d+" nota(s) de R$ 10.00");
		System.out.println(e+" nota(s) de R$ 5.00");
		System.out.println(f+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(g+" moeda(s) de R$ 1.00");
		System.out.println(h+" moeda(s) de R$ 0.50");
		System.out.println(i+" moeda(s) de R$ 0.25");
		System.out.println(j+" moeda(s) de R$ 0.10");
		System.out.println(k+" moeda(s) de R$ 0.05");
		System.out.println(l+" moeda(s) de R$ 0.01");
	}

}
