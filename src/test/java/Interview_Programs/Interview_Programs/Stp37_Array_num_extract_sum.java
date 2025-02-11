package Interview_Programs.Interview_Programs;

public class Stp37_Array_num_extract_sum {

	public static void main(String[] args) {
//		Method-1
		String arr[]= {"7has9","daha99","sh1h9"};
		int sum=0;
		String numStr="";
		
		for(String w:arr) {
			numStr=w.replaceAll("\\D+", "");//to remove letters
			System.out.println(numStr);//79
			
			if(!numStr.isEmpty()) {
				int num=Integer.parseInt(numStr);//79
				sum=sum+num;//0+79
			}
		}
		System.out.println(sum);
//		Method -2 
//		String arr[]= {"7has9","daha99","sh1h9"};
//		String expression="";
//		int sum=0;
//		String numStr="";
//		
//		for(String w:arr) {
//			numStr=w.replaceAll("\\D+", "");
//			System.out.println(numStr);//79
//			
//			if(!numStr.isEmpty()) {
//				int num=Integer.parseInt(numStr);//79
//				sum=sum+num;//0+79
//				if(!expression.isEmpty()) {
//					expression +="+";
//				}
//				expression +=num;
//			}
//		}
//		System.out.println(expression + "="+sum);

	}

}
