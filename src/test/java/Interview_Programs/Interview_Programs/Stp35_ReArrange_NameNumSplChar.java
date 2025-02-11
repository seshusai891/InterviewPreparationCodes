package Interview_Programs.Interview_Programs;

public class Stp35_ReArrange_NameNumSplChar {

	public static void main(String[] args) {
		String name="se123shu&8*!(";
		String splChar="",num="",splitname="",value="";
		
		String splChar1="",num1="",splitname1="",value1="";
		
		splitname=name.replaceAll("[^a-z]", "");
		splChar=name.replaceAll("[a-zA-Z0-9]", "");
		num=name.replaceAll("[^0-9]", "");
		
		value=splitname+num+splChar;
		
		System.out.println(value);
//		Method 2

		for (char c:name.toCharArray()) {
			if(Character.isLetter(c)) {
				splitname1 += c;
			}
			else if(Character.isDigit(c)){
				num1=num1 + c;
			}
			else {
				splChar1 = splChar1 + c;
			}
		}
		value1=splitname1+num1+splChar1;
		System.out.println(value1);

	}

}
