package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String, Double> mapSalaires = new HashMap<>();
		mapSalaires.put("Philippe", 1330.30);
		mapSalaires.put("Marc", 1212.30);
		mapSalaires.put("Jean", 2111.30);
		
		System.out.println(mapSalaires.size());
		
		

	}

}
