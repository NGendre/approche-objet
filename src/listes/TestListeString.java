package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {
	public static void main(String[] args) {
		ArrayList<String> villes = new ArrayList<>();
		villes.add("Nice");
		villes.add("Carcassonne");
		villes.add("Narbonne");
		villes.add("Lyon");
		villes.add("Foix");
		villes.add("Pau");
		villes.add("Marseille");
		villes.add("Tarbes");
		String nomLePlusLong = "";
		for(String ville : villes) {
			if (ville.length()>nomLePlusLong.length()) {
				nomLePlusLong = ville;
			}
		}
		System.out.println(nomLePlusLong);
		Iterator<String> it = villes.iterator();
		while (it.hasNext()) {
			if (it.next().charAt(0) == 'N') {
				it.remove();
			}
			
		}
		System.out.println(villes);
	}
}
