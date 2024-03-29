/*
 *	Copyright 2008 Isaac Truett.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.googlecode.simplegwt.initialization.client.event;

import com.google.gwt.event.shared.GwtEvent;
import com.googlecode.simplegwt.initialization.client.Initializable;

/**
 * Event that occurs when an {@link Initializable} is initialized.
 * 
 * @since 1.0
 */
public class InitializationEvent extends GwtEvent<InitializationEventHandler> {
	private static final Type<InitializationEventHandler> TYPE = new Type<InitializationEventHandler>();

	/**
	 * Gets the event type associated with initialization events.
	 * 
	 * @return the handler type
	 */
	public static Type<InitializationEventHandler> getType() {
		return TYPE;
	}

	/**
	 * @see com.google.gwt.event.shared.GwtEvent#dispatch(com.google.gwt.event.shared.EventHandler)
	 */
	@Override
	protected void dispatch(InitializationEventHandler handler) {
		handler.onInitialize(this);
	}

	/**
	 * @see com.google.gwt.event.shared.GwtEvent#getAssociatedType()
	 */
	@Override
	public Type<InitializationEventHandler> getAssociatedType() {
		return TYPE;
	}
}
