package org.vaadin.artur.client.samples;

import org.vaadin.artur.ActionButtonRenderer;

import com.vaadin.client.connectors.AbstractRendererConnector;
import com.vaadin.shared.ui.Connect;

@Connect(ActionButtonRenderer.class)
public class ActionButtonRendererConnector extends AbstractRendererConnector<String> {

	@Override
	public ClientActionButtonRenderer getRenderer() {
		return (ClientActionButtonRenderer) super.getRenderer();
	}
}
