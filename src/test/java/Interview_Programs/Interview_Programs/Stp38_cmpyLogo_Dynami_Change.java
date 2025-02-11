package Interview_Programs.Interview_Programs;

public class Stp38_cmpyLogo_Dynami_Change {

	public static void main(String[] args) {
		String name="localisation";//sonato
		name=name.replaceAll(" ", "");
		name = name.toUpperCase();
		if(name.length()<2) {
			name = name.toUpperCase();
			System.out.println(name.toUpperCase());
		}
		char first=name.charAt(0);
		char last=name.charAt(name.length()-1);
		int middleCount=name.length()-2;
		
		String res=first+String.valueOf(middleCount)+last;
		System.out.println(res);

	}

}
