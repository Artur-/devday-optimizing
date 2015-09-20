package org.vaadin.artur.client.samples;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.renderers.WidgetRenderer;
import com.vaadin.client.ui.VButton;
import com.vaadin.client.widget.grid.RendererCellReference;

public class ClientActionButtonRenderer extends WidgetRenderer {

	@Override
	public Widget createWidget() {
		FlowPanel panel = new FlowPanel();
		panel.addStyleName("button-group");
		for (int i = 0; i < 10; i++) {
			VButton b = new VButton();
			b.setText("Action " + i);
			b.addStyleName("v-button-tiny");
			b.addStyleName("v-widget");
			b.setHeight("14px");
			b.getElement().getStyle().setMarginRight(18, Unit.PX);
			panel.add(b);
			// e.appendChild(b.getElement());
		}

		return panel;

	}

	@Override
	public void render(RendererCellReference cell, Object data, Widget widget) {
		// Nothing to do here as content is the same for all rows
	}

}
