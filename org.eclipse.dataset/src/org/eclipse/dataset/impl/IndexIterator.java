/*-
 *******************************************************************************
 * Copyright (c) 2011, 2014 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Peter Chang - initial API and implementation and/or initial documentation
 *******************************************************************************/

package org.eclipse.dataset.impl;

import org.eclipse.dataset.IDatasetIterator;

/**
 * <p>Class to provide iteration through whole data array that backs a dataset</p>
 * <p>Instantiate an iterator and use it in a while loop:
 * <pre>
 *  DoubleDataset ds = (DoubleDataset) DatasetUtils.linSpace(0,10,0.25, Dataset.FLOAT64);
 *  IndexIterator iter = ds.getIterator();
 *  double[] data = ds.getData();
 *  
 *  while (iter.hasNext()) {
 *      data[iter.index] = 1.2;
 *  }
 * </pre>
 * 
 */
public abstract class IndexIterator implements IDatasetIterator {
	/**
	 * Index in array
	 */
	public int index;

	/**
	 * @return true if there is another iteration
	 */
	@Override
	abstract public boolean hasNext();

	/**
	 * @return position indices (nb this is reference not a copy so avoid changing and can be null)
	 */
	@Override
	abstract public int[] getPos();

	/**
	 * Reset iterator
	 */
	@Override
	abstract public void reset();

	/**
	 * @return shape of iterator (can be null, if not known or applicable)
	 */
	@Override
	public int[] getShape() {
		return null;
	}
}
