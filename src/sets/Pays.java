package sets;

public class Pays {
	String nom;
	double nbHabitants;
	double pibParHabitants;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getNbHabitants() {
		return nbHabitants;
	}
	
	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public double getPibParHabitants() {
		return pibParHabitants;
	}
	
	public void setPibParHabitants(double pibParHabitants) {
		this.pibParHabitants = pibParHabitants;
	}
	
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibParHabitants=" + pibParHabitants + "]";
	}
	public Pays(String nom, double nbHabitants, double pibParHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitants = pibParHabitants;
	}
	
	
}
