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
	
	
}
