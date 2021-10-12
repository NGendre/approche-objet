package fr.diginamic.entites;

public class Theatre {
	private String nom;
	private int capaciteMax;
	private int nbClientsInscrits;
	private double recetteTotale;
	
	
	
	public Theatre(String nom, int capaciteMax, int nbClientsInscrits, double recetteTotale) {
		super();
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.nbClientsInscrits = nbClientsInscrits;
		this.recetteTotale = recetteTotale;
	}
	
	


	public int getNbClientsInscrits() {
		return this.nbClientsInscrits;
	}




	public double getRecetteTotale() {
		return this.recetteTotale;
	}




	@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", capaciteMax=" + capaciteMax + ", nbClientsInscrits=" + nbClientsInscrits
				+ ", recetteTotale=" + recetteTotale + "]";
	}




	public void inscrire(int nbClients,double prixPlace) {
		if (this.nbClientsInscrits+nbClients<this.capaciteMax) {
			this.nbClientsInscrits=this.nbClientsInscrits+nbClients;
			this.recetteTotale = this.recetteTotale+nbClients*prixPlace;
		} else {
			System.out.println("capacite maximale atteinte");
		}
		
	}
}
