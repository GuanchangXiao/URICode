package beginner.three;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec=new DecimalFormat("0.00");
		List<String> list = new ArrayList<>();
		int t=0;
		double  sum=0,avg=0;
		while(t!=2){
			double score= scanner.nextDouble();
			if(score<0||score>10)
				System.out.println("nota invalida");
				//list.add("nota invalida");
			else{
				sum+=score;
				t++;
			}
		}
		avg=sum*1.0/2;
		//list.add("media = "+dec.format(avg));
		System.out.println("media = "+dec.format(avg));
		
	}
}
