package beginner.two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();
		float d = scanner.nextFloat();
		float avg=0;
		DecimalFormat dec=new DecimalFormat("0.0");
		avg = (a*2+b*3+c*4+d)/10;
		if(avg>=7.0){
			System.out.println("Media: "+dec.format(avg));
			System.out.println("Aluno aprovado.");
			return;
		}else if(avg<5.0){
			System.out.println("Media: "+dec.format(avg));
			System.out.println("Aluno reprovado.");
			return;
		}else {
			float f = scanner.nextFloat();
			float zh = (f+avg)/2;
			System.out.println("Media: "+dec.format(avg));
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: "+dec.format(f));
			System.out.println("Aluno aprovado.");
			System.out.println("Media final: "+dec.format(zh));
			return;
		}	
	}
}
