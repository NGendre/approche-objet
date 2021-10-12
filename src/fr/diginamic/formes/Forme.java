package fr.diginamic.formes;

public abstract class Forme {
	
	public abstract double getPerimetre();
	public abstract double getSurface();
	
	public void calculerSurface() {
		System.out.println("Surface: "+getSurface());
	}
	public void calculerPerimetre() {
		System.out.println("Perimetre: "+getPerimetre());
	}
}