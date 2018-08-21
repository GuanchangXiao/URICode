package beginner.five;

import java.util.Scanner;

public class TheRaceofSlugs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n = in.nextInt();
			int max=0;
			if(n==0)
				continue;
			else{
				for(int i=1;i<=n;i++){
					int s = in.nextInt();
					if(s>max)
						max=s;
				}
				if(max<10)
					System.out.println(1);
				else if(max>=10&&max<20)
					System.out.println(2);
				else 
					System.out.println(3);
			}	
		}
	}
}
