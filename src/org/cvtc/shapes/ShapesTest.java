package org.cvtc.shapes;

/**
 * @author hstockdill
 *
 */
public class ShapesTest {
	
	// Initialize the objects for each object, setting a value for each input that's required.
	static Sphere Sphere = new Sphere(new MessageBox(), (float) 6);
	static Cylinder Cylinder = new Cylinder(new MessageBox(), (float) 8, (float) 12);
	static Cuboid Cuboid = new Cuboid(new MessageBox(), (float) 4, (float) 6, (float) 8);

	public static void main(String[] args) {
		// Run the render() method in each object's class which outputs the volume, and surface area
		// of each.
		Sphere.render();
		Cylinder.render();
		Cuboid.render();
	}

}