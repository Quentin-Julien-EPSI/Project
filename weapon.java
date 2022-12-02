package project.Project;

import java.util.Arrays;
import java.util.ArrayList;

public class weapon {
	int attack;
	int magickattack;
	String name;
	
	public static ArrayList<String> Name = new ArrayList<String> (Arrays.asList(
			"Rapière", "arc", "arbalète","dague", "claymore",
			"faux", "faucille","épée", "marteau de guerre", "hache",
			"hache de guerre","bâton", "sceptre","glaive","gourgandine",
			"Cataphracte","Contus","Scramasax","Francisque","Javeline",
			"Javelot","Lance","Latte","Sabre","Semispatha","Spangenhelm",
			"Bardiche","Espadon","Fauchard","Flamberge","Fléau","Masse d'arme",
			"Miséricorde","Pertuisane","Pique","Vouge","Contus"));
	
	public weapon () {
		this.attack= tools.getRandom(7,30);
		this.magickattack= tools.getRandom(8, 35);
		this.name= weapon.Name.get(tools.getRandom(0, 36));
	}
}

