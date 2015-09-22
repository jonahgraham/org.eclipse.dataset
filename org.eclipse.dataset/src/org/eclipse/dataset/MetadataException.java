/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.dataset;

public class MetadataException extends DatasetException {
	/**
	 * @see MetadataException#MetadataException()
	 */
	public MetadataException() {
		super();
	}

	/**
	 * @see MetadataException#MetadataException(String)
	 */
	public MetadataException(String message) {
		super(message);
	}

	/**
	 * @see MetadataException#MetadataException(String, Throwable)
	 */
	public MetadataException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @see MetadataException#MetadataException(Throwable)
	 */
	public MetadataException(Throwable cause) {
		super(cause);
	}
}
