package Interview_Programs.Interview_Programs;

public class Stp10_String_Reverse {
	
	static String name="seshu mallamuru vekata",rev="";
//					  i=01234
//		  name.length()=12345	
	
	public static void main(String args[]) {
		System.out.println(name.length());//5
		for(int i=name.length()-1;i>=0;i--) 
//				i=5-1 = 4;		  4>=0;
		{
			rev=rev+name.charAt(i);//u
		}
		System.out.println(rev);
		if(name.contains(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
	}

}
