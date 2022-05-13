package lupusvir.character;

public class Inventory {

	private int[] bagArray = new int[27];
	private int [] bagStackArray = new int[27];
	
	public int[] getBagArray() {
		return bagArray;
	}
	
	public void setBagArray(int[] bagArray) {
		this.bagArray = bagArray;
	}

	public int[] getBagStackArray() {
		return bagStackArray;
	}

	public void setBagStackArray(int[] bagStackArray) {
		this.bagStackArray = bagStackArray;
	}
	
	
}
