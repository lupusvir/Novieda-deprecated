package lupusvir;

import lupusvir.menus.CharCreator;

public class Description {

	public String multipleBoobs() {
		String tempStr = "";
		int randNum = (int) (Math.random()* (8 - 1 + 1) + 1);
		
		if (CharCreator.appear.getBoobTotal() == 1 && CharCreator.appear.getBoobRows() == 1) { 
			if (randNum == 1) { tempStr = "uniboob"; }
			else if (randNum == 2) { tempStr = "cyclop-boob"; }
			else if (randNum == 2) { tempStr = "mono-boob"; }
			else { tempStr = "singular boob"; }
		} else if (CharCreator.appear.getBoobTotal() > 2 && CharCreator.appear.getBoobRows() == 1) {
				if (CharCreator.appear.getBoobTotal() == 3) { tempStr = "triad"; }
				else if (CharCreator.appear.getBoobTotal() == 4) { tempStr = "quad"; }
				else if (CharCreator.appear.getBoobTotal() == 5) { tempStr = "quintuple"; }
				else if (CharCreator.appear.getBoobTotal() == 6) { tempStr = "sextet"; }
				else { tempStr = "numerous"; }
		} else if (CharCreator.appear.getBoobTotal() > 2 && CharCreator.appear.getBoobRows() > 1) {
			if (CharCreator.appear.getBoobTotal() == 4 && CharCreator.appear.getBoobRows() == 2) {
				if (randNum == 1) { tempStr = "quad"; }
				else if (randNum == 2) { tempStr = "twin-rows"; }
				else if (randNum == 3) { tempStr = "twin-set"; }
				else if (randNum == 4) { tempStr = "pairs"; }
				else if (randNum == 5) { tempStr = "double-rows"; }
				else if (randNum == 6) { tempStr = "double-sets"; }
				else if (randNum == 7) { tempStr = "duplicate-rows"; }
				else if (randNum == 8) { tempStr = "duplicate-sets"; }
			} else if (CharCreator.appear.getBoobTotal() == 6 && CharCreator.appear.getBoobRows() == 3) {
				if (randNum == 1) { tempStr = "sextet"; }
				else if (randNum == 2) { tempStr = "triple-rows"; }
				else if (randNum == 3) { tempStr = "triple-set"; }
				else { tempStr = "triple-pairs"; }
			} else if (CharCreator.appear.getBoobTotal() == 8 && CharCreator.appear.getBoobRows() == 4) {
				if (randNum == 1) { tempStr = "octo"; }
				else if (randNum == 2) { tempStr = "quad-rows"; }
				else if (randNum == 3) { tempStr = "quad-set"; }
				else { tempStr = "quad-pairs"; }
			} else if (CharCreator.appear.getBoobTotal() == 10 && CharCreator.appear.getBoobRows() == 5) {
				if (randNum == 1) { tempStr = "deca"; }
				else if (randNum == 2) { tempStr = "quintuple-rows"; }
				else if (randNum == 3) { tempStr = "quintuple-set"; }
				else { tempStr = "quintuple-pairs"; }
			} else { tempStr = "mulititude"; }
		}  
		return tempStr;
	}
	
	public String multipleCocks() {
		String tempStr = "";
		int randNum = (int) (Math.random()* (8 - 1 + 1) + 1);
		
		if (CharCreator.appear.getCockTotal() == 2) { 
			if (randNum == 1) { tempStr = "pair"; }
			else if (randNum == 2) { tempStr = "twin"; }
			else { tempStr = "duplicate"; }
		} else if (CharCreator.appear.getCockTotal() == 3) {
			if (randNum == 1) { tempStr = "triad"; }
			else if (randNum == 2) { tempStr = "triple"; }
			else { tempStr = "tri"; }
		} else if (CharCreator.appear.getCockTotal() == 4) {
			if (randNum == 1) { tempStr = "quad"; }
			else if (randNum == 2) { tempStr = "quadruple"; }
			else { tempStr = "tetra"; }
		} else if (CharCreator.appear.getCockTotal() == 5) {
			if (randNum == 1) { tempStr = "quintuple"; }
			else { tempStr = "penta"; }
		} else if (CharCreator.appear.getCockTotal() == 6) {
			if (randNum == 1) { tempStr = "sextet"; }
			else { tempStr = "hexa"; }
		} else if (CharCreator.appear.getCockTotal() == 7) { tempStr = "hepta"; }
		else if (CharCreator.appear.getCockTotal() == 8) {
			if (randNum == 1) { tempStr = "octo"; }
			else { tempStr = "octa"; }
		} else if (CharCreator.appear.getCockTotal() == 9) { tempStr = "nona"; }
		else if (CharCreator.appear.getCockTotal() == 10) { tempStr = "deca"; }
		else { tempStr = "multitude"; }
		
		return tempStr;
	}
	
