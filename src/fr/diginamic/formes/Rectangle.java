package fr.diginamic.formes;

public class Rectangle extends Forme{
	private double longueur;
	private double largeur;
	
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double getPerimetre() {
		double diametre = this.largeur*2+this.longueur*2;
		return diametre;
	}
	public double getSurface() {
		double surface = this.largeur*this.longueur;
		return surface;
	}
	
	
	
}
