package org.htc;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	public void Tcl1() {
		System.out.println("Tcl1");

	}
	@Test
	
	public void Tcl2() {
		Assert.assertTrue(true);
		System.out.println("Tcl2");

	}
	@Test
	public void Tcl3() {
		System.out.println("Tcl3");

	}
	@Test
	public void Tcl4() {
		System.out.println("Tcl4");

	}
}
