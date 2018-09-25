package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {
	
	MessageBoxSub msgbox = new MessageBoxSub();

	@Test
	public void testSurfaceArea() {
		assertEquals(1256.6370, new Sphere(msgbox, 10).surfaceArea(), 0.0002);
		
		assertEquals(113.0973, new Sphere(msgbox, 3).surfaceArea(), 0.0002);
		
		assertEquals(452.3893, new Sphere(msgbox, 6).surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		assertEquals(4188.7902, new Sphere(msgbox, 10).volume(), 0.0002);
		
		assertEquals(113.0973, new Sphere(msgbox, 3).volume(), 0.0002);
		
		assertEquals(904.7786, new Sphere(msgbox, 6).volume(), 0.0002);
	}

	@Test
	public void testSphere() {
		assertEquals(4188.7902, new Sphere(msgbox, 10).volume(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		assertEquals(10, new Sphere(msgbox, 10).getRadius(), 0.0002);
	}

}
