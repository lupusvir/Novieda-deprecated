package lupusvir.menus;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import lupusvir.GameUtil;
import lupusvir.character.Appearance;
import lupusvir.character.Discoveries;
import lupusvir.character.Modifiers;
import lupusvir.character.SexPerks;
import lupusvir.character.Stats;
import lupusvir.character.Statuses;
import lupusvir.character.Time;

public class CharCreator implements ActionListener {
	
	public static Appearance appear = new Appearance();
	public static Discoveries discoveries = new Discoveries();
	public static Modifiers modifiers = new Modifiers();
	public static Stats stats = new Stats();
	public static Time time = new Time();
	public static Statuses statuses = new Statuses();
	public static SexPerks sexPerks = new SexPerks();
	
	int menuNumber = 0;
	int sPerkPoints = 11;
	
	public CharCreator() {
		GameUtil.clearScreen();
		raceSelect();
	}
	
	public void raceSelect() {
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 1;
		
		/*I have a funny feeling there's a way better way of doing this.*/
		
		panel.add(GameUtil.createButton("Equidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Canidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 0, 2, 1, 1));
		panel.add(GameUtil.createButton("Hominidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Felidae Sapien", this), GameUtil.setConstraints(0.1, 0.1, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Reptilia Sapien", this), GameUtil.setConstraints(0.1, 0.1, 2, 2, 1, 1));
		
		panel.add(GameUtil.setLabel("<html><div><center>--- Choose a race ---</center></div>"
				+ "<div></div><div><center>Equidae Sapien (only horses atm)</center></div>" 
				+ "<div><center>A race of all kinds of horse people, zebra people and so on. They range from anthros to taurs."
				+ "They are known to be strong and sturdy with larger genitals. They also tend to be tall.</center></div>"
				+ "<div></div><div><center>Canidae Sapien (only wolves atm)</center></div>" 
				+ "<div><center>A race of dog people. They range from wolf-anthros to any kind of dog anthro and taur. "
				+ "They are known to be sturdy and quick. Their heights tend to be just above average and their genitals larger than normal.</center></div>"
				+ "<div></div><div><center>Hominidae Sapien (only humans atm)</center></div>" 
				+ "<div><center>Range from humans to all kinds of monkeys and apes. They range from very tall to short."
				+ " They're known to be a jack-of-all trades.</center></div>"
				+ "<div></div><div><center>Felidae Sapien (only housecats atm)</center></div>" 
				+ "<div><center>A race of cat people. They range from tiger-anthros to house-cat-anthros. There are also taurs. They are known to be quick and dexterous."
				+ "The Felidae also tend to be on the shorter side.</center></div>"
				+ "<div></div><div><center>Reptilia Sapien (only lizards atm)</center></div>" 
				+ "<div><center>A rac of reptile people. They range from gecko anthros to iguana-anthros. This gives them a wide variety."
				+ "They are known to be smart and wise.</center></div>"), GameUtil.setConstraints(0.1, 0.1, 0, 3, 3, 0));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 3, 4, 3, 3));
		
		TitleScreen.frame.add(panel); //adds the panel to the frame
		GameUtil.refreshScreen();
	}
	
	public void sexSelect() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 2;
		
		panel.add(GameUtil.createButton("Option A", this), GameUtil.setConstraints(0.1, 0.1, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Option B", this), GameUtil.setConstraints(0.1, 0.1, 1, 0, 1, 1));
		panel.add(GameUtil.createButton("Option C", this), GameUtil.setConstraints(0.1, 0.1, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Option D", this), GameUtil.setConstraints(0.1, 0.1, 3, 0, 1, 1));
		panel.add(GameUtil.createButton("Option E", this), GameUtil.setConstraints(0.1, 0.1, 4, 0, 1, 1));
		panel.add(GameUtil.createButton("Option F", this), GameUtil.setConstraints(0.1, 0.1, 5, 0, 1, 1));
		panel.add(GameUtil.createButton("Option G", this), GameUtil.setConstraints(0.1, 0.1, 6, 0, 1, 1));
		panel.add(GameUtil.createButton("Option H", this), GameUtil.setConstraints(0.1, 0.1, 7, 0, 1, 1));
		panel.add(GameUtil.setLabel("<html><div><center>--- Select Sexual Equipment ---</center></div>"
				+ GameUtil.makeDiv("Option A - cock and balls")
				+ GameUtil.makeDiv("Option B - cock")
				+ GameUtil.makeDiv("Option C - vagina")
				+ GameUtil.makeDiv("Option D -  boobs and vagina")
				+ GameUtil.makeDiv("Option E -  boobs, cock, and balls")
				+ GameUtil.makeDiv("Option F -  boobs and cock")
				+ GameUtil.makeDiv("Option G -  boobs, cock, balls, and vagina")
				+ GameUtil.makeDiv("Option H -  boobs, cock, and vagina")), GameUtil.setConstraints(0, 0.1, 3, 1, 2, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 8, 2, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void promptInternalBalls() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 3;
		
		panel.add(GameUtil.createButton("Yes Internal Balls", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("No Internal Balls", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));
		panel.add(GameUtil.setLabel("<html><div><center>Would you like internal balls?</center></div>"), GameUtil.setConstraints(0.1, 0, 0, 1, 2, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 1, 2, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void promptUdder() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 4;
		
		panel.add(GameUtil.createButton("Yes Udder", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("No Udder", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));
		panel.add(GameUtil.setLabel("<html><div><center>Would you like an udder?</center></div>"), GameUtil.setConstraints(0.1, 0, 0, 1, 2, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 1, 2, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
		
	}
	
	public void udderSelect() {
		GameUtil.clearScreen();
		appear.setUdder(true);
		menuNumber = 5;
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		panel.add(GameUtil.createButton("Cow", this), GameUtil.setConstraints(0.1, 0, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Horse", this), GameUtil.setConstraints(0.1, 0, 1, 0, 1, 1));		
		panel.add(GameUtil.setLabel("<html><div><center>What type?</center></div>"
					+ "<div><center>Cow - pink udder with 4 teats</center></div>"
					+ "<div><center>Horse - black udder with 2 teats</center></div>"), GameUtil.setConstraints(0.1, 0, 0, 1, 2, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 1, 2, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void sexPerks() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 6;
		
		panel.add(GameUtil.setLabel("Current amount of sex perk points: " + sPerkPoints), GameUtil.setConstraints(0.1, 0.1, 1, 0, 2, 1));
		panel.add(GameUtil.createButton("Macro", this), GameUtil.setConstraints(0.1, 0.1, 0, 1, 1, 1));
		panel.add(GameUtil.createButton("Hyper", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Large", this), GameUtil.setConstraints(0.1, 0.1, 2, 1, 1, 1));
		panel.add(GameUtil.createButton("Vore", this), GameUtil.setConstraints(0.1, 0.1, 3, 1, 1, 1));
		panel.add(GameUtil.setLabel("<html><div><center>--- Select Sex Perks ---</center></div>"
				+ GameUtil.makeDiv("Macro - perks for making the character macro-sized")
				+ GameUtil.makeDiv("Hyper - perks for making the character hyper-sized")
				+ GameUtil.makeDiv("Large - perks for making the character large-sized")
				+ GameUtil.makeDiv("Vore - perks relating to vore")), GameUtil.setConstraints(0, 0.1, 1, 2, 2, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 5, 3, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void macroSPerk() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 7;
		
		panel.add(GameUtil.setLabel("Current amount of sex perk points: " + sPerkPoints), GameUtil.setConstraints(0.1, 0.1, 2, 0, 2, 1));
		panel.add(GameUtil.createButton("Macro Fertility", this), GameUtil.setConstraints(0.1, 0.1, 0, 1, 1, 1));
		panel.add(GameUtil.createButton("Macro Virility", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Macro Size", this), GameUtil.setConstraints(0.1, 0.1, 2, 1, 1, 1));
		panel.add(GameUtil.createButton("Macro Cock", this), GameUtil.setConstraints(0.1, 0.1, 3, 1, 1, 1));
		panel.add(GameUtil.createButton("Macro Balls", this), GameUtil.setConstraints(0.1, 0.1, 4, 1, 1, 1));
		panel.add(GameUtil.createButton("Macro Boobs", this), GameUtil.setConstraints(0.1, 0.1, 0, 2, 1, 1));
		panel.add(GameUtil.createButton("Macro Vagina", this), GameUtil.setConstraints(0.1, 0.1, 1, 2, 1, 1));
		panel.add(GameUtil.createButton("Macro Udder", this), GameUtil.setConstraints(0.1, 0.1, 2, 2, 1, 1));
		panel.add(GameUtil.createButton("Macro Butt", this), GameUtil.setConstraints(0.1, 0.1, 3, 2, 1, 1));
		panel.add(GameUtil.createButton("Macro Thighs", this), GameUtil.setConstraints(0.1, 0.1, 4, 2, 1, 1));
		panel.add(GameUtil.createButton("Macro Hips", this), GameUtil.setConstraints(0.1, 0.1, 5, 2, 1, 1));
		panel.add(GameUtil.setScroll(GameUtil.setTextBody("<div><center>--- Select Macro Perks ---</center></div>"
						+ GameUtil.makeDiv("Macro Fertility - Whenever PC is pregnant, their pregnancy belly will range from the size of a city to cosmic."
						+ " This means they will have thousands to trillions, or even more children at once."
						+ " Their lactatcion will also be so extreme that worlds and other cosmic bodies could be flooded.")
						+ GameUtil.makeDiv("Macro Virility - If PC has balls, their semen will have a drastic effects on impregnating women."
						+ " These effects range from making any women impregnanted with the PC semen will have thousands or more children at once."
						+ " It will also make the PC's cum production at such ridiclous levels they could flood planets and other cosmic bodies with their semen")
						+ GameUtil.makeDiv("Macro Size - Will make the PC ginormous. Their height will range from sky-scraper-sized to drastically larger."
						+ " They also get the special ability to assume a specific height, disguising their true height, but not their mass.")
						+ GameUtil.makeDiv("Macro Cock -  PC will have a cock so drastically large it can be the size of sky-scrapers or much larger.")
						+ GameUtil.makeDiv("Macro Balls - PC will have balls so large, they can range from the size of seas to oceans, to much, much larger.")
						+ GameUtil.makeDiv("Macro Boobs - PC will have boobs so large they range from ocean-sized to cosmic-sized.")
						+ GameUtil.makeDiv("Macro Vagina - PC will have a vagina so large, and so deep, a skyscraper or some cosmic body could fit inside.")
						+ GameUtil.makeDiv("Macro Udder - PC will have a massive udder ranging from ocean-sized to comsmic-sized.")
						+ GameUtil.makeDiv("Macro Butt - PC will have a butt so large, it can eclipse moons or celestial bodies much larger.")
						+ GameUtil.makeDiv("Macro Thighs - PC will have thighs so thick, they eclipse celestial bodies.")
						+ GameUtil.makeDiv("Macro Hips - PC will have hips so wide, they span an entire planet or more."))), GameUtil.setConstraints(0, 0.1, 1, 4, 4, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 7, 5, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void hyperSPerk() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 7;
		
		panel.add(GameUtil.setLabel("Current amount of sex perk points: " + sPerkPoints), GameUtil.setConstraints(0.1, 0.1, 2, 0, 2, 1));
		panel.add(GameUtil.createButton("Hyper Fertility", this), GameUtil.setConstraints(0.1, 0.1, 0, 1, 1, 1));
		panel.add(GameUtil.createButton("Hyper Virility", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Hyper Size", this), GameUtil.setConstraints(0.1, 0.1, 2, 1, 1, 1));
		panel.add(GameUtil.createButton("Hyper Cock", this), GameUtil.setConstraints(0.1, 0.1, 3, 1, 1, 1));
		panel.add(GameUtil.createButton("Hyper Balls", this), GameUtil.setConstraints(0.1, 0.1, 4, 1, 1, 1));
		panel.add(GameUtil.createButton("Hyper Boobs", this), GameUtil.setConstraints(0.1, 0.1, 0, 2, 1, 1));
		panel.add(GameUtil.createButton("Hyper Vagina", this), GameUtil.setConstraints(0.1, 0.1, 1, 2, 1, 1));
		panel.add(GameUtil.createButton("Hyper Udder", this), GameUtil.setConstraints(0.1, 0.1, 2, 2, 1, 1));
		panel.add(GameUtil.createButton("Hyper Butt", this), GameUtil.setConstraints(0.1, 0.1, 3, 2, 1, 1));
		panel.add(GameUtil.createButton("Hyper Thighs", this), GameUtil.setConstraints(0.1, 0.1, 4, 2, 1, 1));
		panel.add(GameUtil.createButton("Hyper Hips", this), GameUtil.setConstraints(0.1, 0.1, 5, 2, 1, 1));
		panel.add(GameUtil.setScroll(GameUtil.setTextBody("<div><center>--- Select Hyper Perks ---</center></div>"
						+ GameUtil.makeDiv("Hyper Fertility - Whenever PC is pregnant, their pregnancy belly will range from the size of a large pool to a city."
						+ " Their lactatcion will also be so extreme that olympic-sized pools could be filled quickly.")
						+ GameUtil.makeDiv("Hyper Virility - If PC has balls, their semen will have a drastic effects on impregnating women."
						+ " These effects range from making impregnanted women have thousands to hundred thousand children at once."
						+ " It will also make the PC's cum production at such ridiclous levels they could flood olympic-sized pools with their semen")
						+ GameUtil.makeDiv("Hyper Size - Will make the PC ginormous. Their height will range from giraffe-sized to Eiffel-tower-sized."
						+ " They also get the special ability to assume a specific height, disguising their true height, but not their mass.")
						+ GameUtil.makeDiv("Hyper Cock -  PC will have a cock the size of a blue-whale to sub-skycraper-sized")
						+ GameUtil.makeDiv("Hyper Balls - PC will have balls so large, they can range from the size of pools, to a small body of water.")
						+ GameUtil.makeDiv("Hyper Boobs - PC will have boobs so large they range from pool-sized to small bodies of water.")
						+ GameUtil.makeDiv("Hyper Vagina - PC will have a vagina so large, and so deep, a pool could fit in size. Or something sub sky-scraper-sized")
						+ GameUtil.makeDiv("Hyper Udder - PC will have a massive udder ranging from pool-sized to sub-skyscraper-sized.")
						+ GameUtil.makeDiv("Hyper Butt - PC will have a butt so large, it can fill public pools to sub sky-scraper.")
						+ GameUtil.makeDiv("Hyper Thighs - PC will have thighs so thick, they fill pools to sub sky-scraper.")
						+ GameUtil.makeDiv("Hyper Hips - PC will have hips so wide, they span large fields but are smaller than a sky-scraper."))), GameUtil.setConstraints(0, 0.1, 1, 4, 4, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 7, 5, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void largeSPerk() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 7;
		
		panel.add(GameUtil.setLabel("Current amount of sex perk points: " + sPerkPoints), GameUtil.setConstraints(0.1, 0.1, 2, 0, 2, 1));
		panel.add(GameUtil.createButton("Large Fertility", this), GameUtil.setConstraints(0.1, 0.1, 0, 1, 1, 1));
		panel.add(GameUtil.createButton("Large Virility", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Large Size", this), GameUtil.setConstraints(0.1, 0.1, 2, 1, 1, 1));
		panel.add(GameUtil.createButton("Large Cock", this), GameUtil.setConstraints(0.1, 0.1, 3, 1, 1, 1));
		panel.add(GameUtil.createButton("Large Balls", this), GameUtil.setConstraints(0.1, 0.1, 4, 1, 1, 1));
		panel.add(GameUtil.createButton("Large Boobs", this), GameUtil.setConstraints(0.1, 0.1, 0, 2, 1, 1));
		panel.add(GameUtil.createButton("Large Vagina", this), GameUtil.setConstraints(0.1, 0.1, 1, 2, 1, 1));
		panel.add(GameUtil.createButton("Large Udder", this), GameUtil.setConstraints(0.1, 0.1, 2, 2, 1, 1));
		panel.add(GameUtil.createButton("Large Butt", this), GameUtil.setConstraints(0.1, 0.1, 3, 2, 1, 1));
		panel.add(GameUtil.createButton("Large Thighs", this), GameUtil.setConstraints(0.1, 0.1, 4, 2, 1, 1));
		panel.add(GameUtil.createButton("Large Hips", this), GameUtil.setConstraints(0.1, 0.1, 5, 2, 1, 1));
		panel.add(GameUtil.setScroll(GameUtil.setTextBody("<div><center>--- Select Large Perks ---</center></div>"
						+ GameUtil.makeDiv("Large Fertility - Whenever PC is pregnant, their pregnancy belly will range from the size of a bed to the size of a pool."
						+ " Their lactatcion will also be so extreme that whole bathtubs will be overflowing with milk.")
						+ GameUtil.makeDiv("Large Virility - If PC has balls, their semen will have a drastic effects on impregnating women."
						+ " These effects range from making impregnanted women have up to a thousand children at once."
						+ " It will also make the PC's cum production at such ridiclous levels they could flood bathtubs with their semen")
						+ GameUtil.makeDiv("Large Size - Will make the PC large. Their height will range from just above average to giraffe-sized.")
						+ GameUtil.makeDiv("Large Cock -  PC will have a cock double to quadruple their height.")
						+ GameUtil.makeDiv("Large Balls - PC will have balls so large, they can range from beach-ball-sized to bathtub-sized.")
						+ GameUtil.makeDiv("Large Boobs - PC will have boobs so large they range from large to bathtub-sized.")
						+ GameUtil.makeDiv("Large Vagina - PC will have a vagina large enough a bathtub could fit inside.")
						+ GameUtil.makeDiv("Large Udder - PC will have a massive udder ranging from bathtub-sized to under pool-sized.")
						+ GameUtil.makeDiv("Large Butt - PC will have a butt large enough to take up a whole bathtub.")
						+ GameUtil.makeDiv("Large Thighs - PC will have thighs large enough to take up a whole bathtub")
						+ GameUtil.makeDiv("Large Hips - PC will have hips wide enough to take up a whole bathtub"))), GameUtil.setConstraints(0, 0.1, 1, 4, 4, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 7, 5, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void voreSPerk() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 7;
		
		panel.add(GameUtil.setLabel("Current amount of sex perk points: " + sPerkPoints), GameUtil.setConstraints(0.1, 0.1, 1, 0, 2, 1));
		panel.add(GameUtil.createButton("Vore Level", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.createButton("Fatal Vore Efficency", this), GameUtil.setConstraints(0.1, 0.1, 2, 1, 1, 1));
		panel.add(GameUtil.setScroll(GameUtil.setTextBody("<div><center>--- Select Vore Perks ---</center></div>"
						+ GameUtil.makeDiv("Vore Level - the higher level the stronger people PC can vore. Also the more people PC can fit inside themselves after Voring."
								+ " It's important to note, when voring the PC has the option of making it fatal."
								+ "It costs 5 sex perk points.")
						+ GameUtil.makeDiv("Fatal Vore Efficency - If PC chooses to make their voring fatal this determines how much mass and size is gained by the PC."
								+ "It costs 6 sex perk points.")
						)), GameUtil.setConstraints(0, 0.1, 1, 2, 4, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 0, 3, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void classMenu() {
		GameUtil.clearScreen();
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		menuNumber = 7;
		
		panel.add(GameUtil.createButton("Fighter", this), GameUtil.setConstraints(0.1, 0.1, 0, 0, 1, 1));
		panel.add(GameUtil.createButton("Ranger", this), GameUtil.setConstraints(0.1, 0.1, 1, 0, 1, 1));
		panel.add(GameUtil.createButton("Sorcerer", this), GameUtil.setConstraints(0.1, 0.1, 2, 0, 1, 1));
		panel.add(GameUtil.createButton("Rogue", this), GameUtil.setConstraints(0.1, 0.1, 0, 1, 1, 1));
		panel.add(GameUtil.createButton("Monk", this), GameUtil.setConstraints(0.1, 0.1, 1, 1, 1, 1));
		panel.add(GameUtil.setScroll(GameUtil.setTextBody("<div><center>--- Select Class ---</center></div>"
				+ GameUtil.makeDiv("Fighter - PC specializes in fighting with melee weapons. These range from swords, to greatswords, warhammers, and so on. "
						+ "They can be one-handed or two-handed.")
				+ GameUtil.makeDiv("Ranger - PC specializes in fighting with ranged weapons. Thesr range from bows to crossbows and so on. "
						+ "They can be two-handed greatbows to two-handed greatcrossbows.")
				+ GameUtil.makeDiv("Sorcerer - PC specilaizes in fighting with magic. They can throw fireballs, move rock, and so on.")
				+ GameUtil.makeDiv("Rogue - PC specializes with fighting with finesse weapons. These range from daggers to rapiers.")
				+ GameUtil.makeDiv("Monk - PC specializes fighting unarmed to any martial weapon. "
						+ "Such as Jiang swords, Dao broadswords, Bo-staffs, and so on."))), GameUtil.setConstraints(0, 0.1, 0, 2, 3, 1));
		panel.add(GameUtil.createButton("Back", this), GameUtil.setConstraints(0, 0, 3, 3, 3, 1));
		
		TitleScreen.frame.add(panel);
		GameUtil.refreshScreen();
	}
	
	public void roleMenu() {
		
	}
	
	public void giveBoobs() {
		appear.setBoobTotal(2);
		appear.setBoobSize((int) (Math.random() * (4 - 1 + 1) + 1));
		appear.setNippleTotal(2);
		appear.setNippleLength(4);
		appear.setNippleThickness(3);
		appear.setNippleAerolaSize(8);
	}
	
	public void giveUdder() {
		if(appear.getBoobTotal() > 1) {
			appear.setUdderSize(appear.getBoobSize() * 2);
			appear.setTeatLength(appear.getNippleLength() * 2);
			appear.setTeatThickness(appear.getNippleThickness() * 2);
		} else {
			appear.setBoobSize(1);
			appear.setNippleLength(4);
			appear.setNippleThickness(3);
			appear.setUdderSize(appear.getBoobSize() * 2);
			appear.setTeatLength(appear.getNippleLength() * 2);
			appear.setTeatThickness(appear.getNippleThickness() * 2);
		}
	}
	
	public void giveCock() {
		appear.setCockTotal(1);
		appear.setCockSize(23);
	}
	
	public void giveBalls() {
		appear.setBallSize(10);
		appear.setBalls(2);
	}
	
	public void giveVagina() {
		appear.setVagTotal(1);
		appear.setVagSize(23);
		appear.setVulvaSize(23);
		appear.setClitTotal(1);
		appear.setClitSize(13);
	}
	
	public void goBack() {
		menuNumber -= 1;
		GameUtil.clearScreen();
	}
	
	public void checkSexPerkAmount() {
		if(sPerkPoints == 0) {
			classMenu();
		} else if (sPerkPoints < 0) {
			System.out.println("There is a problem with the sex perk amount.");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Equidae Sapien")) { //race option
			double randHeight = Math.random() * (211 - 180 + 1) + 180;
			
			appear.setRace(1);
			discoveries.setFoundPlainsKingdom(true);
			time.setCurrentZone(0);
			modifiers.setCockSizeMod(2);
			modifiers.setCockNarrowMod(0.5);
			modifiers.setVagSizeMod(2);
			appear.setTailType(0);
			appear.setEarType(1);
			appear.setSkinType(1);
			appear.setFaceType(1);
			appear.setCockType(1);
			appear.setVagType(1);
			
			stats.setStr(15); //total stat points should not exceed 60
			stats.setCon(15);
			stats.setIntel(5);
			stats.setDex(5);
			
			stats.setLib(12); //total sex stat points should not exceed 30
			stats.setSen(12);
			stats.setMent(6);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Canidae Sapien")) { //race option
			double randHeight = Math.random() * (181 - 150 + 1) + 150;
			
			appear.setRace(2);
			discoveries.setFoundForestKingdom(true);
			time.setCurrentZone(1);
			appear.setKnot(true);
			appear.setTailType(1);
			appear.setEarType(2);
			appear.setSkinType(1);
			appear.setFaceType(2);
			appear.setCockType(2);
			appear.setVagType(2);
			
			stats.setCon(15);
			stats.setDex(15);
			stats.setWis(5);
			stats.setCha(5);
			
			stats.setMent(12);
			stats.setSen(12);
			stats.setLib(6);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Hominidae Sapien")) { //race option
			double randHeight = Math.random() * (211 - 140 + 1) + 140;
			double randPlace = Math.random() * (3 - 0 + 1);
			int randPlaceActual = (int) Math.floor(randPlace);
			
			appear.setRace(0);
			
			if (randPlace == 0) { time.setCurrentZone(randPlaceActual); }
			else if (randPlaceActual == 1) { time.setCurrentZone(randPlaceActual); }
			else if (randPlaceActual == 2) { time.setCurrentZone(randPlaceActual); }
			else if (randPlaceActual == 3) { time.setCurrentZone(randPlaceActual); }
			else { System.out.println("Random place out of range."); }
			
			if (time.getCurrentZone() == 0) { discoveries.setFoundPlainsKingdom(true); }
			else if (time.getCurrentZone() == 1) { discoveries.setFoundForestKingdom(true); }
			else if (time.getCurrentZone() == 2) { discoveries.setFoundJungleKingdom(true); }
			else if (time.getCurrentZone() == 3) { discoveries.setFoundDesertKingdom(true); }
			else { System.out.println("Error setting discovered towns."); }
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Felidae Sapien")) { //race option
			double randHeight = Math.random() * (151 - 120 + 1) + 120;
			
			appear.setRace(3);
			discoveries.setFoundJungleKingdom(true);
			time.setCurrentZone(2);
			appear.setTailType(2);
			appear.setEarType(3);
			appear.setSkinType(1);
			appear.setFaceType(3);
			
			stats.setDex(15);
			stats.setIntel(15);
			stats.setCon(5);
			stats.setStr(5);
			appear.setCockType(3);
			appear.setVagType(3);
			
			stats.setMent(8);
			stats.setSen(12);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
			
		} else if (e.getActionCommand().equals("Reptilia Sapien")) { //race option
			double randHeight = Math.random() * (171 - 150 + 1) + 150;
			
			appear.setRace(4);
			discoveries.setFoundDesertKingdom(true);
			time.setCurrentZone(3);
			appear.setTailType(3);
			appear.setEarType(4);
			appear.setSkinType(2);
			appear.setFaceType(4);
			appear.setCockType(4);
			appear.setVagType(4);
			
			stats.setIntel(15);
			stats.setWis(15);
			stats.setCha(5);
			stats.setStr(5);
			
			stats.setMent(12);
			stats.setLib(8);
			
			appear.setHeight((int) Math.floor(randHeight));
			
			sexSelect();
		
		} else if (e.getActionCommand().equals("Option A")) { //cock and balls option	
			giveCock();
			giveBalls();
			promptInternalBalls();
			
		} else if (e.getActionCommand().equals("Option B")) { //cock option
			giveCock();
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option C")) { //vagina option
			giveVagina();
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option D")) { //boobs and vagina option
			giveBoobs();
			giveVagina();
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option E")) { //boobs, cock, and balls option
			giveBoobs();
			giveCock();
			giveBalls();
			promptInternalBalls();
			
		} else if (e.getActionCommand().equals("Option F")) { //boobs and cock option
			giveBoobs();
			giveCock();
			promptUdder();
			
		} else if (e.getActionCommand().equals("Option G")) { //boobs, cock, balls, and vagina option
			giveBoobs();
			giveCock();
			giveBalls();
			giveVagina();
			promptInternalBalls();
			
		} else if (e.getActionCommand().equals("Option H")) { //boobs, cock, and vagina option
			giveBoobs();
			giveCock();
			giveVagina();
			promptUdder();
			
		} else if (e.getActionCommand().equals("Yes Internal Balls")) { //yes/no option
			giveBalls();
			promptUdder();
		} 
		
		else if (e.getActionCommand().equals("No Internal Balls")) { promptUdder(); } 
		else if (e.getActionCommand().equals("Yes Udder")) { udderSelect();	} 
		else if (e.getActionCommand().equals("No Udder")) { sexPerks(); }
		
		else if (e.getActionCommand().equals("Cow")) { 
			giveUdder();
			sexPerks();
			} 
		
		else if (e.getActionCommand().equals("Horse")) { //udder selection
			appear.setUdderType(1);
			giveUdder();
			sexPerks();
		} else if (e.getActionCommand().equals("Back")) {
			if (menuNumber == 1) {
				goBack();
				new TitleScreen();
			} else if (menuNumber == 2) {
				goBack();
				raceSelect();
			} else if (menuNumber == 3) {
				goBack();
				sexSelect();
			} else if (menuNumber == 4) {
				goBack();
				promptInternalBalls();
			} else if (menuNumber == 5) {
				goBack();
				promptUdder();
			} else if (menuNumber == 6) {
				goBack();
				udderSelect();
			} else if (menuNumber == 7) {
				goBack();
				sexPerks();
			}
			
		} 
		
		else if (e.getActionCommand().equals("Macro")) { macroSPerk(); } 
		else if (e.getActionCommand().equals("Hyper")) { hyperSPerk(); } 
		else if (e.getActionCommand().equals("Large")) { largeSPerk(); } 
		else if (e.getActionCommand().equals("Vore")) { voreSPerk(); }
		else if (e.getActionCommand().equals("Macro Fertility") || e.getActionCommand().equals("Macro Virility")|| e.getActionCommand().equals("Macro Size") 
				|| e.getActionCommand().equals("Macro Cock") || e.getActionCommand().equals("Macro Balls") || e.getActionCommand().equals("Macro Boobs")
				|| e.getActionCommand().equals("Macro Vagina") || e.getActionCommand().equals("Macro Udder") || e.getActionCommand().equals("Macro Butt")
				|| e.getActionCommand().equals("Macro Thighs") || e.getActionCommand().equals("Macro Hips")) {
			
			if(e.getActionCommand().equals("Macro Fertility") && sexPerks.getMacroFertilityLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setMacroFertilityLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Virility") && sexPerks.getMacroVirilityLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setMacroVirilityLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Size") && sexPerks.getMacroSizeLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setMacroSizeLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Cock") && sexPerks.getMacroCock() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroCock(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Balls") && sexPerks.getMacroBalls() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroBalls(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Boobs") && sexPerks.getMacroBoobs() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroBoobs(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Vagina") && sexPerks.getMacroVagina() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroVagina(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Udder") && sexPerks.getMacroUdder() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroUdder(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Butt") && sexPerks.getMacroButt() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroButt(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Thighs") && sexPerks.getMacroThighs() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroThighs(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Macro Hips") && sexPerks.getMacroHips() == false) {
				sPerkPoints -= 1;
				sexPerks.setMacroHips(true);
				checkSexPerkAmount();
			}
			
		}
		
		else if (e.getActionCommand().equals("Hyper Fertility") || e.getActionCommand().equals("Hyper Virility")|| e.getActionCommand().equals("Hyper Size") 
				|| e.getActionCommand().equals("Hyper Cock") || e.getActionCommand().equals("Hyper Balls") || e.getActionCommand().equals("Hyper Boobs")
				|| e.getActionCommand().equals("Hyper Vagina") || e.getActionCommand().equals("Hyper Udder") || e.getActionCommand().equals("Hyper Butt")
				|| e.getActionCommand().equals("Hyper Thighs") || e.getActionCommand().equals("Hyper Hips")) {
			
			if(e.getActionCommand().equals("Hyper Fertility") && sexPerks.getHyperFertilityLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setHyperFertilityLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Virility") && sexPerks.getHyperVirilityLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setHyperVirilityLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Size") && sexPerks.getHyperSizeLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setHyperSizeLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Cock") && sexPerks.getHyperCock() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperCock(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Balls") && sexPerks.getHyperBalls() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperBalls(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Boobs") && sexPerks.getHyperBoobs() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperBoobs(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Vagina") && sexPerks.getHyperVagina() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperVagina(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Udder") && sexPerks.getHyperUdder() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperUdder(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Butt") && sexPerks.getHyperButt() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperButt(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Thighs") && sexPerks.getHyperThighs() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperThighs(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Hyper Hips") && sexPerks.getHyperHips() == false) {
				sPerkPoints -= 1;
				sexPerks.setHyperHips(true);
				checkSexPerkAmount();
			}
			
		}
		
		else if (e.getActionCommand().equals("Large Fertility") || e.getActionCommand().equals("Large Virility")|| e.getActionCommand().equals("Large Size") 
				|| e.getActionCommand().equals("Large Cock") || e.getActionCommand().equals("Large Balls") || e.getActionCommand().equals("Large Boobs")
				|| e.getActionCommand().equals("Large Vagina") || e.getActionCommand().equals("Large Udder") || e.getActionCommand().equals("Large Butt")
				|| e.getActionCommand().equals("Large Thighs") || e.getActionCommand().equals("Large Hips")) {
			
			if(e.getActionCommand().equals("Large Fertility") && sexPerks.getLargeFertilityLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setLargeFertilityLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Virility") && sexPerks.getLargeVirilityLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setLargeVirilityLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Size") && sexPerks.getLargeSizeLevel() == 0) {
				sPerkPoints -= 1;
				sexPerks.setLargeSizeLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Cock") && sexPerks.getLargeCock() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeCock(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Balls") && sexPerks.getLargeBalls() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeBalls(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Boobs") && sexPerks.getLargeBoobs() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeBoobs(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Vagina") && sexPerks.getLargeVagina() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeVagina(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Udder") && sexPerks.getLargeUdder() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeUdder(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Butt") && sexPerks.getLargeButt() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeButt(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Thighs") && sexPerks.getLargeThighs() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeThighs(true);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Large Hips") && sexPerks.getLargeHips() == false) {
				sPerkPoints -= 1;
				sexPerks.setLargeHips(true);
				checkSexPerkAmount();
			}
		}
		
		else if(e.getActionCommand().equals("Vore Level") || e.getActionCommand().equals("Fatal Vore Efficency")) {
			if(e.getActionCommand().equals("Vore Level") && sexPerks.getVoreLevel() == 0) {
				sPerkPoints -= 5;
				sexPerks.setVoreLevel(1);
				checkSexPerkAmount();
			} else if (e.getActionCommand().equals("Fatal Vore Efficency") && sexPerks.getFatalVoreEfficiencyLevel() == 0) {
				sPerkPoints -= 6;
				sexPerks.setFatalVoreEfficiencyLevel(1);
				checkSexPerkAmount();
			}
		}
	}

}
