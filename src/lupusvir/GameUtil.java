package lupusvir;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import lupusvir.menus.TitleScreen;

public class GameUtil {
	
	/** 
	* Method which clears screen
	*/
	public static void clearScreen() {
		
		TitleScreen.frame.getContentPane().removeAll();
		TitleScreen.frame.revalidate();
		TitleScreen.frame.repaint();
	}
	
	/** 
	* Method which refreshes screen
	*/
	public static void refreshScreen() {
		
		TitleScreen.frame.revalidate();
		TitleScreen.frame.repaint();
	}
	
	//Allows events to check and see if a particular item is in the bag. Put this with Bag function.
	public static boolean checkItem(int ID) {
//		for (int i = 0; i < Char.bagArray.length; i++) {
////			System.out.println(i);
//			if(Char.bagArray[i] == ID) {
//				return true;
//			}
//		}
		return false;
	}
	
	/** 
	* This method creates GridBagConstraints. It takes six variables and returns the GridBagConstraint object. 
	* The arguments are as follows: (weightx, weighty, gridx, gridy, gridwidth, gridheight)
	*/
	public static GridBagConstraints setConstraints(double inWeightx, double inWeighty, int inGridx, int inGridy, int inGridWidth, int inGridHeight) { //method which makes button constraints
			GridBagConstraints constraints = new GridBagConstraints();
			
			constraints.weightx = inWeightx;
			constraints.weighty = inWeighty;
			constraints.gridx = inGridx;
			constraints.gridy = inGridy;
			constraints.gridwidth = inGridWidth;
			constraints.gridheight = inGridHeight;
			return constraints;
	}
	
	/** 
	* Method that creates a JButton. It takes two inputs: (name, listener)
	* First argument is the name of the button while the second argument is the button listener
	*/
	public static JButton createButton(String name, ActionListener listener) { //method which makes buttons
		JButton button = new JButton(name);
		button.addActionListener(listener);
		return button;
	}
	
	/** 
	* Method that generates JLabels taking the actual text for it as input
	*/
	public static JLabel setLabel(String inText) {
		JLabel text = new JLabel(inText);
		return text;
	}
	
	public static JScrollPane setScroll(JTextPane textPane) {
		JScrollPane scroll = new JScrollPane (textPane);
		Dimension dimension = new Dimension();
		dimension.setSize(500, 500);
		scroll.setMinimumSize(dimension);
		return scroll;
		}
	
	public static String makeDiv(String inText) {
		inText = "<div></div><div>" + inText + "</div>";
		return inText;
	}
	
	public static JTextPane setTextBody(String inText) {
		JTextPane textPane = new JTextPane();
		textPane.setContentType("text/html");
		textPane.setText(inText);
		textPane.setEditable(false);
		return textPane;
		}
	
	public static GridBagConstraints setConstraintsAltB(double inWeightx, double inWeighty, int inGridx, int inGridy, int inGridWidth, int inGridHeight, int inIPadx, int inIPady) {
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.weightx = inWeightx;
		constraints.weighty = inWeighty;
		constraints.gridx = inGridx;
		constraints.gridy = inGridy;
		constraints.gridwidth = inGridWidth;
		constraints.gridheight = inGridHeight;
		constraints.ipadx = inIPadx;
		constraints.ipady = inIPady;
		return constraints;
	}

}
