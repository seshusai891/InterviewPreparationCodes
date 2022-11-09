package Interview_Programs.Interview_Programs;

public class Stp1_Add_Two_Strings {

	static String s1="100,000",s2="200,000",s3="";
	
	public static void main(String args[]) {
		String a1="seshu";
		String a2="sai";
		String a3="malla";
		
		String s3=a1.concat(a2).concat(a3);
		System.out.println(s3);
		
		String num1="100,000";
		String num2="200,000";
		System.out.println("Address of num1 "+num1.hashCode());
		
		num1=num1.replaceAll(",", "");
		num2=num2.replaceAll(",", "");
		System.out.println("Address of num1 "+num1.hashCode());
		
		int num3=Integer.parseInt(num1)+Integer.parseInt(num2);
		System.out.println(num3);
		
//		String num5=Integer.toString(num1);
	}
}
