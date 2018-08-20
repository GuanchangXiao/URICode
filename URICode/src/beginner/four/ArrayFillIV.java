package beginner.four;

import java.util.Scanner;

public class ArrayFillIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] par = new int[5];
		int[] impar = new int[5];
		int j=0,k=0;
		for(int i=0;i<15;i++){
			int n = scanner.nextInt();
			if(j==5){
				for(int l=0;l<5;l++)
					System.out.println("par["+l+"] = "+par[l]);
				j=0;
			}
				
			if(k==5){
				for(int l=0;l<5;l++)
					System.out.println("impar["+l+"] = "+impar[l]);
				k=0;
			}
			if(n%2==0){
				par[j]=n;
				j++;
			}else {
				impar[k]=n;
				k++;
			}
		}
		System.out.println(k);
		if(k!=0){
			for(int l=0;l<k;l++)
				System.out.println("impar["+l+"] = "+impar[l]);
		}
		if(j!=0){
			for(int l=0;l<j;l++)
				System.out.println("par["+l+"] = "+par[l]);
		}
	}
}
