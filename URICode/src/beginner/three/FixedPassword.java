package beginner.three;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FixedPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while(true){
			int ps = scanner.nextInt();
			if(ps==2002){
				list.add("Acesso Permitido");
				break;
			}else
				list.add("Senha Invalida");	
		}
		for (String string : list) 
			System.out.println(string);
	}
}
