/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.dataset.io;

import org.eclipse.dataset.DatasetException;
import org.eclipse.dataset.IDataset;
import org.eclipse.dataset.IMonitor;
import org.eclipse.dataset.SliceND;

/**
 * Used by lazy writeable datasets to write slices to a file
 */
public interface ILazySaver extends ILazyLoader {

	/**
	 * Initialize dataset in file
	 */
	public void initialize() throws DatasetException;

	/**
	 * 
	 * @return true if file is writeable
	 */
	public boolean isFileWriteable();

	/**
	 * @param mon
	 * @param data
	 * @param slice
	 * @throws DatasetException
	 */
	public void setSlice(IMonitor mon, IDataset data, SliceND slice) throws DatasetException;
}
