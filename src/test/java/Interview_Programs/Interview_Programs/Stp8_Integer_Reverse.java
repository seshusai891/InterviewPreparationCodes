package Interview_Programs.Interview_Programs;

public class Stp8_Integer_Reverse {

	public static void main(String args[]) {
		int num=12487,rev=0;
//		        01234
		while(num!=0) {
			int digits=num%10;//12487/10=7
			rev=rev*10+digits;
//			System.out.println(num);
			num/=10;
			System.out.println(num);
		}
	}	
}
