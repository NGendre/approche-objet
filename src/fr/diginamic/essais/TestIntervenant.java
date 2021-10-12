package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		Pigiste p = new Pigiste("Spider", "Man", 4, 200);
		Salarie s = new Salarie(1650, "Jack", "Ma");
		p.afficherDonnees();
		s.afficherDonnees();
		
	}

}
