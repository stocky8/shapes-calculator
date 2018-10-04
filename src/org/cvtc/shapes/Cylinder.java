package org.cvtc.shapes;

/**
 * @author hstockdill
 *
 */
public class Cylinder extends Shape implements Renderer{
	
	// Private float values are declared so only this class can change, modify, or view them. We can
	// do it this way because there are getters, and setters to access it from outside of the
	// class if necessary.
	private float radius;
	private float height;

	// When used in the ShapesTest (or any other class) this constructs this class, setting the
	// radius and height.
	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		setRadius(radius);
		setHeight(height);
	}

	// Allows any class (public) to GET the radius of the cylinder object. Same goes for the other
	// respective getters such as getHeight()
	public float getRadius() {
		return radius;
	}

	// Allows any class (public) to SET the radius of the cylinder object. Same goes for the other
	// respective setters such as setHeight()
	private void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}

	@Override
	public float surfaceArea() {
		return (float) (2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2));
		// Completes equation and returns the surface area of the Cylinder where called.
	}

	@Override
	public float volume() {
		return (float) (Math.PI * Math.pow(radius, 2) * height);
		// Completes equation and returns volume of the Cylinder wherever called.
	}

	@Override
	public int render() {
		// When this is called it will output the values calculated and display them to the user
		// in a simple message box. Before calculating it has to see if the input is valid
		// if the input is not valid it will not calculate and just display the error message.
		// Values are also not calculated until volume() or surfaceArea() are called.
		
		if (isValid(radius, height)) { // If input valid do this...
			
			String message = "Raidus: " + radius +
								", Height: " + height +
								", Surface Area: " + surfaceArea() +
								", Volume: " + volume();
			
			return messageBox.show(message, "Cylinder");
			
		} else { // If the input is invalid (radius or height) do this...
			
			String message = "Cylinder input is invalid, please input positive float values greater than zero.";
			
			return messageBox.show(message, "Cylinder");
			
		}
		
	}
	
	// Simple checking to see if the input is a valid float above the value of 0. If so return 'true'
	// marking it as valid input.
	private boolean isValid(float radius, float height) {
		if (radius > 0 & height > 0) {
			return true;
		}
		
		return false;
	}

}
