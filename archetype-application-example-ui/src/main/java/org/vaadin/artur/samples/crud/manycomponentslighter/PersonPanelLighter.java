package org.vaadin.artur.samples.crud.manycomponentslighter;

import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;

public class PersonPanelLighter extends Panel {

	public PersonPanelLighter(String name) {
		setCaption(name);

		CssLayout hl = new CssLayout();
		hl.addStyleName("margin");
		// hl.setMargin(true);
		hl.setWidth("100%");
		setContent(hl);

		PersonDetailsLighter contactDetails = new PersonDetailsLighter("Phone: 123 4567", "Fax: 123 4568",
				"Email: example@example.com");
		contactDetails.setWidth("50%");
		hl.addComponent(contactDetails);
		PersonDetailsLighter contactDetails2 = new PersonDetailsLighter("Random street 1", "012345",
				"City of Lorem Ipsum");
		hl.addComponent(contactDetails2);

	}

}
