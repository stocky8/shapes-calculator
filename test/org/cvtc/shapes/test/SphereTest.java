package org.cvtc.shapes.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Renderer;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {
	
	ShapeFactory shapeFactory = new ShapeFactory(new MessageBoxSub());

	@Test
	public void testSurfaceArea() {
		Renderer sphere = shapeFactory.make(ShapeType.Sphere);
		assertEquals(314.15927, ((Sphere) sphere).surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		Renderer sphere = shapeFactory.make(ShapeType.Sphere);
		assertEquals(523.59875, ((Sphere) sphere).volume(), 0.0002);
	}

	@Test
	public void testSphere() {
		Renderer sphere = shapeFactory.make(ShapeType.Sphere);
		assertEquals(523.59875, ((Sphere) sphere).volume(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		Renderer sphere = shapeFactory.make(ShapeType.Sphere);
		assertEquals(5, ((Sphere) sphere).getRadius(), 0.0002);
	}

}
