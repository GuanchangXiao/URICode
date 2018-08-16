package beginner.two;

import java.util.Scanner;

public class TriangleTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double min =a;
		double max =a;
		double mid=a;
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(min<a&&a<max)
			mid=a;
		if(min<b&&b<max)
			mid=b;
		if(min<c&&c<max)
			mid=c;
		if(max>=(min+mid))
			System.out.println("NAO FORMA TRIANGULO");
		else{
			if((max*max)==(min*min+mid*mid))
				System.out.println("TRIANGULO RETANGULO");
			if((max*max)>(min*min+mid*mid))
				System.out.println("TRIANGULO OBTUSANGULO");
			if((max*max)<(min*min+mid*mid))
				System.out.println("TRIANGULO ACUTANGULO");
			if(max==min&&min==mid)
				System.out.println("TRIANGULO EQUILATERO");
			if((max==min&&max!=mid)||(max==mid&&max!=min)||(min==mid&&max!=mid))
				System.out.println("TRIANGULO ISOSCELES");
		}	
	}
}
