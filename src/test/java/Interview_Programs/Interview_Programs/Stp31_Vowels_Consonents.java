package Interview_Programs.Interview_Programs;

public class Stp31_Vowels_Consonents {

	public static void main(String[] args) {
		String name="Associate";
		String vowels="";
		String consonents="";
		name=name.toLowerCase();
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels += ch;//meaning vowels = vowels+ch;
			}
			else {
				consonents =consonents+ch;
			}
		}
		System.out.println(vowels+" "+consonents);

	}

}
