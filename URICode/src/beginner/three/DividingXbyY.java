package beginner.three;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DividingXbyY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat dec=new DecimalFormat("0.0");
		List<String> list = new ArrayList<>();
		int n = scanner.nextInt();
		for(int i=0;i<n;i++){
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			if(b==0)
				list.add("divisao impossivel");
			else{
				double c = a*1.0/b;
				list.add(dec.format(c));
			}
		}
		for (String string : list) 
			System.out.println(string);
	}
}
