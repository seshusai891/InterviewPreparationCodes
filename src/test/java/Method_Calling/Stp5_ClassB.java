package Method_Calling;

public class Stp5_ClassB extends Stp4_ClassA{
	
	public static void main(String args[]) {
//		Stp5_ClassB obj=new Stp4_ClassA();//wrong
		Stp4_ClassA abObj=new Stp5_ClassB();
		Stp4_ClassA aObj=new Stp4_ClassA();
		setAge();
		
	}

}
