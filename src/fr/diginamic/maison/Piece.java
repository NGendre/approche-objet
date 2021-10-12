package fr.diginamic.maison;

public class Piece {
	private int etage;
	private double superficie;
	
	
	public Piece(int etage, double superficie) {
		super();
		this.etage = etage;
		this.superficie = superficie;
	}
	


	@Override
	public String toString() {
		return "Piece [etage=" + etage + ", superficie=" + superficie + "]";
	}



	public double getSuperficie() {
		return superficie;
	}


	public int getEtage() {
		return etage;
	}
	
	
	
	

}
