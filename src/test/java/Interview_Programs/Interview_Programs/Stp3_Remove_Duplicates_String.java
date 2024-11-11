package Interview_Programs.Interview_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Stp3_Remove_Duplicates_String {
	
		public static void main(String args[]) {
			String name="mallamuru";
			Set<Character> remv_Dupli=new LinkedHashSet<Character>();
			for(char c:name.toCharArray()) {
				remv_Dupli.add(Character.valueOf(c));
			}
			System.out.println(remv_Dupli);
			
			Set<Character> remv_Dupli_M1=new HashSet<Character>();
			for(int i=0;i<name.length();i++) {
				remv_Dupli_M1.add(name.charAt(i));
			}
//			--------------------------------
			StringBuilder res=new StringBuilder();
			for(char c:remv_Dupli) {
				res.append(c);
			}
			
			String result="";
			for(char c:remv_Dupli) {
				result =result+c;
			}
//			---------------------------------
			System.out.println(remv_Dupli_M1);
			System.out.println(res);
			System.out.println(result);
		}
}
