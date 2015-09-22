/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.dataset;

/**
 * <p>Interface to provide iteration through whole dataset</p>
 * <p>Instantiate an iterator and use it in a while loop:
 * <pre>
 *  IDataset data = ...;
 *  IDatasetIterator iter = new PositionIterator(data.getShape());
 *  int[] pos = iter.getPos();
 *  double total = 0.0;
 *  
 *  while (iter.hasNext()) {
 *      total += data.getDouble(pos);
 *  }
 * </pre>
 */
public interface IDatasetIterator {

	/**
	 * @return true if there is another iteration and updates position indices
	 */
	boolean hasNext();

	/**
	 * @return position indices (nb this is reference not a copy so avoid changing and can be null)
	 */
	int[] getPos();

	/**
	 * Reset iterator
	 */
	void reset();

	/**
	 * @return shape of iterator (can be null, if not known or applicable)
	 */
	int[] getShape();
}
