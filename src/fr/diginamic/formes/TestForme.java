package fr.diginamic.formes;
import fr.diginamic.essais.AffichageForme;

public class TestForme {

	public static void main(String[] args) {
		Cercle ce = new Cercle(5);
		Rectangle r = new Rectangle(5, 11);
		Carre c = new Carre(8);
		AffichageForme.afficher(c);
		AffichageForme.afficher(ce);
		AffichageForme.afficher(r);
	}

}
