/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.dawnsci.analysis.dataset.utils;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.linear.EigenDecomposition;

public class MissingFromMath2 {
	public static Complex pow(Complex c, double x) {
		return c.pow(new Complex(x, 0));
	}
	
	public static Complex divide(Complex c, double x) {
		return c.divide(new Complex(x, 0));
	}
	
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
