package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	private double[] table = new double[0];
	
	@Override
	public String toString() {
		return  "Liste de notes: "+Arrays.toString(table);
	}
	
		
	public void ajouterValeur(double newValue) {
		double[] tableCopy = new double[table.length+1];
		for (int i = 0; i < table.length; i++) {
			tableCopy[i] = table[i];
		}
		table = null;
		tableCopy[tableCopy.length-1]=newValue;
		table = tableCopy;
		tableCopy = null;
	}
	
	
	public void moyenne() {
		double resultat = 0;
		for (int i = 0; i < table.length; i++) {
			resultat = resultat+table[i];
		}
		System.out.println("Moyenne: "+ resultat/table.length);
	}
	
	
}
