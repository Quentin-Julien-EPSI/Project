package project.Project;

public enum classes {
	 BARBARIAN (30,10,15,20,5),
	 RANGER (15,15,30,10,10),
	 THIEF(10,20,30,15,15),
	 MAGICIAN(4,50,5,5,30);
	int baseHP;
	int baseMP;
	int attack;
	int defense;
	int magicAttack;

	
	classes (int baseHP,int baseMP,int attack,int defense,int magickAttack) {
		this.baseHP = baseHP;
		this.baseMP = baseMP;
		this.attack = attack;
		this.defense = defense;
		this.magicAttack = magickAttack;
	}
	
}
