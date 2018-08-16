package beginner.two;

import java.util.Scanner;

public class CoordinatesofaPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if(x==0&&y==0){
			System.out.println("Origem");
			return;
		}if(x==0&&y!=0){
			System.out.println("Eixo Y");
			return;
		}if(x!=0&&y==0){
			System.out.println("Eixo X");
			return;
		}if(x>0&&y>0){
			System.out.println("Q1");
			return;
		}if(x<0&&y>0){
			System.out.println("Q2");
			return;
		}if(x<0&&y<0){
			System.out.println("Q3");
			return;
		}if(x>0&&y<0){
			System.out.println("Q4");
			return;
		}	
	}
}
