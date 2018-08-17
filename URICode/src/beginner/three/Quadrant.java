package beginner.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while(true){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a==0||b==0)
				break;
			if(a>0&&b>0){
				list.add("primeiro");
				continue;
			}else if(a>0&&b<0){
				list.add("quarto");	
				continue;
			}else if(a<0&&b<0){
				list.add("terceiro");	
				continue;
			}else
				list.add("segundo");
		}
		for (String string : list) 
			System.out.println(string);
	}
}
