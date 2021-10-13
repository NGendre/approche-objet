package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Protagoniste {
	private int force;
	private int pointsDeVie;
	public abstract int genererForce();
	public abstract int  genererPointsDeVie();
	public abstract int getPointsDeVie();
	public abstract void setPointsDeVie(int pointsDeVie);
	public abstract int getForce();
	public Protagoniste(int force, int pointsDeVie) {
		this.force = force;
		this.pointsDeVie = pointsDeVie;
	}
	
	
	
	
	
	public void tourDeCombat(Personnage p,Creature c) {
		int attaquePersonnage = p.getForce()+ThreadLocalRandom.current().nextInt(1, 11);
		int attaqueCreature = c.getForce()+ThreadLocalRandom.current().nextInt(1, 11);
		if (attaqueCreature==attaquePersonnage) {
			System.out.println("Attaques neutralisées");
		}else {
			if (attaqueCreature>attaquePersonnage) {
				c.setPointsDeVie(c.getPointsDeVie()-(attaqueCreature-attaquePersonnage));
			}else {
				p.setPointsDeVie(p.getPointsDeVie()-(attaquePersonnage-attaqueCreature));
			}
		}
	}
}
