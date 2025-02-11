package Interview_Programs.Interview_Programs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Stp36_Random_DateTime {

	public static void main(String[] args) {
		System.out.println(1.0/0.0);
		String val = null;
		System.out.println(val);//We have to initialize the variable for Strings(Syntax error)
		String value="";
		System.out.println(value);
		Set<Integer> s1=new HashSet<Integer>();
		
		Random random=new Random();
		
		s1.add(100+random.nextInt(900));
		s1.add(100+random.nextInt(900));
		s1.add(100+random.nextInt(900));
		s1.add(100+random.nextInt(900));
		System.out.println(s1);
		System.out.println(s1.size());
		
		int var= (int) Math.random();
		System.out.println(var);
		
		LocalDate date= LocalDate.now();
		System.out.println(date);
		
		LocalDateTime dateTime= LocalDateTime.now();
		System.out.println(dateTime);

	}

}
