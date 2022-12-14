package project.Project;

import java.util.ArrayList;
import java.util.Arrays;

public class combat {
	int get_other(int actualIndex) {
		if(actualIndex==1) {
			return 0;
		}else {
			return 1;
		}
	}
	combat(player p1, player p2){
		ArrayList<player> players = new ArrayList<player> (Arrays.asList(p1,p2));
		int actualPlayerIndex = 0;
		while(players.get(0).actualHP >= 0 && players.get(1).actualHP >= 0) {
			player actual_player = players.get(actualPlayerIndex);
			player other_player = players.get(get_other(actualPlayerIndex));
			System.out.println(actual_player.name+" a actuellement "+actual_player.actualHP+ "HP");
			System.out.println(other_player.name+" a actuellement "+other_player.actualHP+ "HP");
			int answer = 0;
			if(players.get(actualPlayerIndex).mob) {
				answer = tools.getRandom(1, 2);
			}else {
				answer = tools.askQuestion(players.get(actualPlayerIndex));
			}
			switch(answer){
				case 1:
					actual_player.attack(other_player);
					System.out.println(actual_player.name+" vient d'infliger "+actual_player.attack+" dégats à "+other_player.name+" qui a désormais "+other_player.actualHP+" HP !");
					actualPlayerIndex = get_other(actualPlayerIndex);
					break;
				case 2:
					actual_player.magicUse(other_player);
					actualPlayerIndex = get_other(actualPlayerIndex);
					break;
				case 3:
					actual_player.object.use(actual_player);
					actualPlayerIndex = get_other(actualPlayerIndex);
					break;
				default:
					System.out.println("T'as fait de la merde "+actual_player.name+" il faut choisir parmis 1, 2 ou 3 !!");
					break;
			}
		}
		int looserIndex = 0;
		if(players.get(0).actualHP<=0) {
			looserIndex = 0;
		}else {
			looserIndex = 1;
		}
		System.out.println(players.get(looserIndex).name+" a perdu contre "+players.get(get_other(looserIndex)).name);
	}
}