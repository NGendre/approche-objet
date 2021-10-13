package listes;

import java.util.ArrayList;

public class VilleTest {

	public static void main(String[] args) {
		ArrayList<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343000));
		villes.add(new Ville("Carcassonne", 47800));
		villes.add(new Ville("Narbonne",53400 ));
		villes.add(new Ville("Lyon",484000 ));
		villes.add(new Ville("Foix", 9700 ));
		villes.add(new Ville("Pau", 77200));
		villes.add(new Ville("Marseille", 850000));
		villes.add(new Ville("Tarbes", 40600));
		Ville villeLaPlusPeuplee  = new Ville(null, 0);
		for(Ville v : villes) {
			if (v.getNbHabitants()>villeLaPlusPeuplee.getNbHabitants()) {
				villeLaPlusPeuplee.setNbHabitants(v.getNbHabitants());
				villeLaPlusPeuplee.setNom(v.getNom());
			}
		}
		System.out.println(villeLaPlusPeuplee);
		Ville villeLaMoinsPeuplee  = new Ville(null, 0);
		for(Ville v : villes) {
			if (villeLaMoinsPeuplee.getNbHabitants() == 0 || v.getNbHabitants()<villeLaMoinsPeuplee.getNbHabitants()) {
				villeLaMoinsPeuplee.setNbHabitants(v.getNbHabitants());
				villeLaMoinsPeuplee.setNom(v.getNom());
			
			}
		}
		System.out.println(villeLaMoinsPeuplee);
		
		for(Ville v : villes) {
			if (v.getNbHabitants()>100000) {
				v.setNom(v.getNom().toUpperCase());
			}
		}
		System.out.println(villes);

	}

}
