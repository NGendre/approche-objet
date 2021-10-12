package fr.diginamic.formes;

public class Cercle extends Forme{
	private double rayon;
	
	
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double getPerimetre() {
		double diametre = this.rayon*2*Math.PI;
		return diametre;
	}
	
	public double getSurface() {
		double surface = this.rayon*this.rayon*Math.PI;
		return surface;
	}
	
}
