package fr.diginamic.jdr;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Personnage extends Protagoniste{
	private int score;
	
	public int genererForce() {
		return ThreadLocalRandom.current().nextInt(12,19);
	}


	public int genererPointsDeVie() {
		return ThreadLocalRandom.current().nextInt(20,51);
	}
	
	
	
	
	
	
	public Personnage(int force, int pointsDeVie, int score) {
		super(force, pointsDeVie);
		this.score = score;
	}


	public int getScore() {
		return score;
	}
	public void setScore() {
		this.score = this.score++;
	}



	@Override
	public String toString() {
		return "Personnage [force=" + force + ", pointsDeVie=" + pointsDeVie + ", score=" + score + "]";
	}


	
	

	
}
