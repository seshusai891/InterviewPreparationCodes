package Interview_Programs.Interview_Programs;

public class Stp23_ExtractNumSum {

	public static void main(String[] args) {
		String name="123Sai Seshu456";
		name=name.replaceAll("[^0-9]", "");
		
		int num=Integer.parseInt(name);
		int sum=0;
		while(num!=0) {
			int digits=num%10;
			sum=sum+digits;
			num/=10;
		}
System.out.println(sum);
	}

}
