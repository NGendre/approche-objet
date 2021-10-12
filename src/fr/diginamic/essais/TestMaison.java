package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison m = new Maison();
		Chambre c1 = new Chambre(0, 18);
		Chambre c2 = new Chambre(1, 22);
		Chambre c3 = new Chambre(1, 15);
		Cuisine cu = new Cuisine(0, 20);
		Salon s = new Salon(0, 33);
		SalleDeBain sdb1 = new SalleDeBain(0, 12);
		SalleDeBain sdb2 =  new SalleDeBain(1, 16);
		WC wc1 = new WC(0, 8);
		WC wc2 = new WC(1,10);
		
		m.AjouterPiece(c1);
		m.AjouterPiece(c2);
		m.AjouterPiece(c3);
		m.AjouterPiece(cu);
		m.AjouterPiece(s);
		m.AjouterPiece(sdb1);
		m.AjouterPiece(sdb2);
		m.AjouterPiece(wc1);
		m.AjouterPiece(wc2);
		System.out.println(m.superficieTotale());
		System.out.println(m.superficieEtage(0));
		System.out.println(m.superficieEtage(1));
		System.out.println(cu.getClass().getSimpleName());
		
		System.out.println(m);
	}

}
