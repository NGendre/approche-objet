package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
	ArrayList<Piece> maison = new ArrayList<Piece>();
	
	
	
	@Override
	public String toString() {
		return "Maison [maison=" + maison + "]";
	}
	
	
	public void AjouterPiece(Piece piece) {
		if (piece == null) {
			System.out.println("valeur nulle");
			if (piece.getSuperficie()<0) {
				System.out.println("superficie<0");
			}else {
				this.maison.add(piece);
			}
		}
	}
	
	
	public double superficieTotale() {
		double superficie = 0;
		for(Piece p : maison) {
			superficie = superficie+p.getSuperficie();
		}
		return superficie;
	}
	
	
	public double superficieEtage(int etage) {
		double superficie = 0;
		for(Piece p : maison) {
			if(p.getEtage()==etage) {
				superficie = superficie+p.getSuperficie();
			}
		}
		return superficie;
	}
	
//	public double superficieType(String nomPiece) {
//		for(Piece p : maison) {
//			if (p.getClass().getSimpleName()) {
//				
//			}
//			
//		}
//	}
	
	
}
