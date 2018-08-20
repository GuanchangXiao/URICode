package beginner.four;

public class SSequenceII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=0,t=0;
		for(int i=1;i<=39;i=i+2){
			s+=(i*1.0)/(Math.pow(2, t));
			t++;
		}
		System.out.printf("%.2f\n",s);
	}
}
