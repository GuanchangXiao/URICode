package beginner.one;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer time = scanner.nextInt();
		int hours=0,minute=0,secondes=0;
		hours = time/3600;
		minute = (time-hours*3600)/60;
		secondes = time - hours*3600-minute*60;
		System.out.println(hours+":"+minute+":"+secondes);
	}

}
