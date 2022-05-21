package lupusvir.menus;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import lupusvir.GameUtil;

public class DevMenu implements ActionListener {
	
	public DevMenu() {
		GameUtil.clearScreen();
		devCharRace();
	}
	
	public void devCharRace() {
		double randHeight = Math.random() * (211 - 180 + 1) + 180;
		
		CharCreator.appear.setRace(1);
		CharCreator.discoveries.setFoundPlainsKingdom(true);
		CharCreator.time.setCurrentZone(0);
		CharCreator.modifiers.setCockSizeMod(2);
		CharCreator.modifiers.setCockNarrowMod(0.5);
		CharCreator.modifiers.setVagSizeMod(2);
		CharCreator.appear.setTailType(0);
		CharCreator.appear.setEarType(1);
		CharCreator.appear.setSkinType(1);
		CharCreator.appear.setFaceType(1);
		CharCreator.appear.setCockType(1);
		CharCreator.appear.setVagType(1);
		
		CharCreator.stats.setStr(15); //total stat points should not exceed 60
		CharCreator.stats.setCon(15);
		CharCreator.stats.setIntel(5);
		CharCreator.stats.setDex(5);
		
		CharCreator.stats.setLib(12); //total sex stat points should not exceed 30
		CharCreator.stats.setSen(12);
		CharCreator.stats.setMent(6);
		
		CharCreator.stats.setTotalLust(100);
		
		CharCreator.appear.setHeight((int) Math.floor(randHeight));
		devCharSex();
	}
	
	public void devCharSex() {
		//gives boobs
		CharCreator.appear.setBoobTotal(2);
		CharCreator.appear.setBoobSize((int) (Math.random() * (4 - 1 + 1) + 1));
		CharCreator.appear.setNippleTotal(2);
		CharCreator.appear.setNippleLength(4);
		CharCreator.appear.setNippleThickness(3);
		CharCreator.appear.setNippleAerolaSize(8);
		
		//gives udder
		if(CharCreator.appear.getBoobTotal() > 1) {
			CharCreator.appear.setUdderSize(CharCreator.appear.getBoobSize() * 2);
			CharCreator.appear.setTeatLength(CharCreator.appear.getNippleLength() * 2);
			CharCreator.appear.setTeatThickness(CharCreator.appear.getNippleThickness() * 2);
		} else {
			CharCreator.appear.setBoobSize(1);
			CharCreator.appear.setNippleLength(4);
			CharCreator.appear.setNippleThickness(3);
			CharCreator.appear.setUdderSize(CharCreator.appear.getBoobSize() * 2);
			CharCreator.appear.setTeatLength(CharCreator.appear.getNippleLength() * 2);
			CharCreator.appear.setTeatThickness(CharCreator.appear.getNippleThickness() * 2);
		}
		
		//gives cock
		CharCreator.appear.setCockTotal(1);
		CharCreator.appear.setCockSize(23);
		
		//gives balls
		CharCreator.appear.setBallSize(10);
		CharCreator.appear.setBalls(2);
		
		//gives vagina
		CharCreator.appear.setVagTotal(1);
		CharCreator.appear.setVagSize(23);
		CharCreator.appear.setVulvaSize(23);
		CharCreator.appear.setClitTotal(1);
		CharCreator.appear.setClitSize(13);
		devCharSexPerks();
	}
	
	public void devCharSexPerks() {
		//gives macro sex perks
		CharCreator.sexPerks.setMacroFertilityLevel(1);
		CharCreator.sexPerks.setMacroVirilityLevel(1);
		CharCreator.sexPerks.setMacroSizeLevel(1);
		CharCreator.sexPerks.setMacroCock(true);
		CharCreator.sexPerks.setMacroBalls(true);
		CharCreator.sexPerks.setMacroBoobs(true);
		CharCreator.sexPerks.setMacroVagina(true);
		CharCreator.sexPerks.setMacroUdder(true);
		devCharCombatPerks();
	}
	
	public void devCharCombatPerks() {
		CharCreator.combatPerks.setMonkLevel(1);
		CharCreator.combatPerks.setTankRole(true);
		devCharName();
	}
	
	public void devCharName() {
		CharCreator.appear.setName("Subject Delta");
		displayOptions();
	}
	
	public void displayOptions() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		panel.add(GameUtil.createButton("Macro Perk Menu", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Class Menu", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));
		panel.add(GameUtil.createButton("Character Name Menu", this), GameUtil.setConstraints(0.1, 0, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Main Page", this), GameUtil.setConstraints(0.1, 0, 3, 0, 1, 1));
		panel.add(GameUtil.createButton("Bypass Intro prompt", this), GameUtil.setConstraints(0.1, 0, 4, 0, 1, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Macro Perk Menu")) { new CharCreator().macroSPerk(); } 
		else if (e.getActionCommand().equals("Class Menu")) { new CharCreator().classMenu(); }
		else if (e.getActionCommand().equals("Character Name Menu")) { new CharCreator().charNameMenu(); }
		else if (e.getActionCommand().equals("Main Page")) { new MainPage(); }
		else if (e.getActionCommand().equals("Bypass Intro prompt")) { new MainPage().displayMainPage(); }
	}
}
