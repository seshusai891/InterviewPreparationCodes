package Interview_Programs.Interview_Programs;

import java.util.Arrays;

public class Stp2_Prime_Numbers_Print {
	
//	prime numbers = 2,3,5,7,11,13,17,19,23.... 
//	Number divisible by its own
//	Check condition remainder is zero
	public static void main(String args[]) {
		int prime_num=53,count=0;
//		for(int i=2;i<=prime_num;i++) {
//			for(int j=2;j<=i;j++) {    
//				if(j==i) {
//					System.out.print(i+" ");
//				}
//				if(i%j==0) {
//					break;
//				}
//			}
//			
//		}
		for(int i=1;i<prime_num;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(i+" ");
				}
		}
//		Another Method
//		System.out.println(2/2);//Quotient
//		System.out.println(2%2);//Remainder
		System.out.println();
		int prime_num1=30,count1=0;
		for(int i=2;i<prime_num1;i++) {
			count1=0;
			for(int j=2;j<i;j++) {
				//if i=6
//				j=2;j<6;j++
//				i=6 j=2,3,4,5,6
				if(i%j==0) {
//					6%2=0; 
//					6%3=0;
//					6%4=0;
//					6%5!=0;
					count1++;
					break;
				}
			}
			if(count1==0) {
				System.out.print(i+" ");
			}
		}
	}
}