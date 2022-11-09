package Interview_Programs.Interview_Programs;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Stp11_Special_Charac_Remove {
	
	public static void main(String args[]) {
		
		String email="seshusai76@gmail.com";
		String s1="0";
		
//		email = email.replaceAll("[^a-zA-Z0-9]", " ");
		email = email.replaceAll("[^A-Z0-9]", "");
//		s1 = s1.replaceAll("[^A-Z0-9]", "");
//		System.out.println(email);
//		System.out.println(s1);
		int s2=Integer.parseInt(s1)+Integer.parseInt(email);
		System.out.println(s2);
	}

}
