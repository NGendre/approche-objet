package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public class Gobelin extends Creature{
	
	private static int genererForce() {
		return ThreadLocalRandom.current().nextInt(5,11);
	}
	private static int genererPointsDeVie() {
		return ThreadLocalRandom.current().nextInt(10,16);
	}
	
	public Gobelin() {
		super(genererForce(),genererPointsDeVie());
	}
	
	
}