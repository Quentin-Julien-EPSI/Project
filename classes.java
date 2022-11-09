package project.Project;

public enum Classes {
	 BARBARE (30,10,15,20,5),
	 ARCHER (15,15,30,10,10),
	 VOLEUR(10,20,30,15,15),
	 MAGICIEN(4,50,5,5,30);
	int baseHP;
	int baseMP;
	int attack;
	int defense;
	int magicAttack;

	
	Classes (int baseHP,int baseMP,int attack,int defense,int magickAttack) {
		this.baseHP = baseHP;
		this.baseMP = baseMP;
		this.attack = attack;
		this.defense = defense;
		this.magicAttack = magickAttack;
	}
	
}
