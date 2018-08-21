package beginner.five;

import java.util.Scanner;

public class Bazinga {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++){
			String a = scanner.next();
			String b= scanner.next();
			if(a.equals("tesoura")&&b.equals("papel"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("papel")&&b.equals("tesoura"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("papel")&&b.equals("pedra"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("pedra")&&b.equals("papel"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("pedra")&&b.equals("lagarto"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("lagarto")&&b.equals("pedra"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("lagarto")&&b.equals("Spock"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("Spock")&&b.equals("lagarto"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("Spock")&&b.equals("tesoura"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("tesoura")&&b.equals("Spock"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("tesoura")&&b.equals("lagarto"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("lagarto")&&b.equals("tesoura"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("lagarto")&&b.equals("papel"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("papel")&&b.equals("lagarto"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("papel")&&b.equals("Spock"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("Spock")&&b.equals("papel"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("Spock")&&b.equals("pedra"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("pedra")&&b.equals("Spock"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else if(a.equals("pedra")&&b.equals("tesoura"))
				System.out.println("Caso #"+i+": Bazinga!");
			else if(a.equals("tesoura")&&b.equals("pedra"))
				System.out.println("Caso #"+i+": Raj trapaceou!");
			
			else
				System.out.println("Caso #"+i+": De novo!");		
		}
	}
}
