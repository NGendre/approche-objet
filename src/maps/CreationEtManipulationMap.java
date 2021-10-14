package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
			HashMap<Integer, String> mapVilles = new HashMap<>();
			mapVilles.put(13, "Marseille");
			mapVilles.put(34, "Montpellier");
			mapVilles.put(44, "Nantes");
			mapVilles.put(75, "Paris");
			mapVilles.put(31, "Toulouse");
			
			mapVilles.put(59, "Lille");
			mapVilles.put(69, "Lyon");
			mapVilles.put(30, "Bordeaux");
			
			Set<Integer> cles = mapVilles.keySet();
			for(Integer cle : cles) {
				System.out.println(cle);
				System.out.println(mapVilles.get(cle));
			}
			 
			System.out.println(mapVilles.size());
			
	}

}
