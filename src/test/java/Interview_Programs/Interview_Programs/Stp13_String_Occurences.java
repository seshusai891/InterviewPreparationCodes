package Interview_Programs.Interview_Programs;

import java.util.HashMap;

public class Stp13_String_Occurences {
	
	public static void main(String args[]) {
		String name="ABC ghi ABC";
		name=name.replaceAll(" ", "");
//					 123456789
//				   i=012345678
		HashMap<Character, Integer> charCount=new HashMap<Character,Integer>();
		for(int i=0;i<name.length();i++) {
			if(charCount.containsKey(name.charAt(i))) {
				int count=charCount.get(name.charAt(i));
				System.out.println("Before count value "+count+" "+charCount);
				charCount.put(name.charAt(i),++count);
			}
			else {
				charCount.put(name.charAt(i), 1);
			}
			System.out.println(charCount);
		}
	}

}
