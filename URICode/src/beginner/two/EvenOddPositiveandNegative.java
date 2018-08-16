package beginner.two;

import java.util.Scanner;

public class EvenOddPositiveandNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int os=0,zs=0,fs=0,js=0;
		if(a%2==0)
			os++;
		if(b%2==0)
			os++;
		if(c%2==0)
			os++;
		if(d%2==0)
			os++;
		if(e%2==0)
			os++;
		if(a>0)
			zs++;
		if(b>0)
			zs++;
		if(c>0)
			zs++;
		if(d>0)
			zs++;
		if(e>0)
			zs++;
		if(a<0)
			fs++;
		if(b<0)
			fs++;
		if(c<0)
			fs++;
		if(d<0)
			fs++;
		if(e<0)
			fs++;
		js=5-os;
		System.out.println(os+" valor(es) par(es)");
		System.out.println(js+" valor(es) impar(es)");
		System.out.println(zs+" valor(es) positivo(s)");
		System.out.println(fs+" valor(es) negativo(s)");
	}
}
