package fr.diginamic.entites;

public class Cercle {
	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	
	
	@Override
	public String toString() {
		return "Cercle [rayon= " + rayon + "\nperimetre= "+getPerimetre()+" \nsurface= "+getSurface()+"]";
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
