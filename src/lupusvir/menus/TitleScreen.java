package lupusvir.menus;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import lupusvir.GameUtil;
import lupusvir.Main;

public class TitleScreen implements ActionListener {
	
	public static JFrame frame = new JFrame("Novieda v" + Main.versionNumber); //setting the name of the JFrame

	/** 
	* Constructor which generates the title screen
	*/
	public TitleScreen() {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); //getting the size of the screen
		
		JPanel panel = new JPanel(new GridBagLayout()); //formatting the panel to use the Grid Bag Layout from Java
		
		int width = (int) screenSize.getWidth(); //utilizing the toolkit and setting the width of the game
		int height = (int) screenSize.getHeight(); //same as above but does it for height
		
		/*The following lines of code set how wide and tall each component is. Additionally, it sets their location
		 which is relative to a defined coordinate space within the panel. */
		
		panel.add(GameUtil.createButton("New Game", this), GameUtil.setConstraints(0.1, 0, -1, 0, 1, 0)); //adds and creates new game button
		panel.add(GameUtil.createButton("Load Game", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 0)); //adds and creates load game button
		panel.add(GameUtil.createButton("Dev Options", this), GameUtil.setConstraints(0.1, 0, 1, -1, 0, 0)); //adds and creates dev options button
		
		panel.add(GameUtil.setLabel("<html><div><center>Novieda v" + Main.versionNumber + "</div>" 
		+ "<div><center>by lupusvir</center></div>" 
		+ "<div><center>https://www.furaffinity.net/user/capta/</div></center>"), GameUtil.setConstraints(0, 0, 0, 0, 2, 0)); //adds the label to the panel
		
		frame.add(panel); //adds the panel to the frame
		frame.setSize(width,height); //sets the size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the program end when the close button is clicked
		frame.setVisible(true); //makes the whole frame visible
		
		}

	/** 
	* This method is the action listeners for the title screen buttons
	*/
	@Override
	public void actionPerformed(ActionEvent e) { //method which makes each button actually work
		
		if (e.getActionCommand().equals("New Game")) { //leads to next menu
			new CharCreator();
			
		} else if (e.getActionCommand().equals("Load Game")) {
			//TODO implement the load game
			
		} else if (e.getActionCommand().equals("Dev Options")) { //leads to the dev menu where tools are planned to be implemented
			new DevMenu();
		}
		
	}

}
