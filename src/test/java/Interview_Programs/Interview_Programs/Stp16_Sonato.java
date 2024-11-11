package Interview_Programs.Interview_Programs;

public class Stp16_Sonato {
	
	public static void main(String args[]) {
		String cmpy_name="Sonato",cmpy_splt="",cmpy_logo="";
		for(int i=0;i<cmpy_name.length()-2;i++) {
			cmpy_splt=cmpy_splt+cmpy_name.charAt(i);
			System.out.println(cmpy_splt);
			if(i==0) {
				cmpy_logo=cmpy_logo+cmpy_splt.charAt(i);
				System.out.println("cmpy logo 0 index "+cmpy_logo);
			}
			if(i==3) {
				cmpy_logo=cmpy_logo+cmpy_splt.length()+cmpy_splt.charAt(i);
				System.out.println("cmpy logo 3 index "+cmpy_logo);
			}
	}
System.out.println(cmpy_logo);
}
}
