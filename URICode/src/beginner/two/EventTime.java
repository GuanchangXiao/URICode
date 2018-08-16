package beginner.two;

import java.util.Scanner;

public class EventTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String sd = scanner.nextLine();
		String st = scanner.nextLine();
		String ed = scanner.nextLine();
		String et = scanner.nextLine();
		int kt =Integer.valueOf(sd.split(" ")[1]);
		int jt =Integer.valueOf(ed.split(" ")[1]);
		int sh=0,sm=0,ss=0,eh=0,em=0,es=0;
		int cd=0,ch=0,cm=0,cs=0;
		String[] s1 = st.replaceAll(" ", "").split(":");
		String[] s2 = et.replaceAll(" ", "").split(":");
		if(s1[0].substring(0, 1).equals("0"))
			sh=Integer.valueOf(s1[0].substring(1, 2));
		else
			sh = Integer.valueOf(s1[0]);
		if(s1[1].substring(0, 1).equals("0"))
			sm=Integer.valueOf(s1[1].substring(1, 2));
		else
			sm = Integer.valueOf(s1[1]);
		if(s1[2].substring(0, 1).equals("0"))
			ss=Integer.valueOf(s1[2].substring(1, 2));
		else
			ss = Integer.valueOf(s1[2]);
		if(s2[0].substring(0, 1).equals("0"))
			eh=Integer.valueOf(s2[0].substring(1, 2));
		else
			eh = Integer.valueOf(s2[0]);
		if(s2[1].substring(0, 1).equals("0"))
			em=Integer.valueOf(s2[1].substring(1, 2));
		else
			em = Integer.valueOf(s2[1]);
		if(s2[2].substring(0, 1).equals("0"))
			es=Integer.valueOf(s2[2].substring(1, 2));
		else
			es = Integer.valueOf(s2[2]);
		cd = jt-kt;
		if(eh>=sh)
			ch = eh-sh;
		else{
			ch = eh-sh+24;
			cd = cd-1;
		}
		if(em>=sm)
			cm = em - sm;
		else{
			cm = em - sm+60;
			ch = ch -1;
		}
		if(es>=ss)
			cs = es - ss;
		else{
			cs = es - ss+60;
			cm = cm-1;
		}
		System.out.println(cd+" dia(s)");
		System.out.println(ch+" hora(s)");
		System.out.println(cm+" minuto(s)");
		System.out.println(cs+" segundo(s)");
	}
}
