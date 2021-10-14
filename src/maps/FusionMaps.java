package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>(); 
		map1.put(1, "Rouge"); 
		map1.put(2, "Vert"); 
		map1.put(3, "Orange"); 

		HashMap<Integer, String> map2 = new HashMap<Integer, String>(); 
		map2.put(4, "Blanc"); 
		map2.put(5, "Bleu"); 
		map2.put(6, "Orange"); 
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>(); 
		
		for(int i=0;i>map1.size();i++) {
			map3.put((Integer) map1.keySet().toArray()[i+1] ,map1.get(i+1));
		}
		for(int i=0;i>map2.size();i++) {
			map3.put((Integer) map2.keySet().toArray()[i+1] ,map2.get(i+1));
		}
		System.out.println(map3);
	}
}
