package fr.diginamic.jdr;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Creature extends Protagoniste{
	private int force;
	private int pointsDeVie;
	
	
	public Creature(int force, int pointsDeVie) {
		this.force = force;
		this.pointsDeVie = pointsDeVie;
	}
	
	
	
	@Override
	public String toString() {
		return "Creature [force=" + force + ", pointsDeVie=" + pointsDeVie + "]";
	}
	
	
	
	
	public int getPointsDeVie() {
		return pointsDeVie;
	}



	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}



	public int getForce() {
		return force;
	}



	public static Creature creerCreature() {
		int r = ThreadLocalRandom.current().nextInt(0,3);
		switch (r) {
		case 0:
			Creature c = new Loup();
			return c;
		case 1:
			Creature g = new Gobelin();
			return g;
		case 2:
			Creature t = new Troll();
			return t;
		default:
			System.out.println("how");
		}
		return null;
		
	}
	
	
	
	
	
	
}
