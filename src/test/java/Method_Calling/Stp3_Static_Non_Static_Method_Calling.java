package Method_Calling;

import java.util.HashSet;
import java.util.Set;

public class Stp3_Static_Non_Static_Method_Calling {
	
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
	
	public void Rem_Dupli_Char() {
		System.out.println();
		System.out.println("Non-static Rem-Dupli-Char Method Calling ");
		String name="mallamuru";
		
		Set<Character> rem_Dupli=new HashSet<Character>();
		for(char c:name.toCharArray()) {
			rem_Dupli.add(Character.valueOf(c));
		}
		System.out.println(rem_Dupli);
	}
	
	public void Rem_Specl_Char() {
		System.out.println();
		System.out.println("Non-static Rem-Spec-Char Method Calling ");
		String email="seshusai76@gmail.com";
		System.out.println("Bef-Rem-Spec-Char "+email);
		email = email.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Aft-Rem-Spec-Char "+email);
	}

	public static void main(String args[]) {
		Stp3_Static_Non_Static_Method_Calling obj=new Stp3_Static_Non_Static_Method_Calling();
		Add_Two_Strings();
		Prime_Numbers();
		System.out.println();
		obj.Rem_Dupli_Char();
		System.out.println();
		obj.Rem_Specl_Char();
	}

}
