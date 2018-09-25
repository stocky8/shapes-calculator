package org.cvtc.shapes;

/**
 * @author hstockdill
 *
 */
public class Cuboid extends Shape implements Renderer{
	
	// Private float values are declared so only this class can change, modify, or view them. We can
	// do it this way because there are getters, and setters to access it from outside of the
	// class if necessary.
	private float width;
	private float height;
	private float depth;
	
	// When this class is used set the width, height, and depth as soon as possible.
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}

	// Allows any class (public) to GET the width of the Cuboid object. Same goes for the other
	// respective getters such as getHeight(), and getDepth()
	public float getWidth() {
		return width;
	}

	// Allows any class (public) to SET the width of the Cuboid object. Same goes for the other
	// respective setters such as setHeight(), and setDepth()
	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	@Override
	public float surfaceArea() {
		return (float) (2 * ((width * depth) + (width * height) + (height * depth)));
		// Completes equation and returns the surface area of the Cuboid where called.
	}

	@Override
	public float volume() {
		return (float) (width * height * depth);
		// Completes equation and returns volume of the Cuboid wherever called.
	}

	@Override
	public void render() {
		// When this is called it will output the values calculated and display them to the user
		// in a simple message box. Before calculating it has to see if the input is valid
		// if the input is not valid it will not calculate and just display the error message.
		// Values are also not calculated until volume() or surfaceArea() are called.
		
		if (isValid(width, height, depth)) { // If the Width, Height, AND Depth are all valid do this...
			
			messageBox.show("Width: " + width +
								", Height: " + height +
								", Depth: " + depth +
								", Surface Area: " + surfaceArea() +
								", Volume: " + volume(),
								"Cuboid");
			
			
		} else { // If one or more of the inputs are invalid do this...
			
			messageBox.show("Cuboid input is invalid, please input positive float values greater than zero.",
							"Cuboid");
			
		}
		
	}
	
	// Simple checking to see if the input is a valid float above the value of 0. If so return 'true'
	// marking it as valid input.
	private boolean isValid(float radius, float height, float depth) {
		if (radius > 0 & height > 0 & depth > 0) {
			return true;
		}
		
		return false;
	}


}
