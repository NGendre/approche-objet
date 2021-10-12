package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	public static void afficher(Forme forme) {
		forme.calculerPerimetre();
		forme.calculerSurface();
	}

}
