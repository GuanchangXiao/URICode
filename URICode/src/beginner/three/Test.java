package beginner.three;

import java.text.DecimalFormat;

public class Test {
	public static void main(String[] args){
		int total =0,C=0,R=0,S=0;
		double cp=0,rp=0,sp=0;
		DecimalFormat dec = new DecimalFormat("0.00");
		System.out.println("Total: "+total+" cobaias");
		System.out.println("Total de coelhos: "+C);
		System.err.println("Total de ratos: "+R);
		System.err.println("Total de sapos: "+S);
		System.out.println("Percentual de coelhos: "+dec.format(cp)+" %");
		System.out.println("Percentual de ratos: "+dec.format(rp)+" %");
		System.out.println("Percentual de sapos: "+dec.format(sp)+" %");	
	}
}
