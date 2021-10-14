package listes;

public class Ville implements Comparable<Ville>{
	private String nom;
	private Integer nbHabitants;
	
	public Ville(String nom, Integer nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(Integer nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}

	@Override
	public int compareTo(Ville o) {
		if (this.getNbHabitants()>o.getNbHabitants()) {
			return 1;
		}else if (this.getNbHabitants()<o.getNbHabitants()) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
	
	
}
