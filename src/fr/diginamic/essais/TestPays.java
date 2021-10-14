package fr.diginamic.essais;

import java.util.HashSet;

import sets.Pays;

public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> pays = new HashSet<>();
		pays.add(new Pays("USA", 329.5, 59495));
		pays.add(new Pays("France", 67.39, 43551));
		pays.add(new Pays("Allemagne", 83.24, 50206));
		pays.add(new Pays("UK", 67.22, 43620));
		pays.add(new Pays("Italie", 59.55, 37970));
		pays.add(new Pays("Japon", 125.8 , 42659));
		pays.add(new Pays("Chine", 1402 , 16624));
		pays.add(new Pays("Russie", 144.1 , 28712));
		pays.add(new Pays("Inde", 1380 , 5174));
		Pays pibLePlusImportant = new Pays(null, 0, 0);
		for(Pays p :pays) {
			if (pibLePlusImportant.getNom() == null || pibLePlusImportant.getPibParHabitants()<p.getPibParHabitants()) {
				pibLePlusImportant.setNom(p.getNom());
				pibLePlusImportant.setNbHabitants(p.getNbHabitants());
				pibLePlusImportant.setPibParHabitants(p.getPibParHabitants());
			}
		}
		
		System.out.println(pibLePlusImportant);
		Pays pibTotalLePlusImportant = new Pays(null, 0, 0);
		for(Pays p :pays) {
			if (pibTotalLePlusImportant.getNom() == null || pibTotalLePlusImportant.getPibParHabitants()*pibTotalLePlusImportant.getNbHabitants()<p.getPibParHabitants()*p.getNbHabitants()) {
				pibTotalLePlusImportant = p;
			}
		}
		System.out.println(pibTotalLePlusImportant);
		Pays pibMinASuppr = new Pays(null, 0, 0);
		for(Pays p :pays) {
			if (pibMinASuppr.getNom() == null || pibMinASuppr.getPibParHabitants()*pibMinASuppr.getNbHabitants()>p.getPibParHabitants()*p.getNbHabitants()) {
				pibMinASuppr = p;
			}
		}
		System.out.println(pibMinASuppr);
		System.out.println(pays.contains(pibMinASuppr));
		System.out.println(pays.remove(pibMinASuppr));
		System.out.println(pays);

		
		
	}
}
