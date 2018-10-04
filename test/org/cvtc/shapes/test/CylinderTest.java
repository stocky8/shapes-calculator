package org.cvtc.shapes.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Renderer;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.junit.Test;

public class CylinderTest {
	
	ShapeFactory shapeFactory = new ShapeFactory(new MessageBoxSub());

	@Test
	public void testSurfaceArea() {
		Renderer cylinder = shapeFactory.make(ShapeType.Cylinder);
		assertEquals(471.2389, ((Cylinder) cylinder).surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		Renderer cylinder = shapeFactory.make(ShapeType.Cylinder);
		assertEquals(785.3982, ((Cylinder) cylinder).volume(), 0.0002);
	}

	@Test
	public void testCylinder() {
		Renderer cylinder = shapeFactory.make(ShapeType.Cylinder);
		assertEquals(785.3982, ((Cylinder) cylinder).volume(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		Renderer cylinder = shapeFactory.make(ShapeType.Cylinder);
		assertEquals(5, ((Cylinder) cylinder).getRadius(), 0.0002);
	}

	@Test
	public void testGetHeight() {
		Renderer cylinder = shapeFactory.make(ShapeType.Cylinder);
		assertEquals(10, ((Cylinder) cylinder).getHeight(), 0.0002);
	}

}
