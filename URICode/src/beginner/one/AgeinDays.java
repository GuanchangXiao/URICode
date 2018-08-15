package beginner.one;

import java.util.Scanner;


public class AgeinDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Integer age = scanner.nextInt();
		int year=0,month=0,day=0;
		year = age/365;
		month = (age-year*365)/30;
		day = age - year*365-month*30;
		System.out.println(year+" ano(s)");
		System.out.println(month+" mes(es)");
		System.out.println(day+" dia(s)");
	}

}
