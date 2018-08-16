package beginner.two;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		String s3 = scanner.nextLine();
		String animal="";
		String a1="vertebradoavecarnivoro";
		String a2="vertebradoaveonivoro";
		String a3="vertebradomamiferoonivoro";
		String a4="vertebradomamiferoherbivoro";
		String a5="invertebradoinsetohematofago";
		String a6="invertebradoinsetoherbivoro";
		String a7="invertebradoanelideohematofago";
		String a8="invertebradoanelideoonivoro";
		if(a1.equals(s1+s2+s3))
			animal="aguia";
		if(a2.equals(s1+s2+s3))
			animal="pomba";
		if(a3.equals(s1+s2+s3))
			animal="homem";
		if(a4.equals(s1+s2+s3))
			animal="vaca";
		if(a5.equals(s1+s2+s3))
			animal="pulga";
		if(a6.equals(s1+s2+s3))
			animal="lagarta";
		if(a7.equals(s1+s2+s3))
			animal="sanguessuga";
		if(a8.equals(s1+s2+s3))
			animal="minhoca";
		System.out.println(animal);
	}
}
