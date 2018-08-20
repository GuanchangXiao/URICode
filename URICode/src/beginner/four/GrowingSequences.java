package beginner.four;

import java.util.Scanner;

public class GrowingSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
			int n = scanner.nextInt();
			if(n==0)
				break;
			for(int i=1;i<=n;i++){
				if(i%n!=0)
					System.out.print(i+" ");
				else
					System.out.println(i);
			}
		}
	}
}
