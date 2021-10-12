package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {
	private int force;
	private int pointsDeVie;
	private int score;
	
	
	public Personnage() {
		Random r = new Random();
		Random r2  = new Random();
		int force = r.nextInt(18-12)+12;
		int pointsDeVie = r2.nextInt(50-20)+20;
		this.force = force;
		this.pointsDeVie = pointsDeVie;
		this.score = 0;
	}


	@Override
	public String toString() {
		return "Personnage [force=" + force + ", pointsDeVie=" + pointsDeVie + ", score=" + score + "]";
	}
	
	
	
	
}
