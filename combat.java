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
		while(p1.actualHP > 0 || p2.actualHP > 0) {
			player actual_player = players.get(actualPlayerIndex);
			player other_player = players.get(get_other(actualPlayerIndex));
			int answer = 0;
			if(players.get(actualPlayerIndex).mob) {
				answer = tools.getRandom(1, 2);
			}else {
				answer = tools.askQuestion();
			}
			switch(answer){
				case 1:
					actual_player.attack(other_player);
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
	}
}