	public String multipleBalls() {
		String tempStr = "";
		int randNum = (int) (Math.random()* (8 - 1 + 1) + 1);
		
		if (CharCreator.appear.getBalls() == 1) { 
			if (randNum == 1) { tempStr = "uniball"; }
			else if (randNum == 2) { tempStr = "cyclop-ball"; }
			else if (randNum == 2) { tempStr = "mono-ball"; }
			else { tempStr = "singular ball"; }
		} else if (CharCreator.appear.getBalls() > 2) {
			if (CharCreator.appear.getBalls() == 4) {
				if (randNum == 1) { tempStr = "quad"; }
				else if (randNum == 2) { tempStr = "twin-set"; }
				else if (randNum == 3) { tempStr = "pairs"; }
				else if (randNum == 4) { tempStr = "double-sets"; }
				else if (randNum == 5) { tempStr = "duplicate-sets"; }
			} else if (CharCreator.appear.getBalls() == 5) { tempStr = "quintuple"; } 
			else if (CharCreator.appear.getBalls() == 6) {
				if (randNum == 1) { tempStr = "sextet"; }
				else if (randNum == 2) { tempStr = "triple-set"; }
				else { tempStr = "triple-pairs"; }
			} else if (CharCreator.appear.getBalls() == 7) { tempStr = "septet"; } 
			else if (CharCreator.appear.getBalls() == 8) {
				if (randNum == 1) { tempStr = "octo"; }
				else if (randNum == 3) { tempStr = "quad-set"; }
				else { tempStr = "quad-pairs"; }
			} else if (CharCreator.appear.getBalls() == 9) { tempStr = "nona"; } 
			else if (CharCreator.appear.getBalls() == 10) {
				if (randNum == 1) { tempStr = "deca"; }
				else if (randNum == 3) { tempStr = "quintuple-set"; }
				else { tempStr = "quintuple-pairs"; }
			} else { tempStr = "mulititude"; }
		}
		
		return tempStr;
	}
	
	public String multipleVags() {
		String tempStr = "";
		int randNum = (int) (Math.random()* (8 - 1 + 1) + 1);
		
		if (CharCreator.appear.getVagTotal() == 2) { 
			if (randNum == 1) { tempStr = "pair"; }
			else if (randNum == 2) { tempStr = "twin"; }
			else if (randNum == 3) { tempStr = "twin-wombs"; }
			else if (randNum == 4) { tempStr = "duplicate-wombs"; }
			else { tempStr = "duplicate"; }
		} else if (CharCreator.appear.getVagTotal() == 3) {
			if (randNum == 1) { tempStr = "triad"; }
			else if (randNum == 2) { tempStr = "triple"; }
			else if (randNum == 3) { tempStr = "triple-wombs"; }
			else { tempStr = "tri"; }
		} else if (CharCreator.appear.getVagTotal() == 4) {
			if (randNum == 1) { tempStr = "quad"; }
			else if (randNum == 3) { tempStr = "quad-wombs"; }
			else if (randNum == 4) { tempStr = "quadruple"; }
			else { tempStr = "tetra"; }
		} else if (CharCreator.appear.getVagTotal() == 5) {
			if (randNum == 1) { tempStr = "quintuple"; }
			if (randNum == 2) { tempStr = "quintuple-wombs"; }
			else { tempStr = "penta"; }
		} else if (CharCreator.appear.getVagTotal() == 6) {
			if (randNum == 1) { tempStr = "sextet"; }
			else if (randNum == 2) { tempStr = "hexa-wombs"; }
			else { tempStr = "hexa"; }
		} else if (CharCreator.appear.getVagTotal() == 7) {
			if (randNum == 1) { tempStr = "hepta-wombs"; }
			else { tempStr = "hepta"; } 
			} else if (CharCreator.appear.getVagTotal() == 8) {
			if (randNum == 1) { tempStr = "octo"; }
			else if (randNum == 2) { tempStr = "octo-wombs"; }
			else if (randNum == 3) { tempStr = "octa-wombs"; }
			else { tempStr = "octa"; }
		} else if (CharCreator.appear.getVagTotal() == 9) {
			if (randNum == 1) { tempStr = "nona-wombs"; }
			else { tempStr = "nona"; } 
			} else if (CharCreator.appear.getVagTotal() == 10) {
				if (randNum == 1) { tempStr = "deca-wombs"; }
				else { tempStr = "deca"; } 
				} else {
			if (randNum == 1) { tempStr = "multitude of wombs"; }
			else { tempStr = "multitude"; } 
			}
		
		return tempStr;
	}
	
	public String singular() {
		String tempStr = "";
		
		if (CharCreator.appear.getCockTotal() > 1 && CharCreator.appear.getVagTotal() > 1) { tempStr = "one of your"; }
		else if (CharCreator.appear.getCockTotal() == 1 && CharCreator.appear.getVagTotal() == 1) { tempStr = "your"; }
		else if (CharCreator.appear.getVagTotal() > 1) { tempStr = "one of your"; }
		else if (CharCreator.appear.getVagTotal() == 1) { tempStr = "your"; }
		
		return tempStr;
	}
	
	public String bodyDesc() {
		String tempStr = "";
		
		return tempStr;
	}
}
