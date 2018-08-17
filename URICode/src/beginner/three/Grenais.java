package beginner.three;

import java.util.Scanner;

public class Grenais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum=0,sin=0,sge=0,p=0;
		while(true){
			int in = scanner.nextInt();
			int ge = scanner.nextInt();
			System.out.println("Novo grenal (1-sim 2-nao)");
			if(in>ge)
				sin++;
			if(in==ge)
				p++;
			if(in<ge)
				sge++;
			sum++;
			int xw = scanner.nextInt();
			if(xw!=1)
				break;
		}
		System.out.println(sum+" grenais");
		System.out.println("Inter:"+sin);
		System.out.println("Gremio:"+sge);
		System.out.println("Empates:"+p);
		if(sin>sge)
			System.out.println("Inter venceu mais");
		if(sin<sge)
			System.out.println("Gremio venceu mais");
	}
}
