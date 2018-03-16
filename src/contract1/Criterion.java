package contract1;


public final class Criterion {

	private final int id;
	
	/**
	 * Constructor
	 * @param i is an integer, the ID
	 */
	public Criterion(int i) {
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