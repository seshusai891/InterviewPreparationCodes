package Method_Calling;
//Create an object using classB
public class Stp4_ClassA {
	
	private static int age;
	
	public static int getAge() {
		return age;
	}
	public static int getAge(int x,int y) {
		return age;
	}
	
	public static void setAge() {
		age=40;
		System.out.println(age);
	}
	
	public static void main(String args[]) {
		System.out.println("This is parent class");
	}

}
