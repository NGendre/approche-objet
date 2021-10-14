package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> pays = new HashSet<>();
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");
		Iterator<String> it = pays.iterator();
		String nomLePlusLong = it.next();
		for(String p : pays) {
			if (nomLePlusLong.length()<p.length()) {
				nomLePlusLong = p;
			}			
		}
		pays.remove(nomLePlusLong);
		System.out.println(pays);

	}

}
