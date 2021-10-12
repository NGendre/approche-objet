package fr.diginamic.chaines;

import fr.diginamic.entites.Salaire;

public class ManipulationChaine {
	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier Caractere: "+premierCaractere);
		System.out.println("Taille: "+chaine.length());
		System.out.println(chaine.indexOf(';'));
		String nomDeFamille = chaine.substring(0, chaine.indexOf(';'));
		System.out.println(nomDeFamille);
		System.out.println(nomDeFamille.toUpperCase());
		System.out.println(nomDeFamille.toLowerCase());
		String[] personne = chaine.split(";");
		Salaire s = new Salaire(personne[0],personne[1],Double.parseDouble(personne[2].replace(" ","")));
		System.out.println(s);
		
		
		
	}
	
}
