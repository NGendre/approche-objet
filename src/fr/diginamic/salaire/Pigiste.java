package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	private double joursTravailles;
	private double remunerationJournaliere;
	
	
	
	
	public Pigiste(String nom, String prenom, double joursTravailles, double remunerationJournaliere) {
		super(nom, prenom);
		this.joursTravailles = joursTravailles;
		this.remunerationJournaliere = remunerationJournaliere;
	}
	




	public double getSalaireMensuel() {
		return this.joursTravailles*this.remunerationJournaliere;
	}
	
	
}
