package Interview_Programs.Interview_Programs;

public class Stp43_StringConstantPool {

	public static void main(String[] args) {
		String s1="sai";
		String s2="sai";
		String s3=new String("sai");

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		if(s1==s3) {
			System.out.println("same name");
		}
		
		else {
			System.out.println("not same");
		}

	}

}
