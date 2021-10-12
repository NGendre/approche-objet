package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public class Troll extends Creature{
	
	private static int genererForce() {
		return ThreadLocalRandom.current().nextInt(10,16);
	}
	private static int genererPointsDeVie() {
		return ThreadLocalRandom.current().nextInt(20,31);
	}
	
	public Troll() {
		super(genererForce(),genererPointsDeVie());
	}
	
	
}