package beginner.five;

import java.util.Scanner;

public class BrazilWorldCup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			if(n==0)
				System.out.println("vai ter copa!");
			else
				System.out.println("vai ter duas!");
		}
	}
}
