package fr.diginamic.salaire;

public abstract class Intervenant {
	private String nom;
	private String prenom;
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public abstract double getSalaireMensuel();
//	public abstract String getStatut();
	public void afficherDonnees() {
		System.out.println("Nom: "+nom
				+ "\nPrenom: "+prenom
				+ "\nSalaire: "+this.getSalaireMensuel()
				+ "\nStatut: "+ this.getClass().getSimpleName());
	}
	
	
}
