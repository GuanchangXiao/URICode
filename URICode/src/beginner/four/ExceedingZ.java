package beginner.four;

import java.util.Scanner;

public class ExceedingZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int z = 0,t=1,sum=x;
		while(true){
			int temp = scanner.nextInt();
			if(temp>x){
				z=temp;
				break;
			}
		}
		while(true){
			t++;
			x++;
			sum+=x;
			if(sum>z)
				break;
		}
		System.out.println(t);
	}
}
