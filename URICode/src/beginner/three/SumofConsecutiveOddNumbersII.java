package beginner.three;

import java.util.Scanner;

public class SumofConsecutiveOddNumbersII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] res = new int[n];
		for(int i=0;i<n;i++){
			int temp=0;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int min=a,max=a;
			if(b<min)
				min=b;
			if(max<b)
				max=b;
			for(int j=min+1;j<max;j++){
				if(j%2==1)
					temp+=j;
			}
			res[i]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.println(res[i]);
	}
}
