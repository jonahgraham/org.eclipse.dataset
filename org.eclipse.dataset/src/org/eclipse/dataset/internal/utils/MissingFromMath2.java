/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.dataset.internal.utils;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.linear.EigenDecomposition;

/**
 * A few methods are missing in math vs math3, these are implemented in MissingFromMath2. At the point that math3 is
 * upgraded, change the dependencies, re-write the methods within this class and inline them.
 */
public class MissingFromMath2 {
	/**
	 * Simulate Complex Complex.pow(double) in Math3
	 */
	public static Complex pow(Complex c, double x) {
		return c.pow(new Complex(x, 0));
	}

	/**
	 * Simulate boolean EigenDecomposition.hasComplexEigenvalues() in Math3
	 */
	public static boolean hasComplexEigenvalues(EigenDecomposition e) {
		double[] imagEigenvalues = e.getImagEigenvalues();
		for (int i = 0; i < imagEigenvalues.length; i++) {
			if (imagEigenvalues[i] > 1e-12) {
				return true;
			}
		}
		return false;
	}
}
