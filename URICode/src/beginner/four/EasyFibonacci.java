package beginner.four;

import java.util.Scanner;

public class EasyFibonacci {
	public static int getf(int N){
	     int first = 0;
	     int second = 1;
	     int ret = 0;
	     if(N==1)
	    	 return 0;
	     if(N==2)
	    	 return 1;
	     for(int i = 3; i <=N; ++i)
	     {
	        ret = first + second;
	        first = second;
	        second = ret;
	     }
	     return second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int pre0=0,pre1=1;
		for(int i=1;i<=x;i++){
			if(i<x)
				System.out.print(getf(i)+" ");
			else
				System.out.println(getf(i));	
		}
	}
}
