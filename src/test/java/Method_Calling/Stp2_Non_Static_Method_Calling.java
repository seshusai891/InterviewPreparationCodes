package Method_Calling;

import java.util.HashSet;
import java.util.Set;

public class Stp2_Non_Static_Method_Calling {
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
		Stp2_Non_Static_Method_Calling obj=new Stp2_Non_Static_Method_Calling();
		System.out.println();
		obj.Rem_Dupli_Char();
		System.out.println();
		obj.Rem_Specl_Char();
	}
}
