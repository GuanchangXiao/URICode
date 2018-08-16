package beginner.two;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		int yf = scanner.nextInt();
		String yw="";
		switch (yf) {
			case 1:
				yw="January";
				break;
			case 2:
				yw="February";
				break;
			case 3:
				yw="March";
				break;
			case 4:
				yw="April";
				break;
			case 5:
				yw="May";
				break;
			case 6:
				yw="June";
				break;
			case 7:
				yw="July";
				break;
			case 8:
				yw="August";
				break;
			case 9:
				yw="September";
				break;
			case 10:
				yw="October";
				break;
			case 11:
				yw="November";
				break;
			case 12:
				yw="December";
				break;
			default:
				break;
		}
		System.out.println(yw);
	}
}
