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
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Macro Perk Menu")) {
			new CharCreator().macroSPerk();
		}
		
	}
}
