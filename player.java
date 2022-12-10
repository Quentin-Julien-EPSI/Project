package project.Project;

import java.util.ArrayList;

public class player {
		classes classes;
		int baseHP;
		int baseMP;
		int attack;
		int defense;
		int magicAttack;
		String name;

		armor armor;
		weapon weapon;

		ArrayList<object> inventory;
		player(String name, armor armor, weapon weapon){
			this.name = name;
			this.baseHP = 10;
			this.baseMP = 10;
			this.attack = 10;
			this.defense = 10;
			this.magicAttack = 10;
			this.armor = armor;
			this.weapon = weapon;
			this.inventory = new ArrayList<object>();
		}
		player(String name, armor armor, weapon weapon,int baseHP, int baseMP, int attack, int defense, int magicAttack){
			this.name = name;
			this.baseHP = baseHP;
			this.baseMP = baseMP;
			this.attack = attack;
			this.defense = defense;
			this.magicAttack = magicAttack;
			this.armor = armor;
			this.weapon = weapon;
			this.inventory = new ArrayList<object>();
		}
		
}
