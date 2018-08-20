package beginner.four;

import java.util.Scanner;

public class LowestNumberandPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min=0,po=0;
		for(int i=0;i<n;i++){
			int x = scanner.nextInt();
			if(i==0)
				min=x;
			if(x<min){
				min=x;
				po=i;
			}
		}
		System.out.println("Menor valor: "+min);
		System.out.println("Posicao: "+po);
	}
}
