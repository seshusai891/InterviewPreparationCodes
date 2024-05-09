package Interview_Programs.Interview_Programs;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Stp11_Special_Charac_Remove {
	
	public static void main(String args[]) {
		
		String email="seshusai_76!#$%^,.     )(][/';@gmail.com";
		String s1="0";
		System.out.println(email);
//		email = email.replaceAll("[^a-zA-Z0-9]", " ");
		email = email.replaceAll("[^a-zA-Z0-9_]", "");
		System.out.println(email);
		
		if(email.contains("[^a-zA-Z0-9_]")) {
			email.replaceAll("[^a-zA-Z0-9_]", "");
			System.out.println(email);
		}
//		email = email.replaceAll(" ", "_");
//		System.out.println(email);
//		s1 = s1.replaceAll("[^A-Z0-9]", "");
//		System.out.println(email);
//		System.out.println(s1);
//		int s2=Integer.parseInt(s1)+Integer.parseInt(email);
//		System.out.println(s2);
	}

}
