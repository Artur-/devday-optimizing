package org.vaadin.artur.samples.crud.manycomponents;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class ManyComponentsView extends Panel implements View {

	public static final String VIEW_NAME = "Many components";

	@Override
	public void enter(ViewChangeEvent event) {
		setSizeFull();
		VerticalLayout layout = new VerticalLayout();
		setContent(layout);
		for (int i = 0; i < 100; i++) {
			PersonPanel personPanel = new PersonPanel("John Doe");
			layout.addComponent(personPanel);
		}

	}

}
