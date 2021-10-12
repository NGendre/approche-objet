package fr.diginamic.formes;

public class Carre extends Rectangle{
	private double longueur;

	public Carre(double longueur) {
		super(longueur,longueur);
		this.longueur = longueur;
	}
	
	public double getPerimetre() {
		double diametre = this.longueur*4;
		return diametre;
	}
	public double getSurface() {
		double surface =  this.longueur*this.longueur;
		return surface;
	}
}
