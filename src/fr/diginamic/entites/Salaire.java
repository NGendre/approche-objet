package fr.diginamic.entites;

import javax.management.loading.PrivateClassLoader;

public class Salaire {
	private String nom;
	private String prenom;
	private double salaire;
	
	
	public Salaire(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}


	@Override
	public String toString() {
		return "Salaire [nom=" + nom + ", prenom=" + prenom + ", salaire=" + salaire + "]";
	}
	
	
	
}
