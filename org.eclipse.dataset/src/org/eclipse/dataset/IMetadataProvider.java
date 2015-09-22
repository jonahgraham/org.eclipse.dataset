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

package org.eclipse.dataset;

import java.util.List;

import org.eclipse.dataset.metadata.IMetadata;
import org.eclipse.dataset.metadata.MetadataType;

/**
 * Interface which acts to provide metadata from an object
 */
public interface IMetadataProvider {

	/**
	 * @return an instance of IMetadata
	 * @throws MetadataException
	 */
	public IMetadata getMetadata() throws MetadataException;

	/**
	 * @param clazz if null return everything
	 * @return list of metadata with given class
	 * @throws MetadataException
	 */
	public <T extends MetadataType> List<T> getMetadata(Class<T> clazz) throws MetadataException;
}
