package beginner.three;

import java.util.Scanner;

public class HighestandPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int highest=0;
		int position=0;
		for(int i=1;i<101;i++){
			int n = scanner.nextInt();
			if(n>highest){
				highest=n;
				position=i;
			}
		}
		System.out.println(highest);
		System.out.println(position);
	}
}
