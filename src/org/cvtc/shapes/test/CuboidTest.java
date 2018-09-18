package org.cvtc.shapes.test;

import static org.junit.jupiter.api.Assertions.*;

import org.cvtc.shapes.Cuboid;
import org.junit.jupiter.api.Test;

class CuboidTest {

	@Test
	void testSurfaceArea() {
		Cuboid cube1 = new Cuboid(3, 3, 3);
		assertEquals(54, cube1.surfaceArea(), 0.0002);
		
		assertEquals(294, new Cuboid(7, 7, 7).surfaceArea(), 0.0002);
		
		assertEquals(112, new Cuboid(4, 2, 8).surfaceArea(), 0.0002);
	}

	@Test
	void testVolume() {
		assertEquals(160, new Cuboid(4, 8, 5).volume(), 0.0002);
		
		assertEquals(64, new Cuboid(4, 4, 4).volume(), 0.0002);
		
		assertEquals(108, new Cuboid(6, 9, 2).volume(), 0.0002);
	}

	@Test
	void testCuboid() {
		assertEquals(27, new Cuboid(3, 3, 3).volume(), 0.0002);
	}

	@Test
	void testGetWidth() {
		Cuboid cube1 = new Cuboid(1, 2, 2);
		assertEquals(1, cube1.getWidth(), 0.0002);
	}
	
	@Test 
	void testGetHeight() {
		assertEquals(3, new Cuboid(16, 3, 8).getHeight(), 0.0002);
	}

	@Test
	void testGetDepth() {
		assertEquals(8, new Cuboid(16, 3, 8).getDepth(), 0.0002);
	}

}
