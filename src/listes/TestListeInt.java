package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		Integer[] i = {-1, 5, 7, 3, -2, 4, 8, 5};
		List<Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		//System.out.println(list);
		//System.out.println(list.size());
		Integer valeurMax = 0;
		for (Integer x : list ) {
			if(x>valeurMax) {
				valeurMax = x;
			}
		}
		System.out.println(valeurMax);
		Integer plusPetitNombre = null;
		int indexASuppr = 0;
		for(Integer x :list) {
			if(plusPetitNombre == null) {
				plusPetitNombre = x;
			}else {
				if (plusPetitNombre>x) {
					plusPetitNombre = x;
					indexASuppr = list.indexOf(x);
					
					
				}
			}
			
		}
		list.remove(indexASuppr);
		for(int x = 0;x<list.size();x++) {
			if(list.get(x)<0) {
				Integer o = Math.abs(list.get(x));
				list.set(x, o);
			}
		}
		System.out.println(list);
		
		
	}

}
