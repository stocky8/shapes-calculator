package org.cvtc.shapes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Renderer;
import org.cvtc.shapes.ShapeFactory;
import org.cvtc.shapes.ShapeType;
import org.cvtc.shapes.test.MessageBoxSub;
import org.junit.jupiter.api.Test;

class CuboidTest {
	
	ShapeFactory shapeFactory = new ShapeFactory(new MessageBoxSub());

	@Test
	void testSurfaceArea() {
		Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
		assertEquals(150, ((Cuboid) cuboid).surfaceArea(), 0.0002);
	}

	@Test
	void testVolume() {
		Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
		assertEquals(125, ((Cuboid) cuboid).volume(), 0.0002);
	}

	@Test
	void testCuboid() {
		Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
		assertEquals(125, ((Cuboid) cuboid).volume(), 0.0002);
	}

	@Test
	void testGetWidth() {
		Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
		assertEquals(5, ((Cuboid) cuboid).getWidth(), 0.0002);
	}
	
	@Test 
	void testGetHeight() {
		Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
		assertEquals(5, ((Cuboid) cuboid).getHeight(), 0.0002);
	}

	@Test
	void testGetDepth() {
		Renderer cuboid = shapeFactory.make(ShapeType.Cuboid);
		assertEquals(5, ((Cuboid) cuboid).getDepth(), 0.0002);
	}

}
