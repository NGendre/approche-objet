package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	public static void main(String[] args) {
		CalculMoyenne cm = new CalculMoyenne();
		cm.ajouterValeur(11);
		cm.ajouterValeur(18);
		cm.ajouterValeur(1);
		cm.ajouterValeur(20);
		System.out.println(cm);
		cm.moyenne();
	}
}
