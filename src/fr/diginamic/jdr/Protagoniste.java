package fr.diginamic.jdr;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Protagoniste {
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
