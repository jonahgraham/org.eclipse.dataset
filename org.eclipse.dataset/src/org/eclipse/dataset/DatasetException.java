/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.dataset;

public class DatasetException extends Exception {
	/**
	 * @see Exception#Exception()
	 */
	public DatasetException() {
		super();
	}

	/**
	 * @see Exception#Exception(String)
	 */
	public DatasetException(String message) {
		super(message);
	}

	/**
	 * @see Exception#Exception(String, Throwable)
	 */
	public DatasetException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @see Exception#Exception(Throwable)
	 */
	public DatasetException(Throwable cause) {
		super(cause);
	}
}
