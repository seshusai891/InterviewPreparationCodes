package Interview_Programs.Interview_Programs;

public class Stp8_Integer_Reverse {

	public static void main(String args[]) {
		int num=12487,rev=0;
//		        01234
		while(num!=0) {
			int digits=num%10;//12487/10=7 //1,2,3
			rev=rev*10+digits;
//			System.out.println(num);//0*10+1,1*10+2=12,12*10+3=123
			num/=10;//Stores Quotient
			System.out.println(num);
		}
		System.out.println(rev);
	}	
}
