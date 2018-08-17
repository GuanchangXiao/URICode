package beginner.three;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Experiments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] sa = new String[n];
		int total =0,C=0,R=0,S=0;
		double cp=0,rp=0,sp=0;
		for(int i=0;i<=n;i++){
			String s = scanner.nextLine();
			String type="";
			int sl =0;
			if(s.length()>0){
				type = s.split(" ")[1];
				sl = Integer.valueOf(s.split(" ")[0]);
				if(type.equals("C")){
					total+=sl;
					C+=sl;
				}
				if(type.equals("R")){
					total+=sl;
					R+=sl;
				}
				if(type.equals("S")){
					total+=sl;
					S+=sl;
				}
			}
		}
		cp = (C/(total*1.0))*100.0;
		rp = (R/(total*1.0))*100.0;
		sp = (S/(total*1.0))*100.0;
		print(total, C, R, S, cp, rp, sp);
	}
	public static void print(int total,int C,int R,int S,double cp,double rp,double sp){
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
