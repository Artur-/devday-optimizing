package org.vaadin.artur.samples.crud.manycomponentslighter;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;

public class PersonDetailsLighter extends CssLayout {
	public PersonDetailsLighter(String row1, String row2, String row3) {
		addComponent(new Label(row1));
		addComponent(new Label(row2));
		addComponent(new Label(row3));
		// setValue(row1 + "\n" + row2 + "\n" + row3);
	}
}
