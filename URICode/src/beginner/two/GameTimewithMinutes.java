package beginner.two;

import java.util.Scanner;

public class GameTimewithMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sh = scanner.nextInt();
		int sm = scanner.nextInt();
		int eh = scanner.nextInt();
		int em = scanner.nextInt();
		int th=0,tm=0;
		if(sh<eh){
			th = eh-sh;
		}else {
			th = eh-sh+24;
		}
		if(sm<=em){
			tm=em-sm;
		}else{
			th=th-1;
			tm = em-sm+60;
		}
		System.out.println("O JOGO DUROU "+th+" HORA(S) E "+tm+" MINUTO(S)");
	}
}
