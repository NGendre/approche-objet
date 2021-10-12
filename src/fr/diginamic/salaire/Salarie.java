package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	private double salaireMensuel;

	public Salarie(double salaireMensuel, String nom, String prenom) {
		super(nom,prenom);
		this.salaireMensuel = salaireMensuel;
	}

	public double getSalaireMensuel() {
		return salaireMensuel;
	}
//	public String getStatut() {
//		return 
//	}
	
	
	
}
