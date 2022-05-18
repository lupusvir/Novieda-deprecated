package lupusvir.menus;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import lupusvir.GameUtil;

public class MainPage implements ActionListener {

	int textNum = 0;
	
	public MainPage () {
		GameUtil.clearScreen();
		CharCreator.appear.setName("Subject Delta");
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
					+ GameUtil.makeItalic("After all, life's always been about choices. Choices, made in shades of grey."))), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
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
					+ "There's a number of things nearby, rangin from the barracks, to the town center, market, square and much more."
					+ "But you find yourself still questioning your dream. Perhaps a visit to the local mage?"), 800, 800), GameUtil.setConstraints(0, 0.1, 0, 0, 4, 1));
			panel.add(GameUtil.createButton("Next", this), GameUtil.setConstraints(0, 0.1, 0, 1, 4, 1));
			textNum++;
		}
	
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Next") && textNum < 5) {
			if(textNum > 0) { introPrompt(); } 
		}
		
	}
}
