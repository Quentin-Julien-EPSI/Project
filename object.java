package project.Project;

public enum object {
	 HEAL(0,10),
	 MAGIC(4,5);
	 int restoredHealth;
	 int restoredMagic;
	
	object (int restoratedHealth,int restoredMagic) {
		this.restoredHealth = restoratedHealth;
		this.restoredMagic = restoredMagic;
	}
	public void use(player player) {
		if(player.actualHP + this.restoredHealth < player.baseHP){
			player.actualHP+=this.restoredHealth;
		}else {
			player.actualHP = player.baseHP;
		}
		if(player.actualMP + this.restoredMagic < player.baseMP){
			player.actualMP+=this.restoredMagic;
		}else {
			player.actualMP = player.baseMP;
		}
	}
}