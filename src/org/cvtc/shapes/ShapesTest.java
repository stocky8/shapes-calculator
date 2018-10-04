package org.cvtc.shapes;

/**
 * @author hstockdill
 *
 */
public class ShapesTest {
	
	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory(new MessageBox());

		Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
		Renderer cylinder = shapeFactory.make(ShapeType.Cylinder);
		Renderer sphere = shapeFactory.make(ShapeType.Sphere);
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
	}

}