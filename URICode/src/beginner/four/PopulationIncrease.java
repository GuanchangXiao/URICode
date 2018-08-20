package beginner.four;

import java.util.Scanner;

public class PopulationIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			int pa = scanner.nextInt();
			int pb = scanner.nextInt();
			double ga = scanner.nextDouble();
			double gb = scanner.nextDouble();
			int y=1;
			while(true){
				pa=(int)Math.floor(pa+pa*ga*0.01);
				pb=(int)Math.floor(pb+pb*gb*0.01);
				if(y>100)
					break;
				if((pa)>pb)
					break;
				y++;
			}
			if(y<=100)
				System.out.println(y+" anos.");
			else
				System.out.println("Mais de 1 seculo.");
		}
	}
}
