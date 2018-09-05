package org.cvtc.shapes;

/**
 * @author hstockdill
 *
 */
public abstract class Shape {
	
	// We are declaring these abstract methods here because we will be using them in
	// each class for the individual shapes.
	
	public abstract float surfaceArea();
	public abstract float volume();
	public abstract void render();
}
