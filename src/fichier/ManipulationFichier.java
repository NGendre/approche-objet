package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {
	public static void main(String[] args) {
		try {
			File villesPlusDe25000Habitants = new File("grandesVilles.csv");
		      if (villesPlusDe25000Habitants.createNewFile()) {
		        System.out.println("File created: " + villesPlusDe25000Habitants.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		      }
		List<String> ligneAAjouter = new ArrayList<>();
		Path cible = Paths.get("C:\\Users\\noege\\Documents\\workspaceSTS\\approche-objet\\grandesVilles.csv");
		try {
			Path path = Paths.get("C:\\Users\\noege\\Documents\\workspaceSTS\\approche-objet\\src\\fichier\\recensement.csv");
			List<String> lignes = Files.readAllLines(path,StandardCharsets.UTF_8);
			
			for (int i = 1; i<lignes.size();i++) {
				List<String> nouvelleLigne = new ArrayList<>();
				String[] v = lignes.get(i).split(";");
				int nbHabitants = Integer.parseInt(v[9].trim().replaceAll(" ", ""));
				if (nbHabitants>25000) {
					nouvelleLigne.add(v[6]);
					nouvelleLigne.add(v[2]);
					nouvelleLigne.add(v[9]);
					if (i==1) {
						Files.write(cible,nouvelleLigne);
					}
					Files.write(cible,nouvelleLigne,StandardOpenOption.APPEND);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
