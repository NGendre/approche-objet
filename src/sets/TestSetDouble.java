package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		System.out.println(set);
		Double plusGrandNombre = null;
		for(Double d : set) {
			if (plusGrandNombre == null || d>plusGrandNombre) {
				plusGrandNombre = d;
			}
		}
		System.out.println(plusGrandNombre);
		Double plusPetitNombre = null;
		for(Double d : set) {
			if (plusPetitNombre == null || plusPetitNombre > d) {
				plusPetitNombre = d;
			}
		}
		set.remove(plusPetitNombre);
		System.out.println(set);
		
		
	}
}
