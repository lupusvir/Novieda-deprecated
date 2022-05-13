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
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Equidae Sapien")) {
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
			
			stats.setStr(15);
			stats.setCon(15);
			stats.setIntel(5);
			stats.setDex(5);
			
			stats.setLib(12);
			stats.setSen(12);
			stats.setMent(6);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Canidae Sapien")) {
			double randHeight = Math.random() * (181 - 150 + 1) + 150;
			
			appear.setRace(2);
			discoveries.setFoundForestKingdom(true);
			time.setCurrentZone(1);
			appear.setKnot(true);
			appear.setTailType(1);
			appear.setEarType(2);
			appear.setSkinType(1);
			appear.setFaceType(2);
			
			stats.setCon(15);
			stats.setDex(15);
			stats.setWis(5);
			stats.setCha(5);
			
			stats.setMent(12);
			stats.setSen(12);
			stats.setLib(6);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Hominidae Sapien")) {
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
			
			appear.setEarType(0);
			appear.setSkinType(0);
			appear.setFaceType(0);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Felidae Sapien")) {
			double randHeight = Math.random() * (151 - 120 + 1) + 120;
			
			appear.setRace(3);
			discoveries.setFoundJungleKingdom(true);
			time.setCurrentZone(2);
			appear.setTailType(2);
			appear.setEarType(3);
			appear.setSkinType(1);
			appear.setFaceType(3);
			
//			Char.strength = 15;
			
//			Char.mentality = 15;
//			Char.libido = 17;
//			Char.sensitivity = 17;
			
//			Char.tallness = -3;
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Reptilia Sapien")) {
//			Char.race = 6;
//			Char.foundOviasis = true;
//			Char.currentZone = 6;
//			Char.lizardAffinity = 50;
//			Char.dominant = 6;
//			Char.eggLaying = 1;
//			Char.eggTime = 36;
//			Char.eggMaxTime = 36;
//			Char.tail = 6;
//			Char.ears = 6;
//			Char.skinType = 3;
//			Char.faceType = 60;
//			Char.strength = 17;
//			Char.mentality = 16;
//			Char.libido = 15;
//			Char.sensitivity = 16;
//			Char.tallness = 2;
//			new SexSelect();
		}

	}

}
