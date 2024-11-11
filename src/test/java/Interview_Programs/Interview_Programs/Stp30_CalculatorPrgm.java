package Interview_Programs.Interview_Programs;

import java.util.Scanner;

public class Stp30_CalculatorPrgm {

	public static void main(String[] args) {
		Character operator;
		double num1,num2,res;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter operator sysmbol");
		operator=input.next().charAt(0);//operation +-*%/
		
		if(operator=='+'||operator=='-') {
			System.out.println("Enter the value 1");
			num1=input.nextDouble();//enter value
			System.out.println("Enter the value 2");
			num2=input.nextDouble();//enter value
			
			switch(operator) {
			
			case '+':
				res=num1+num2;
				System.out.println("Addition result "+res);
				break;
			case '-':
				res=num1-num2;
				System.out.println("Subtraction result "+res);
				break;
			}
		}
		else {
			System.out.println("Invalid operator");
		}
		input.close();
	}

}
