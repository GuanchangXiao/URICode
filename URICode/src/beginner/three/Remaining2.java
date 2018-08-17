package beginner.three;

import java.util.Scanner;

public class Remaining2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=2;i<=10000;i++){
			if(i%n==2){
				System.out.println(i);
			}
		}
	}
}
	