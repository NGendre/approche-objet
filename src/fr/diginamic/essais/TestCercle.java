package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;
public class TestCercle {
	public static void main(String[] args) {
		Cercle c1 = new Cercle(11);
		Cercle c2 = new Cercle(3);	
		System.out.println(c1);
		System.out.println(c2);
		Cercle c3 = CercleFactory.creerCercle(123);
		System.out.println(c3);
		
		
	}

}
