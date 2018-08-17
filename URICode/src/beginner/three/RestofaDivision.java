package beginner.three;

import java.util.Scanner;

public class RestofaDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int min=a,max=a;
		if(b<min)
			min=b;
		if(max<b)
			max=b;
		for(int i=min+1;i<max;i++){
			if(i%5==2||i%5==3)
				System.out.println(i);
		}		
	}
}
