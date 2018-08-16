package beginner.two;

import java.util.Scanner;

public class GameTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int total=0;
		if(start>end)
			total=end+24-start;
		if(start==end)
			total=24;
		if(start<end)
			total=end-start;
		System.out.println("O JOGO DUROU "+total+" HORA(S)");
	}
}
