package lupusvir;

public class TextFormat {

	public static String makeItalic(String inText) {
		inText = "<p style=\"font-style: italic;\">" + inText + "</p>";
		return inText;
	}
	
	public static String makeDialogue(String inDialogue) {
		String outDialogue = makeDiv(makeItalic(inDialogue));
		return outDialogue;
	}

	public static String makeDiv(String inText) {
		inText = "<div></div><div>" + inText + "</div>";
		return inText;
	}
}
