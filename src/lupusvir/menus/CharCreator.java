package lupusvir.menus;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import lupusvir.GameUtil;

public class CharCreator implements ActionListener {
	
	public CharCreator() {
		GameUtil.clearScreen();
		raceSelection();
	}
	
	public void raceSelection() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		/*I have a funny feeling there's a way better way of doing this.*/
		
		panel.add(GameUtil.createButton("Equan", this), GameUtil.setConstraints(0.1, 0.1, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Lupan", this), GameUtil.setConstraints(0.1, 0.1, 0, 2, 1, 1));
		panel.add(GameUtil.createButton("Human", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Feline", this), GameUtil.setConstraints(0.1, 0.1, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Lizan", this), GameUtil.setConstraints(0.1, 0.1, 2, 2, 1, 1));
		
		panel.add(GameUtil.setLabel("<html><div><center>--- Choose a race ---</center></div>"
				+ "<div></div><div><center>Equan</center></div>" 
				+ "<div><center>A race supposedly descendant of horses, their large genitals make them slightly more sexual and their muscles are more powerful.</div></center>"
				+ "<div></div><div><center>Lupan</center></div>" 
				+ "<div><center>A race supposedly descendant of wolves, their lean bodies are stronger and their minds more quick-witted.</center></div>"
				+ "<div></div><div><center>Human</center>" 
				+ "<div><center>A race supposedly descendant of apes, their curious minds are more open to change and their skin is slightly more sensitive.</center></div>"
				+ "<div></div><div><center>Feline</center>" 
				+ "<div><center>A race supposedly descendant of cats, their lust-driven society makes them a bit more sexual and sensitive.</center></div>"
				+ "<div></div><div><center>Lizan</center></div>" 
				+ "<div><center>A race supposedly descendant of some kind of reptile, their desert-adapted bodies have made them stronger, "
				+ "but they're still careful as their scales make them somewhat sensitive.</center></div>"), GameUtil.setConstraints(0.1, 0.1, 0, 3, 3, 0));
		
		TitleScreen.frame.add(panel); //adds the panel to the frame
		GameUtil.refreshScreen();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Equan")) {
//			Char.race = 2;
//			Char.foundFirmshaft = true;
//			Char.currentZone = 2;
//			Char.horseAffinity = 50;
//			Char.cockSizeMod += 1;
//			Char.cockNarrowMod += 0.5;
//			Char.vagSizeMod += 1;
//			Char.dominant = 2;
//			Char.tail = 2;
//			Char.ears = 2;
//			Char.skinType = 2;
//			Char.faceType = 20;
//			Char.strength = 17;
//			Char.mentality = 15;
//			Char.libido	= 17;
//			Char.sensitivity = 15;
//			Char.tallness = 4;
//			new SexSelect();
			
		} else if (e.getActionCommand().equals("Lupan")) {
//			Char.race = 3;
//			Char.foundTieden = true;
//			Char.currentZone = 3;
//			Char.wolfAffinity = 50;
//			Char.knot = true;
//			Char.boobTotal = 6;
//			Char.dominant = 3;
//			Char.tail = 3;
//			Char.ears = 3;
//			Char.skinType = 2;
//			Char.faceType = 30;
//			Char.strength = 17;
//			Char.mentality = 17;
//			Char.libido = 15;
//			Char.sensitivity = 15;
//			Char.tallness = -2;
//			new SexSelect();
			
		} else if (e.getActionCommand().equals("Human")) {
//			Char.race = 1;
//			Char.changeMod += .5;
//			Char.currentZone = 1;
//			Char.foundSoftlik = true;
//			Char.humanAffinity = 50;
//			Char.dominant = 1;
//			Char.ears = 1;
//			Char.skinType = 1;
//			Char.faceType = 10;
//			Char.strength = 15;
//			Char.mentality = 17;
//			Char.libido = 15;
//			Char.sensitivity = 17;
//			new SexSelect();
			
		} else if (e.getActionCommand().equals("Feline")) {
//			Char.race = 4;
//			Char.foundSizCalit = true;
//			Char.currentZone = 4;
//			Char.catAffinity = 50;
//			Char.dominant = 4;
//			Char.heat++;
//			Char.heatMaxTime = 96;
//			Char.heatTime = 96;
//			Char.boobTotal = 6;
//			Char.tail = 4;
//			Char.ears = 4;
//			Char.skinType = 2;
//			Char.faceType = 40;
//			Char.strength = 15;
//			Char.mentality = 15;
//			Char.libido = 17;
//			Char.sensitivity = 17;
//			Char.tallness = -3;
//			new SexSelect();
			
		} else if (e.getActionCommand().equals("Lizan")) {
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
