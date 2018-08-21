package beginner.five;

import java.util.Scanner;


public class SquareMatrixI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true){
			int n = scanner.nextInt();
			int[][] a = new int[n][n];
			if(n==0)
				break;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j]=i+1;
					if(i==j)
						System.out.print(i+" ");
					if(i<j)
						System.out.print(j-1+"");
						
				}
				System.out.println();
			}
		}
	}

}
