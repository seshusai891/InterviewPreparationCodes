package Interview_Programs.Interview_Programs;

public class Stp27_GivenNumPrimeorNot {

	public static void main(String[] args) {
		int prime_num=5;
		int count=0;
		for(int i=1;i<=prime_num;i++) {
			if(prime_num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		

	}

}
