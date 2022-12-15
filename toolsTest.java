package project.Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class toolsTest {
	@Test
	void getrandomTest() {
		int nb1 = tools.getRandom(1, 10);
		int nb2 = tools.getRandom(-10, -1);
		assertTrue(nb1 >=1 && nb1 <=10);
		assertTrue(nb2 >= -10 && nb2 <= -1);
	}
	
	@Test
	void askQuestionTest() {
		player player = new player(true);
		int answer = tools.askQuestion(player);
		assertTrue(answer >= 1 && answer <= 3);
	}
}