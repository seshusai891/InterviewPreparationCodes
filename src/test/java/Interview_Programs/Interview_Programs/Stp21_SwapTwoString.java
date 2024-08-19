package Interview_Programs.Interview_Programs;

public class Stp21_SwapTwoString {

	public static void main(String[] args) {
		String s1="sai";
		String s2="seshu";
		
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		int a=10,b=20;
		a=a+b;//30
		b=a-b;//10
		a=a-b;//30-10=20
		System.out.println(a);
		System.out.println();
	}

}
