package project.Project;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player player1 = new player("Quentin", new armor(armor.noms.get(tools.getRandom(0, 9)), 20), new weapon());
		player player2 = new player(true);
		combat combat1 = new combat(player1, player2);
	}

}
