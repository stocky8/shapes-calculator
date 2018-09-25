package org.cvtc.shapes;

/**
 * @author hstockdill
 *
 */
public class Sphere extends Shape implements Renderer {
	
	// Private float value declared so only this class can change, modify, or view it. We can
	// do it this way because there are getters, and setters to access it from outside of the
	// class.
	private float radius;
	
	//Construct the Sphere with the value it is assigned when using it elsewhere
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		setRadius(radius);
	}
	
	// Return radius when it is called either from this class or any other class (public declaration)
	public float getRadius() {
		return this.radius;
	}

	// Set the radius if it needs to be updated outside of initialization
	private void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public float surfaceArea() {
		return (float) (4 * Math.PI * Math.pow(radius, 2));
		// Completes equation and returns the surface area of the sphere where called.
	}

	@Override
	public float volume() {
		return (float) ((4 / 3.0) * Math.PI * Math.pow(radius, 3));
		// Completes equation and returns volume of the sphere wherever called.
		// Must have 4 / 3.0 because casting to float otherwise it counts as 1
		// instead of 1.3333
	}

	@Override
	public void render() { 
		// When this is called it will output the values calculated and display them to the user
		// in a simple message box. Before calculating it has to see if the input is valid
		// if the input is not valid it will not calculate and just display the error message.
		// Values are also not calculated until volume() or surfaceArea() are called.
		
		if (isValid(radius)) { // If the inputs are valid do this...
			
			messageBox.show("Raidus: " + radius +
							", Surface Area: " + surfaceArea() +
							", Volume: " + volume(),
							"Sphere");
			
		} else { // If the inputs are not valid do this...
			
			messageBox.show("Sphere input is invalid, please input a positive float value greater than zero.",
							"Sphere");
			
		}
		
	}
	
	
	// Simple checking to see if the input is a valid float above the value of 0. If so return 'true'
	// marking it as valid input.
	private boolean isValid(float radius) {
		if (radius > 0) {
			return true;
		}
		
		return false;
	}

}
