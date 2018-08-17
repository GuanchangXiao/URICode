package beginner.three;

import java.util.Scanner;

public class TypeofFuel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a=0,b=0,c=0;
		while(true){
			int n = scanner.nextInt();
			if(n==1)
				a++;
			if(n==2)
				b++;
			if(n==3)
				c++;
			if(n==4)
				break;
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+a);
		System.out.println("Gasolina: "+b);
		System.out.println("Diesel: "+c);
	}
}
