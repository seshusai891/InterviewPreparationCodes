package Method_Calling;

public class Stp1_Static_Method_Calling extends Stp0_BaseClass{
	
	static int a=100;
	
	public static void Add_Two_Strings() {
		System.out.println("Static Method Calling to add two strings ");
		String s1="100,000",s2="200,000";
		int s3;
		s1=s1.replaceAll(",", "");
		s2=s2.replaceAll(",", "");
		s3=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(s3);
	}
	public static void Prime_Numbers() {
		//2,3,5,7,11,13,17....
		System.out.println();
		System.out.println("Static Prime Numbers method Calling ");
		int num=50;
		for(int i=2;i<=50;i++) {
			for(int j=2;j<=i;j++) {
				if(j==i) {
					System.out.print(i+" ");
				}
				if(i%j==0) {
					break;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Add_Two_Strings();
		Prime_Numbers();
		int d=a*b;
//		int a=100;
		int f=d+a;
		System.out.println();
		System.out.println("using final keyword addition in sub-class "+d+" "+f);
		show();
	}

}
