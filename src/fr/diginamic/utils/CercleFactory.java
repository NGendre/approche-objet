package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public static Cercle creerCercle(double rayonRandom) {
		return new Cercle(rayonRandom);
	}
	
	
}
