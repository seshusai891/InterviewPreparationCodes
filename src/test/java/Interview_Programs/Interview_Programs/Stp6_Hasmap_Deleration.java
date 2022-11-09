package Interview_Programs.Interview_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Stp6_Hasmap_Deleration {
	
//	Hashmap means key,valu pair
	
	public static void main(String args[]) {
		
		LinkedHashMap<String, String> map_obj = new LinkedHashMap<String, String>();
		map_obj.put("Name", "Seshu");
		map_obj.put("Department", "Aerospace");
		map_obj.put("Location", "Bangalore");
		
//		System.out.println(map_obj);
		
		for(Map.Entry<String,String> m:map_obj.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
//			System.out.println(m);
		}
		
		LinkedHashMap<Integer, String> map_obj_int = new LinkedHashMap<Integer, String>();
		map_obj_int.put(1, "Seshu");
		map_obj_int.put(2, "Aerospace");
		map_obj_int.put(3, "Bangalore");
		
//		System.out.println(map_obj);
		
//		for(Map.Entry<String,Integer> m:map_obj_int.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
////			System.out.println(m);
//		}
	}

}
