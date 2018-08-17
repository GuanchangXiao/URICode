package beginner.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenceofNumbersandSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while(true){
			int a = scanner.nextInt();
			if(a<=0)
				break;
			int b = scanner.nextInt();
			if(b<=0)
				break;
			int min=a,max=a,sum=0;
			String s="";
			if(b<min)
				min=b;
			if(max<b)
				max=b;
			for(int j=min;j<=max;j++){
				s +=j+" ";
				sum+=j;
			}
			s+="Sum="+sum;
			list.add(s);
		}
		for (String string : list) 
			System.out.println(string);
	}
}
