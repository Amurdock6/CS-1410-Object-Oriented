package phones;

/**
 * Initializes three values
 * related to the voltage of 
 * RotaryPhone & DeskPhone.
 * 
 * Return a random value – specified
 * in line 13 of class <code>DeskPhone: 
 * this.level = Voltage.values()[new Random()
 * .nextInt(Voltage.values().length)];</code>
 * 
 * @author Alex Murdock
 *
 */
public enum Voltage {
	V110, 
	V220, 
	DUAL
}