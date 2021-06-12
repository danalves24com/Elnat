package elnat.velo.human_interface.configurations;

import javax.swing.JFrame;

// TODO: Auto-generated Javadoc
/**
 * The Class WindowConfiguration.
 */
public class WindowConfiguration {

	/** The title. */
	private String title = "Elnat";
	
	/** The onclose operation. */
	private int xDimension = 200, yDimension = 200, oncloseOperation = JFrame.EXIT_ON_CLOSE;
	
	/**
	 * Instantiates a new window configuration.
	 *
	 * @param xDimension the x dimension
	 * @param yDimension the y dimension
	 */
	public WindowConfiguration(int xDimension, int yDimension) {
		super();
		this.xDimension = xDimension;
		this.yDimension = yDimension;
	}
	
	/**
	 * Instantiates a new window configuration.
	 *
	 * @param title the title
	 * @param xDimension the x dimension
	 * @param yDimension the y dimension
	 */
	public WindowConfiguration(String title, int xDimension, int yDimension) {
		super();
		this.title = title;
		this.xDimension = xDimension;
		this.yDimension = yDimension;
	}
	
	/**
	 * Instantiates a new window configuration.
	 *
	 * @param title the title
	 * @param xDimension the x dimension
	 * @param yDimension the y dimension
	 * @param oncloseOperation the onclose operation
	 */
	public WindowConfiguration(String title, int xDimension, int yDimension, int oncloseOperation) {
		super();
		this.title = title;
		this.xDimension = xDimension;
		this.yDimension = yDimension;
		this.oncloseOperation = oncloseOperation;
	}
	
	/**
	 * Instantiates a new window configuration.
	 */
	public WindowConfiguration() {
		super();
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}	
	
	/**
	 * Gets the x dimension.
	 *
	 * @return the x dimension
	 */
	public int getxDimension() {
		return xDimension;
	}
	
	/**
	 * Sets the x dimension.
	 *
	 * @param xDimension the new x dimension
	 */
	public void setxDimension(int xDimension) {
		this.xDimension = xDimension;
	}
	
	/**
	 * Gets the y dimension.
	 *
	 * @return the y dimension
	 */
	public int getyDimension() {
		return yDimension;
	}
	
	/**
	 * Sets the y dimension.
	 *
	 * @param yDimension the new y dimension
	 */
	public void setyDimension(int yDimension) {
		this.yDimension = yDimension;
	}
	
	/**
	 * Gets the onclose operation.
	 *
	 * @return the onclose operation
	 */
	public int getOncloseOperation() {
		return oncloseOperation;
	}
	
	/**
	 * Sets the onclose operation.
	 *
	 * @param oncloseOperation the new onclose operation
	 */
	public void setOncloseOperation(int oncloseOperation) {
		this.oncloseOperation = oncloseOperation;
	}
	
	
}
