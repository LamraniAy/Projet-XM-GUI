package contract1;
public final class Alternative {

	private final int id;
	
	/**
	 * Constructor
	 * @param i is an integer, the ID
	 */
	public Alternative(int i) {
		this.id = i;
	}
	
	/**
	 * Accessor function
	 */
	public int getId() {
		// Return id
		return id;
	}
}