package beginner.five;

import java.util.Scanner;

public class Preface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a>=0){
			int q = a/b;
			int r = a%b;
			System.out.println(q+" "+r);
		}else {
			 int e=b,f=0,r=0;
		     if(b<0) 
		        e=b*-1;
	        for(r=0; r<e; r++)
	        {
	            f=a-r;
	            if(f%b==0)
	            	break;
	        }
	        int q=f/b;
	        System.out.println(q+" "+r);
		}
	}
}
