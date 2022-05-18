package lupusvir.menus;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import lupusvir.GameUtil;

public class DevMenu implements ActionListener {

	public DevMenu() {
		GameUtil.clearScreen();
		displayOptions();
	}
	
	public void displayOptions() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		panel.add(GameUtil.createButton("Macro Perk Menu", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Class Menu", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));
		panel.add(GameUtil.createButton("Character Name Menu", this), GameUtil.setConstraints(0.1, 0, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Main Page", this), GameUtil.setConstraints(0.1, 0, 3, 0, 1, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Macro Perk Menu")) { new CharCreator().macroSPerk(); } 
		else if (e.getActionCommand().equals("Class Menu")) { new CharCreator().classMenu(); }
		else if (e.getActionCommand().equals("Character Name Menu")) { new CharCreator().charNameMenu(); }
		else if (e.getActionCommand().equals("Main Page")) { new MainPage(); }
	}
}
