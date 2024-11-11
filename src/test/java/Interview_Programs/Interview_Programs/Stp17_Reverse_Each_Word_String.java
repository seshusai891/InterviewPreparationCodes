package Interview_Programs.Interview_Programs;

public class Stp17_Reverse_Each_Word_String {
	
	public static void main(String args[]) {
		
		String value="Welcome To Java";
		String arr_value[]= {};
		arr_value=value.split(" ");
		String rev_value="";
		
		for(String w:arr_value) {
			String rev_word="";
			
		for(int i=w.length()-1;i>=0;i--) {
			rev_word=rev_word+w.charAt(i);
		}
		rev_value=rev_value+rev_word+" ";
		}
		System.out.println(rev_value);
	}

}
