/*-
 * Copyright 2015 Diamond Light Source Ltd.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.dataset;

import java.util.Iterator;

/**
 * Class used by DynamicDatasets to delegate 
 */
public class DataListenerDelegate {

	private EventListenerList eventListenerlist;

	public DataListenerDelegate() {
		eventListenerlist = new EventListenerList();
	}
	
	public void addDataListener(IDataListener l) {
		eventListenerlist.addListener(IDataListener.class, l);
	}

	public void removeDataListener(IDataListener l) {
		eventListenerlist.removeListener(IDataListener.class, l);
	}

	public void fire(DataEvent evt) {
		for (Iterator<IDataListener> iterator = eventListenerlist.getListeners(IDataListener.class); iterator.hasNext();) {
			IDataListener l = iterator.next();
			l.dataChangePerformed(evt);
		}
	}

}
