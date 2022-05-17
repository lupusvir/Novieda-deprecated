package lupusvir;

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
	
	//Returns random number between 1 and 100 <-- probably not in Java
	public static int percent() {
	    return (int) (Math.floor(Math.random()*(1+100-1))+1);
	}
	
	public static String decGet(double number, int places){
	    String tempStr = "" + number + "";
	    String tempStr2 = "";
	    int tempInt = 0;
	    tempInt = tempStr.indexOf(".",0);
	    if(tempInt > 0){ tempStr2 = tempStr.substring(0,(tempInt+places+1)); }
	    else { tempStr2 = tempStr; }
	    return tempStr2;
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
	
	public static JTextPane setText(String inText) {
		JTextPane text = new JTextPane();
		text.setText(inText);
		return text;
		}
	
	public static JScrollPane setScroll(JTextPane textPane) {
		JScrollPane scroll = new JScrollPane (textPane);
		
		return scroll;
		}
	
	public static String makeDiv(String inText) {
		inText = "<div></div><div>" + inText + "</div>";
		return inText;
	}

}
