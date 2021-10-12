package fr.diginamic.essais;
import javax.annotation.processing.SupportedSourceVersion;

import fr.diginamic.entites.Theatre;
public class TestTheatre {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("Opera de Paris",3500,3495,150120.89);
		System.out.println(theatre);
		theatre.inscrire(2, 123.40);
		System.out.println(theatre);
		theatre.inscrire(2, 123.40);
		System.out.println(theatre);
		theatre.inscrire(2, 123.40);
		System.out.println(theatre);
		System.out.println(theatre.getNbClientsInscrits());
		System.out.println(theatre.getRecetteTotale());
	}
}
