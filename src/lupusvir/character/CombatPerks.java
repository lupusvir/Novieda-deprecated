package lupusvir.character;

public class CombatPerks {
	
	//Class levels
	private int fighterLevel = 0;
	private int rangerLevel = 0;
	private int sorcererlevel = 0;
	private int rogueLevel = 0;
	private int monkLevel = 0;
	
	//Role levels
	private boolean tankRole = false;
	private boolean damageRole = false;
	private boolean utilityRole = false;
	private boolean healerRole = false;
	
	public int getFighterLevel() {
		return fighterLevel;
	}
	public void setFighterLevel(int fighterLevel) {
		this.fighterLevel = fighterLevel;
	}
	
	public int getRangerLevel() {
		return rangerLevel;
	}
	
	public void setRangerLevel(int rangerLevel) {
		this.rangerLevel = rangerLevel;
	}
	
	public int getSorcererlevel() {
		return sorcererlevel;
	}
	
	public void setSorcererlevel(int sorcererlevel) {
		this.sorcererlevel = sorcererlevel;
	}
	
	public int getRogueLevel() {
		return rogueLevel;
	}
	
	public void setRogueLevel(int rogueLevel) {
		this.rogueLevel = rogueLevel;
	}
	
	public int getMonkLevel() {
		return monkLevel;
	}
	
	public void setMonkLevel(int monkLevel) {
		this.monkLevel = monkLevel;
	}
	
	public boolean getTankRole() {
		return tankRole;
	}
	
	public void setTankRole(boolean tankRole) {
		this.tankRole = tankRole;
	}
	
	public boolean getDamageRole() {
		return damageRole;
	}
	
	public void setDamageRole(boolean damageRole) {
		this.damageRole = damageRole;
	}
	
	public boolean getUtilityRole() {
		return utilityRole;
	}
	
	public void setUtilityRole(boolean utilityRole) {
		this.utilityRole = utilityRole;
	}
	
	public boolean getHealerRole() {
		return healerRole;
	}
	
	public void setHealerRole(boolean healerRole) {
		this.healerRole = healerRole;
	}
	
}
