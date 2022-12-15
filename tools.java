package project.Project;

import java.util.Random;

import javax.swing.JOptionPane;

public class tools {

	public tools () {
		
	}
	public static int getRandom(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
	
	public static int askQuestion(player player) {
		String question = "Que souhaitez-vous faire ? (1: Attaquer, 2: Utiliser un sort, 3: Utiliser un objet)";
		int answer = Integer.parseInt(JOptionPane.showInputDialog(question));
		if(answer >=1 && answer <=3) {
			return answer;
		}else {
			return 0;
		}
	}
}
