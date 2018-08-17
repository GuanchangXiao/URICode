package beginner.three;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SeveralScoreswithValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec=new DecimalFormat("0.00");
		double so = 0,sum=0,next=0;
		int f=0,t=0;
		while(true){
			so = scanner.nextDouble();
			if(so==2)
				break;
			if(so>10||so<0)
				System.out.println("nota invalida");
			else{
				if(t<2){
					sum+=so;
					f++;
					t++;
				}else{
					System.out.println("novo calculo (1-sim 2-nao)");
					if(so==1)
						t=0;
				}
			}
			if(f==2){
				System.out.println("media = "+dec.format(sum/2));
				f=0;
				sum=0;
			}
		}
		System.out.println("novo calculo (1-sim 2-nao)");
	}
}
