package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {
//	ArrayList<Integer> liste = new ArrayList<Integer>();
//
//	public CreationListe() {
//		for (int i=1;i<=100;i++) {
//			this.liste.add(i);	
//		}
//	}
	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<Integer>();
		for (int i=1;i<=100;i++) {
			liste.add(i);	
		}
		
		System.out.println(liste.size());
	}
	
	
	
}
