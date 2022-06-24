package phones;

/**
 * Extension of class Dimension,
 * with the addition of the String 
 * <code>model</code>.
 * @author Alex Murdock
 */
public class Phone extends Dimensions {
	
	protected String model;
	
	/**
	 * Returns the values with the following format:
	 * {model} ({height} x {width} x {depth})
	 * 
	 * @param height of type double
	 * @param width of type double
	 * @param depth of type double
	 * @param model of type double
	 */
	public Phone(double height, double width, double depth, String model) {
		super(height,width,depth);
		this.model = model;
	}
	
	public static void call(String number) {
		System.out.println("Calling " + number + "by selecting the number");
	}

}