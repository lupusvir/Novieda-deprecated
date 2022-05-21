package lupusvir.character;

public class Stats {
	
	//Core Stats
	private int str = 10;
	private int strMod = 0;
	
	private int dex = 10;
	private int dexMod = 0;
	
	private int con = 10;
	private int conMod = 0;
	
	private int intel = 10;
	private int intelMod = 0;
	
	private int wis = 10;
	private int wisMod = 0;
	
	private int cha = 10;
	private int chaMod = 0;
	
	private int totalHP = 10;
	private int currentHP = 10;
	
	private int totalEP = 10;
	private int currentEP = 10;
	
	//Sex stats
	private int ment = 10; //lower mentality more likely PC to think like slut, greater less likely
	private int mentMod = 0;
	
	private int lib = 10;
	private int libMod = 0;
	
	private int sen = 10; //greater sensitivity PC is more vulnerable to getting horny from being touched
	private int senMod = 0;
	
	private int totalLust = 0;
	private int currentLust = 0;
	
	private int coin = 0;
	
	public int getStr() {
		return str;
	}
	
	public void setStr(int str) {
		this.str = str;
	}
	
	public int getStrMod() {
		return strMod;
	}
	
	public void setStrMod(int strMod) {
		this.strMod = strMod;
	}
	
	public int getDex() {
		return dex;
	}
	
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	public int getDexMod() {
		return dexMod;
	}
	
	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}
	
	public int getCon() {
		return con;
	}
	
	public void setCon(int con) {
		this.con = con;
	}
	
	public int getConMod() {
		return conMod;
	}
	
	public void setConMod(int conMod) {
		this.conMod = conMod;
	}
	
	public int getIntel() {
		return intel;
	}
	
	public void setIntel(int intel) {
		this.intel = intel;
	}
	
	public int getIntelMod() {
		return intelMod;
	}
	
	public void setIntelMod(int intelMod) {
		this.intelMod = intelMod;
	}
	
	public int getWis() {
		return wis;
	}
	
	public void setWis(int wis) {
		this.wis = wis;
	}
	
	public int getWisMod() {
		return wisMod;
	}
	
	public void setWisMod(int wisMod) {
		this.wisMod = wisMod;
	}
	
	public int getCha() {
		return cha;
	}
	
	public void setCha(int cha) {
		this.cha = cha;
	}
	
	public int getChaMod() {
		return chaMod;
	}

	public void setChaMod(int chaMod) {
		this.chaMod = chaMod;
	}

	public int getMent() {
		return ment;
	}
	
	public void setMent(int ment) {
		this.ment = ment;
	}
	
	public int getMentMod() {
		return mentMod;
	}
	
	public void setMentMod(int mentMod) {
		this.mentMod = mentMod;
	}
	
	public int getLib() {
		return lib;
	}
	
	public void setLib(int lib) {
		this.lib = lib;
	}
	
	public int getLibMod() {
		return libMod;
	}
	
	public void setLibMod(int libMod) {
		this.libMod = libMod;
	}
	
	public int getSen() {
		return sen;
	}
	
	public void setSen(int sen) {
		this.sen = sen;
	}
	
	public int getSenMod() {
		return senMod;
	}
	
	public void setSenMod(int senMod) {
		this.senMod = senMod;
	}
	
	public int getTotalHP() {
		return totalHP;
	}
	
	public void setTotalHP(int totalHP) {
		this.totalHP = totalHP;
	}
	
	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getTotalEP() {
		return totalEP;
	}
	
	public void setTotalEP(int totalEP) {
		this.totalEP = totalEP;
	}
	
	public int getCurrentEP() {
		return currentEP;
	}

	public void setCurrentEP(int currentEP) {
		this.currentEP = currentEP;
	}

	public int getTotalLust() {
		return totalLust;
	}
	
	public void setTotalLust(int totalLust) {
		this.totalLust = totalLust;
	}
	
	public int getCurrentLust() {
		return currentLust;
	}

	public void setCurrentLust(int currentLust) {
		this.currentLust = currentLust;
	}

	public int getCoin() {
		return coin;
	}
	
	public void setCoin(int coin) {
		this.coin = coin;
	}
	
}
