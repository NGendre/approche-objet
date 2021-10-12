package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public class Loup extends Creature{
	
	private static int genererForce() {
		return ThreadLocalRandom.current().nextInt(3,9);
	}
	private static int genererPointsDeVie() {
		return ThreadLocalRandom.current().nextInt(5,11);
	}
	
	public Loup() {
		super(genererForce(),genererPointsDeVie());
	}
	
	
}
