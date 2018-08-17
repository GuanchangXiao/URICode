package beginner.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AscendingandDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while(true){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			String s="";
			if(a==b)
				break;
			if(a>b)
				s="Decrescente";
			else
				s="Crescente";
			list.add(s);
		}
		for (String string : list) 
			System.out.println(string);
	}
}
