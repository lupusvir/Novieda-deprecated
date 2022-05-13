package lupusvir.character;

public class Time {

	//Time
	private int day = 1;
	private int hour = 8;
	private boolean inDungeon = false;
	private int currentDungeon = 0;
	private int currentState = 0;
	private int currentZone = 0;
	
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public boolean getInDungeon() {
		return inDungeon;
	}
	
	public void setInDungeon(boolean inDungeon) {
		this.inDungeon = inDungeon;
	}
	
	public int getCurrentDungeon() {
		return currentDungeon;
	}
	
	public void setCurrentDungeon(int currentDungeon) {
		this.currentDungeon = currentDungeon;
	}
	
	public int getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}
	
	public int getCurrentZone() {
		return currentZone;
	}
	
	public void setCurrentZone(int currentZone) {
		this.currentZone = currentZone;
	}
	
	
}
