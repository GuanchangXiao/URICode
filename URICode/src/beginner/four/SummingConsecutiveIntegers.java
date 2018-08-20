package beginner.four;

import java.util.Scanner;

public class SummingConsecutiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int f=0,n=0,a=0,sum=0;
		while(f!=2){
			int temp = sc.nextInt();
			if(temp>0&&f==0){
				n=temp;
				f++;
				continue;
			}if(temp>0){
				a=temp;
				f++;
			}
		}
		for(int i=n;i<a+n;i++)
			sum+=i;
		System.out.println(sum);
	}
}
