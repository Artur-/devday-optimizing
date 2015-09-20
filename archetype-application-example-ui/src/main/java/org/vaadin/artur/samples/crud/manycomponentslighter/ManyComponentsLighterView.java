package org.vaadin.artur.samples.crud.manycomponentslighter;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Panel;

public class ManyComponentsLighterView extends Panel implements View {

	public static final String VIEW_NAME = "Lighter components";

	@Override
	public void enter(ViewChangeEvent event) {
		setSizeFull();
		CssLayout layout = new CssLayout();
		setContent(layout);
		for (int i = 0; i < 100; i++) {
			PersonPanelLighter personPanel = new PersonPanelLighter("John Doe");
			layout.addComponent(personPanel);
		}

	}
}
