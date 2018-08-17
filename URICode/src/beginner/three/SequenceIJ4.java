package beginner.three;

import java.text.DecimalFormat;

public class SequenceIJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dec=new DecimalFormat("0.0");
		for(double i=0;i<=2;i=i+0.2){
			double j1=1+i,j2=2+i,j3=3+i;
			String si1="",sj1="",sj2="",sj3="";
			if(dec.format(i).split("\\.")[1].equals("0"))
				si1=dec.format(i).split("\\.")[0];
			else
				si1=dec.format(i);
			if(dec.format(j1).split("\\.")[1].equals("0"))
				sj1=dec.format(j1).split("\\.")[0];
			else
				sj1=dec.format(j1);
			if(dec.format(j2).split("\\.")[1].equals("0"))
				sj2=dec.format(j2).split("\\.")[0];
			else
				sj2=dec.format(j2);
			if(dec.format(j3).split("\\.")[1].equals("0"))
				sj3=dec.format(j3).split("\\.")[0];
			else
				sj3=dec.format(j3);
			System.out.println("I="+si1+" J="+sj1);
			System.out.println("I="+si1+" J="+sj2);
			System.out.println("I="+si1+" J="+sj3);
		}
	}
}
