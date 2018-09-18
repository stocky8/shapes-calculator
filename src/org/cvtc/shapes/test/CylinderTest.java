package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea() {
		assertEquals(125.6637, new Cylinder(2, 8).surfaceArea(), 0.0002);
		assertEquals(376.991, new Cylinder(6, 4).surfaceArea(), 0.0002);
		assertEquals(678.584, new Cylinder(9, 3).surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		assertEquals(100.531, new Cylinder(2, 8).volume(), 0.0002);
		assertEquals(763.407, new Cylinder(9, 3).volume(), 0.0002);
		assertEquals(75.3982, new Cylinder(2, 6).volume(), 0.0002);
	}

	@Test
	public void testCylinder() {
		assertEquals(452.3893, new Cylinder(6, 4).volume(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		assertEquals(6, new Cylinder(6, 4).getRadius(), 0.0002);
	}

	@Test
	public void testGetHeight() {
		assertEquals(4, new Cylinder(6, 4).getHeight(), 0.0002);
	}

}
