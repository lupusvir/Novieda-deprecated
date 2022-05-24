package lupusvir.menus;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import lupusvir.GameUtil;
import lupusvir.Quest;

public class MainPage implements ActionListener {

	Quest quest = new Quest();
	
	int menuLevel = 0;
	int textNum = 0;
	
	public MainPage () {
		GameUtil.clearScreen();
		introPrompt();
	}
	
	public void introPrompt() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		if(textNum == 0) {
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody(GameUtil.makeItalic("So, you've chosen.") 
					+ "A feminine voice echoed around " + CharCreator.appear.getName() + "'s head."), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
		} else if (textNum == 1) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody(GameUtil.makeItalic("Are you pleased with what you've chosen? ")
					+ "<div>A pause.<div>" + GameUtil.makeItalic("Changing can be difficult you know. "
							+ "That is, unless you don't want it. ") + "A scoff."
					+ GameUtil.makeItalic("You must excuse my doubt. Never have I met someone without a desire for change.")
					+ GameUtil.makeItalic("Change, after all, is something fundamental to our universe. No matter who or what you are.")), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
		} else if (textNum == 2) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody(GameUtil.makeItalic("The better question to be asked is, "
					+ "What will you do in the face of change? Will you fight it, or embrace it?"
					+ GameUtil.makeItalic("Fate depends on it you know.")
					+ GameUtil.makeItalic("After all, life's always been about choices. Choices made in shades of grey."))), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
		} else if (textNum == 3) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody(GameUtil.makeItalic("So what will you choose?")), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
		} else if (textNum == 4) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody(GameUtil.makeItalic("Ugh, it's that dream again.")
					+ "Your own thoughts echo."
					+ GameUtil.makeItalic("It keeps occuring, but what on Earth does it mean?")
					+ "You heave a sigh."
					+ GameUtil.makeItalic("A question for later.")
					+ "For now, you wake up, on an island called Novieda."), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
			
		} else if (textNum == 5 && CharCreator.discoveries.getFoundPlainsKingdom() == true) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody("You find yourself in the plains kingdom also known as "
					+ "Ventosa Campestribus. Also known as the home of the Equidae Sapien peoples."
					+ "They're a hardy people with large genitals and a strict code of honor."
					+ "Nearby are the barracks, town center, market, square and much more."
					+ "But you find yourself still questioning your dream. Perhaps a visit to the local mage?"), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
			quest.giveMainQuest();
			leftBar();
			
		} else if (textNum == 5 && CharCreator.discoveries.getFoundForestKingdom() == true) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody("You find yourself in the forest kingdom also known as "
					+ "Lupus Silva. Also known as the home of the Canidae Sapien peoples."
					+ "They're lean and fit with larger-than-normal genitals. They frequently consider themselves and other as one large family."
					+ "There's a number of things nearby, ranging from the barracks, to the town center, market, square and much more."
					+ "But you find yourself still questioning your dream. Perhaps a visit to the local mage?"), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
			quest.giveMainQuest();
			leftBar();
			
		}  else if (textNum == 5 && CharCreator.discoveries.getFoundJungleKingdom() == true) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody("You find yourself in the jungle kingdom also known as "
					+ "Jungle of Cats. Home of the Felidae Sapien peoples."
					+ "They're flexible and small. Their kingdom a matriarchy."
					+ "There's a number of things nearby, ranging from the barracks, to the town center, market, square and much more."
					+ "But you find yourself still questioning your dream. Perhaps a visit to the local mage?"), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
			quest.giveMainQuest();
			leftBar();
			
		} else if (textNum == 5 && CharCreator.discoveries.getFoundDesertKingdom() == true) {
			GameUtil.clearScreen();
			panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody("You find yourself in the desert kingdom also known as "
					+ "The Dry Basin. Home of the Reptilia Sapien peoples."
					+ "They're a diverse group of peopels. Their kingdom governed by a board."
					+ "There's a number of things nearby, ranging from the barracks, to the town center, market, square and much more."
					+ "But you find yourself still questioning your dream. Perhaps a visit to the local mage?"), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
			quest.giveMainQuest();
			leftBar();
		}
	
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void leftBar() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		GameUtil.clearScreen();
		
		panel.add(GameUtil.setLabel("<html><center>Health: " + CharCreator.stats.getCurrentHP() + "/" + CharCreator.stats.getTotalHP() + "</center>"), GameUtil.setConstraints(0, 0, 0, 0, 1, 1));
		panel.add(GameUtil.setLabel("<html><center>Energy: " + CharCreator.stats.getCurrentEP() + "/" + CharCreator.stats.getTotalEP() + "</center>"), GameUtil.setConstraints(0, 0, 0, 1, 1, 1));
		panel.add(GameUtil.setLabel("<html><center>Lust: " + CharCreator.stats.getCurrentLust() + "/" + CharCreator.stats.getTotalLust() + "</center>"), GameUtil.setConstraints(0, 0, 0, 2, 1, 1));
		panel.add(GameUtil.createButton("Character", this), GameUtil.setConstraints(0, 0, 0, 3, 1, 1));
		panel.add(GameUtil.setLabel("<html><center>--- Current Kingdom ---</center>" + "<div><center>" + displayCurrentKingdom() + "</div></center>"), GameUtil.setConstraints(0, 0, 0, 4, 1, 1));
		
		panel.add(GameUtil.setLabel(""), GameUtil.setConstraints(0, 1, 0, 5, 1, 1)); //vertical spacer between labels and buttons
		
		panel.add(GameUtil.createButton("Save", this), GameUtil.setConstraints(0, 0, 0, 6, 1, 1));
		panel.add(GameUtil.createButton("Load", this), GameUtil.setConstraints(0, 0, 0, 7, 1, 1));
		panel.add(GameUtil.createButton("New Game", this), GameUtil.setConstraints(0, 0, 0, 8, 1, 1));
		
		centerButtons(panel);
	}
	
	public void centerButtons(JPanel panel) {
		panel.add(GameUtil.setLabel(""), GameUtil.setConstraints(1, 0, 1, 6, 1, 6)); //horizontal spacer between labels and buttons
		
		panel.add(GameUtil.createButton("Bag", this), GameUtil.setConstraints(0, 0, 2, 3, 1, 1));
		panel.add(GameUtil.createButton("Stash", this), GameUtil.setConstraints(0, 0, 3, 3, 1, 1));
		panel.add(GameUtil.createButton("Shops", this), GameUtil.setConstraints(0, 0, 4, 3, 1, 1));
		panel.add(GameUtil.createButton("Day-Care", this), GameUtil.setConstraints(0, 0, 5, 3, 1, 1));
		panel.add(GameUtil.createButton("Masturbate", this), GameUtil.setConstraints(0, 0, 2, 4, 1, 1));
		panel.add(GameUtil.createButton("Sleep", this), GameUtil.setConstraints(0, 0, 3, 4, 1, 1));
		panel.add(GameUtil.createButton("Wait", this), GameUtil.setConstraints(0, 0, 4, 4, 1, 1));
		panel.add(GameUtil.createButton("Prostitute", this), GameUtil.setConstraints(0, 0, 5, 4, 1, 1));
		panel.add(GameUtil.createButton("Explore", this), GameUtil.setConstraints(0, 0, 6, 4, 1, 1));
		
		panel.add(GameUtil.setLabel(""), GameUtil.setConstraints(1, 0, 7, 6, 1, 6)); //horizontal spacer between buttons and nothing
		largeCentralText(panel);
	}
	
	public void largeCentralText(JPanel panel) {
		panel.add(GameUtil.setLabel(""), GameUtil.setConstraints(0, 0, 2, 7, 9, 1)); //vertical spacer between buttons and large text body
		
		//for when PC has a genital too large and for events and anything else
		panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody("A large piece of text will be here eventually."), 500, 500), GameUtil.setConstraints(0, 0, 1, 7, 10, 4));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void rightSideButtons() {
		
	}
	
	public void displayCharPage() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuLevel = 1;
		
		GameUtil.clearScreen();
		panel.add(GameUtil.createButton("Modifiers", this), GameUtil.setConstraints(0, 0.1, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Status", this), GameUtil.setConstraints(0, 0.1, 1, 0, 1, 1));
		panel.add(GameUtil.createButton("Levels", this), GameUtil.setConstraints(0, 0.1, 2, 0, 1, 1));
		panel.add(GameUtil.setScrollAltA(GameUtil.setTextBody("<center>Health: " + CharCreator.stats.getCurrentHP() + "/" + CharCreator.stats.getTotalHP() + "</center>"
					+ GameUtil.makeDiv("<center>Energy: " + CharCreator.stats.getCurrentEP() + "/" + CharCreator.stats.getTotalEP() + "</center>") 
					+ GameUtil.makeDiv("<center>Lust: " + CharCreator.stats.getCurrentLust() + "/" + CharCreator.stats.getTotalLust() + "</center>")
					+ GameUtil.makeDiv(GameUtil.makeDiv("<center>--- Current Kingdom ---</center>") 
							+ GameUtil.makeDiv("<center>" + displayCurrentKingdom() + "</center>"))
					+ GameUtil.makeDiv(GameUtil.makeDiv("<center>Strength: " + CharCreator.stats.getStr() + "</center>" 
							+ "<center>Dexterity: " + CharCreator.stats.getDex() + "</center>" 
							+ "<center>Constitution: " + CharCreator.stats.getCon() + "</center>" 
							+ "<center>Intelligence: " + CharCreator.stats.getIntel() + "</center>" 
							+ "<center>Wisdom: " + CharCreator.stats.getWis() + "</center>" 
							+ "<center>Charisma: " + CharCreator.stats.getCha() + "</center>")
					+ GameUtil.makeDiv("<center>Mentality: " + CharCreator.stats.getMent() + "</center>" 
							+ "<center>Libido: " + CharCreator.stats.getLib() + "</center>" 
							+ "<center>Sensitivity: " + CharCreator.stats.getSen() + "</center>"))), 500, 500), GameUtil.setConstraints(0, 0.1, 1, 1, 1, 5));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0.1, 1, 6, 1, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public String displayCurrentKingdom() {
		String tempStr = "Zone Error";
		if (CharCreator.time.getCurrentZone() == 0) {
			tempStr = "Ventosa Campestribus";
			return tempStr;
		} else if (CharCreator.time.getCurrentZone() == 1) {
			tempStr = "Lupus Silva";
			return tempStr;
		} else if (CharCreator.time.getCurrentZone() == 2) {
			tempStr = "Jungle of Cats";
			return tempStr;
		} else if (CharCreator.time.getCurrentZone() == 3) {
			tempStr = "Dry Basin";
			return tempStr;
		} else { return tempStr; }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Next") && textNum < 5) {
			if(textNum > 0) { introPrompt(); } 
		} else if (e.getActionCommand().equals("Character")) { displayCharPage(); }
		else if (e.getActionCommand().equals("Back")) {
			if (menuLevel == 2) {
				menuLevel -= 1;
				leftBar();
			}
		}
		
	}
}
