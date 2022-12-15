package project.Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void attackTest() {
		player player2  = new player("test", new armor("Mob", 0), new weapon() , 10, 10, 10, 0, 0, object.HEAL, classes.BARBARIAN);
		player player = new player("test", new armor("Test", 0), new weapon() , 10, 10, 10, 10, 10, object.HEAL, classes.BARBARIAN);
		player.attack(player2);
		assertEquals(player2.actualHP,0);
	}
	@Test
	void magickAttackTest() {
		player player2  = new player("test", new armor("Mob", 0), new weapon() , 10, 10, 10, 0, 0, object.HEAL, classes.MAGICIAN);
		player player = new player("test", new armor("Test", 0), new weapon() , 10, 10, 10, 20, 5, object.HEAL, classes.BARBARIAN);
		player.magicUse(player2);
		assertEquals(player2.actualHP,0);
	}

}
	