package beginner.two;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		String name="";
		map.put(61, "Brasilia");
		map.put(71, "Salvador");
		map.put(11, "Sao Paulo");
		map.put(21, "Rio de Janeiro");
		map.put(32, "Juiz de Fora");
		map.put(19, "Campinas");
		map.put(27, "Vitoria");
		map.put(31, "Belo Horizonte");
		Integer num = scanner.nextInt();
		if(map.get(num)!=null){
			name=map.get(num);
		}else
			name="DDD nao cadastrado";
		System.out.println(name);
	}
}
