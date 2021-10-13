package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public class Troll extends Creature{
	
	public int genererForce() {
		return ThreadLocalRandom.current().nextInt(10,16);
	}
	public int genererPointsDeVie() {
		return ThreadLocalRandom.current().nextInt(20,31);
	}
	
	public Troll() {
		super();
	}
	
	
}