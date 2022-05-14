package lupusvir.menus;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import lupusvir.GameUtil;
import lupusvir.character.Appearance;
import lupusvir.character.Discoveries;
import lupusvir.character.Modifiers;
import lupusvir.character.Stats;
import lupusvir.character.Statuses;
import lupusvir.character.Time;

public class CharCreator implements ActionListener {
	
	public static Appearance appear = new Appearance();
	public static Discoveries discoveries = new Discoveries();
	public static Modifiers modifiers = new Modifiers();
	public static Stats stats = new Stats();
	public static Time time = new Time();
	public static Statuses statuses = new Statuses();
	
	boolean wantUdder = true;
	
	public CharCreator() {
		GameUtil.clearScreen();
		raceSelect();
	}
	
	public void raceSelect() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		/*I have a funny feeling there's a way better way of doing this.*/
		
		panel.add(GameUtil.createButton("Equidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Canidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 0, 2, 1, 1));
		panel.add(GameUtil.createButton("Hominidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Felidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Reptilia Sapien", this), GameUtil.setConstraints(0.1, 0.1, 2, 2, 1, 1));
		
		panel.add(GameUtil.setLabel("<html><div><center>--- Choose a race ---</center></div>"
				+ "<div></div><div><center>Equidae Sapien (only horses atm)</center></div>" 
				+ "<div><center>A race of all kinds of horse people, zebra people and so on. They range from anthros to taurs."
				+ "They are known to be strong and sturdy with larger genitals. They also tend to be tall.</center></div>"
				+ "<div></div><div><center>Canidae Sapien (only wolves atm)</center></div>" 
				+ "<div><center>A race of dog people. They range from wolf-anthros to any kind of dog anthro and taur. "
				+ "They are known to be sturdy and quick. Their heights tend to be just above average and their genitals larger than normal.</center></div>"
				+ "<div></div><div><center>Hominidae Sapien (only humans atm)</center></div>" 
				+ "<div><center>Range from humans to all kinds of monkeys and apes. They range from very tall to short."
				+ " They're known to be a jack-of-all trades.</center></div>"
				+ "<div></div><div><center>Felidae Sapien (only housecats atm)</center></div>" 
				+ "<div><center>A race of cat people. They range from tiger-anthros to house-cat-anthros. There are also taurs. They are known to be quick and dexterous."
				+ "The Felidae also tend to be on the shorter side.</center></div>"
				+ "<div></div><div><center>Reptilia Sapien (only lizards atm)</center></div>" 
				+ "<div><center>A rac of reptile people. They range from gecko anthros to iguana-anthros. This gives them a wide variety."
				+ "They are known to be smart and wise.</center></div>"), GameUtil.setConstraints(0.1, 0.1, 0, 3, 3, 0));
		
		TitleScreen.frame.add(panel); //adds the panel to the frame
		GameUtil.refreshScreen();
	}
	
	public void sexSelect() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		panel.add(GameUtil.createButton("Option A", this), GameUtil.setConstraints(0.1, 0.1, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Option B", this), GameUtil.setConstraints(0.1, 0.1, 1, 0, 1, 1));
		panel.add(GameUtil.createButton("Option C", this), GameUtil.setConstraints(0.1, 0.1, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Option D", this), GameUtil.setConstraints(0.1, 0.1, 3, 0, 1, 1));
		panel.add(GameUtil.createButton("Option E", this), GameUtil.setConstraints(0.1, 0.1, 4, 0, 1, 1));
		panel.add(GameUtil.createButton("Option F", this), GameUtil.setConstraints(0.1, 0.1, 5, 0, 1, 1));
		panel.add(GameUtil.createButton("Option G", this), GameUtil.setConstraints(0.1, 0.1, 6, 0, 1, 1));
		panel.add(GameUtil.createButton("Option H", this), GameUtil.setConstraints(0.1, 0.1, 7, 0, 1, 1));
		boolean wantUdder = true;
		panel.add(GameUtil.setLabel("<html><div><center>--- Select Sexual Equipment ---</center></div>"
				+ "<div></div><div>Option A - cock and balls</div>"
				+ "<div></div><div>Option B - cock</div>"
				+ "<div></div><div>Option C - vagina</div>"
				+ "<div></div><div>Option D -  boobs and vagina</div>"
				+ "<div></div><div>Option E -  boobs, cock, and balls</div>"
				+ "<div></div><div>Option F -  boobs and cock</div>"
				+ "<div></div><div>Option G -  boobs, cock, balls, and vagina</div>"
				+ "<div></div><div>Option H -  boobs, cock, and vagina</div>"), GameUtil.setConstraints(0, 0.1, 3, 1, 2, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void promptUdder() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		panel.add(GameUtil.createButton("Yes", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("No", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));
		
		panel.add(GameUtil.setLabel("<html><div><center>Would you like an udder?</center></div>"), GameUtil.setConstraints(0.1, 0, 0, 1, 2, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
		
	}
	
	public void udderSelect() {
		GameUtil.clearScreen();
		appear.setUdder(true);
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		panel.add(GameUtil.createButton("Cow", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Horse", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));
		
		panel.add(GameUtil.setLabel("<html><div><center>What type?</center></div>"
					+ "<div><center>Cow - pink udder with 4 teats</center></div>"
					+ "<div><center>Horse - black udder with 2 teats</center></div>"), GameUtil.setConstraints(0.1, 0, 0, 1, 2, 1));
		
		wantUdder = true;
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void promptInternalBalls() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		panel.add(GameUtil.createButton("Yes", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("No", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));
		
		panel.add(GameUtil.setLabel("<html><div><center>Would you like internal balls?</center></div>"), GameUtil.setConstraints(0.1, 0, 0, 1, 2, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void boobs() {
		
	}
	
	public void udder() {
		
	}
	
	public void cock() {
		appear.setCockTotal(1);
		appear.setCockSize(23);
	}
	
	public void balls() {
		appear.setBallSize(10);
		appear.setBalls(2);
	}
	
	public void vagina() {
		
	}
	
	public void sexPerks() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean internalBallsOption = false;
		
		if (e.getActionCommand().equals("Equidae Sapien")) { //race option
			double randHeight = Math.random() * (211 - 180 + 1) + 180;
			
			appear.setRace(1);
			discoveries.setFoundPlainsKingdom(true);
			time.setCurrentZone(0);
			modifiers.setCockSizeMod(2);
			modifiers.setCockNarrowMod(0.5);
			modifiers.setVagSizeMod(2);
			appear.setTailType(0);
			appear.setEarType(1);
			appear.setSkinType(1);
			appear.setFaceType(1);
			appear.setCockType(1);
			appear.setVagType(1);
			
			stats.setStr(15); //total stat points should not exceed 60
			stats.setCon(15);
			stats.setIntel(5);
			stats.setDex(5);
			
			stats.setLib(12); //total sex stat points should not exceed 30
			stats.setSen(12);
			stats.setMent(6);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Canidae Sapien")) { //race option
			double randHeight = Math.random() * (181 - 150 + 1) + 150;
			
			appear.setRace(2);
			discoveries.setFoundForestKingdom(true);
			time.setCurrentZone(1);
			appear.setKnot(true);
			appear.setTailType(1);
			appear.setEarType(2);
			appear.setSkinType(1);
			appear.setFaceType(2);
			appear.setCockType(2);
			appear.setVagType(2);
			
			stats.setCon(15);
			stats.setDex(15);
			stats.setWis(5);
			stats.setCha(5);
			
			stats.setMent(12);
			stats.setSen(12);
			stats.setLib(6);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Hominidae Sapien")) { //race option
			double randHeight = Math.random() * (211 - 140 + 1) + 140;
			double randPlace = Math.random() * (3 - 0 + 1);
			int randPlaceActual = (int) Math.floor(randPlace);
			
			appear.setRace(0);
			
			if (randPlace == 0) { time.setCurrentZone(randPlaceActual); }
			else if (randPlaceActual == 1) { time.setCurrentZone(randPlaceActual); }
			else if (randPlaceActual == 2) { time.setCurrentZone(randPlaceActual); }
			else if (randPlaceActual == 3) { time.setCurrentZone(randPlaceActual); }
			else { System.out.println("Random place out of range."); }
			
			if (time.getCurrentZone() == 0) { discoveries.setFoundPlainsKingdom(true); }
			else if (time.getCurrentZone() == 1) { discoveries.setFoundForestKingdom(true); }
			else if (time.getCurrentZone() == 2) { discoveries.setFoundJungleKingdom(true); }
			else if (time.getCurrentZone() == 3) { discoveries.setFoundDesertKingdom(true); }
			else { System.out.println("Error setting discovered towns."); }
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Felidae Sapien")) { //race option
			double randHeight = Math.random() * (151 - 120 + 1) + 120;
			
			appear.setRace(3);
			discoveries.setFoundJungleKingdom(true);
			time.setCurrentZone(2);
			appear.setTailType(2);
			appear.setEarType(3);
			appear.setSkinType(1);
			appear.setFaceType(3);
			
			stats.setDex(15);
			stats.setIntel(15);
			stats.setCon(5);
			stats.setStr(5);
			appear.setCockType(3);
			appear.setVagType(3);
			
			stats.setMent(8);
			stats.setSen(12);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Reptilia Sapien")) { //race option
			double randHeight = Math.random() * (171 - 150 + 1) + 150;
			
			appear.setRace(4);
			discoveries.setFoundDesertKingdom(true);
			time.setCurrentZone(3);
			appear.setTailType(3);
			appear.setEarType(4);
			appear.setSkinType(2);
			appear.setFaceType(4);
			appear.setCockType(4);
			appear.setVagType(4);
			
			stats.setIntel(15);
			stats.setWis(15);
			stats.setCha(5);
			stats.setStr(5);
			
			stats.setMent(12);
			stats.setLib(8);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
		
		} else if (e.getActionCommand().equals("Option A")) { //cock and balls option	
			cock();
			promptInternalBalls();
			
		} else if (e.getActionCommand().equals("Option B")) { //cock option
			cock();
			appear.setShowBalls(false);
			promptInternalBalls();
			
		} else if (e.getActionCommand().equals("Option C")) { //vagina option
			appear.setVagTotal(1);
			appear.setVagSize(23);
			appear.setVulvaSize(23);
			appear.setClitTotal(1);
			appear.setClitSize(13);
			
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option D")) { //boobs and vagina option
			appear.setBoobTotal(2);
			appear.setBoobSize(1);
			appear.setNippleTotal(2);
			appear.setNippleLength(4);
			appear.setNippleThickness(3);
			appear.setNippleAerolaSize(8);
			appear.setVagTotal(1);
			appear.setVagSize(23);
			appear.setVulvaSize(23);
			appear.setClitTotal(1);
			appear.setClitSize(13);
			
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option E")) { //boobs, cock, and balls option
			appear.setBoobTotal(2);
			appear.setBoobSize(1);
			appear.setNippleTotal(2);
			appear.setNippleLength(4);
			appear.setNippleThickness(3);
			appear.setNippleAerolaSize(8);
			appear.setCockTotal(1);
			appear.setCockSize(23);

		
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option F")) { //boobs and cock option
			appear.setBoobTotal(2);
			appear.setBoobSize(1);
			appear.setNippleTotal(2);
			appear.setNippleLength(4);
			appear.setNippleThickness(3);
			appear.setNippleAerolaSize(8);
			appear.setCockTotal(1);
			appear.setCockSize(23);
			appear.setShowBalls(false);
			
			promptInternalBalls();
			
		} else if (e.getActionCommand().equals("Option G")) { //boobs, cock, balls, and vagina option
			appear.setBoobTotal(2);
			appear.setBoobSize(1);
			appear.setNippleTotal(2);
			appear.setNippleLength(4);
			appear.setNippleThickness(3);
			appear.setNippleAerolaSize(8);
			appear.setCockTotal(1);
			appear.setCockSize(23);
			appear.setBallSize(10);
			appear.setBalls(2);
			appear.setVagTotal(1);
			appear.setVagSize(23);
			appear.setVulvaSize(23);
			appear.setClitTotal(1);
			appear.setClitSize(13);
			
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option H")) { //boobs, cock, and vagina option
			appear.setBoobTotal(2);
			appear.setBoobSize(1);
			appear.setNippleTotal(2);
			appear.setNippleLength(4);
			appear.setNippleThickness(3);
			appear.setNippleAerolaSize(8);
			appear.setCockTotal(1);
			appear.setCockSize(23);
			appear.setShowBalls(false);
			appear.setVagTotal(1);
			appear.setVagSize(23);
			appear.setVulvaSize(23);
			appear.setClitTotal(1);
			appear.setClitSize(13);
		
			promptUdder();
			
		} else if (e.getActionCommand().equals("Yes")) { //yes/no option
			if(appear.getShowBalls() == false && appear.getUdder() == false && internalBallsOption == false && wantUdder == false) { //if player doesn't have balls but still wants and udder
				internalBallsOption = true;
				balls();
				promptUdder();
			} else if (appear.getShowBalls() == false && appear.getUdder() == false && internalBallsOption == true && wantUdder == false){ udderSelect(); }
			else { sexPerks(); }
			
		} else if (e.getActionCommand().equals("No")) { //yes/no option
			if (appear.getShowBalls() == true && wantUdder == false) { promptUdder(); }
			else if(appear.getShowBalls() == true && wantUdder == false) {}
			else if(appear.getShowBalls() == false && appear.getUdder() == false && internalBallsOption == true && wantUdder == false) { sexPerks(); }
			else if (appear.getShowBalls() == false && appear.getUdder() == false && internalBallsOption == false && wantUdder == false) { promptUdder(); }
			else { sexPerks(); } 
			
		} else if (e.getActionCommand().equals("Cow")) { //udder selection
			
			
		} else if (e.getActionCommand().equals("Horse")) { //udder selection
			
		}

	}

}
