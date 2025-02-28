package Interview_Programs.Interview_Programs;

import java.util.Arrays;

public class Stp41_SamePlace_wrd_reverse {

	public static void main(String[] args) {
		String name="Iam   & from         &      india";
		name=name.replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim();
		System.out.println(name);
		String arr[]=name.split(" ");
		String rev="";
		
		System.out.println(Arrays.toString(arr));
		
		for(String w:arr) {
			String revWrd="";
			for(int i=w.length()-1;i>=0;i--) {
				revWrd=revWrd+w.charAt(i);
			}
			rev=rev+revWrd+" ";
		}
		System.out.println(rev);
	}

}
