package Interview_Programs.Interview_Programs;

public class Stp42_StringInsert_using_Substring {

	public static void main(String[] args) {
		String s1="How you";//7 -> 0,4
//		   0123456
		String s2="are";
		String s3="";
		String s4="";
		String res="";
		
		s3=s1.substring(0,4);//How 
		s4=s1.substring(4);// you
		
		res=s3+s2+" "+s4;
		System.out.println(res);

	}

}
