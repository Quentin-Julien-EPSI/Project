package project.Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void attackTest() {
		player player2  = new player("test", new armor("Mob", 0), new weapon(), object.HEAL, classes.BARBARIAN);
		player player = new player("test", new armor("Test", 0), new weapon(), object.HEAL, classes.BARBARIAN);
		player.attack(player2);
		assertTrue(player2.actualHP != player2.baseHP);
	}
	@Test
	void magickAttackTest() {
		player player2  = new player("test", new armor("Mob", 0), new weapon(), object.HEAL, classes.MAGICIAN);
		player player = new player("test", new armor("Test", 0), new weapon(), object.HEAL, classes.BARBARIAN);
		player.magicUse(player2);
		assertTrue(player2.actualHP != player2.baseHP);
	}

}
	