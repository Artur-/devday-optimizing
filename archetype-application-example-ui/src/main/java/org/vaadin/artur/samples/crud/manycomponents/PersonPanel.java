package org.vaadin.artur.samples.crud.manycomponents;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;

public class PersonPanel extends CustomComponent {

	private Panel panel;

	public PersonPanel(String name) {
		panel = new Panel();
		panel.setCaption(name);
		setCompositionRoot(panel);

		GridLayout gl = new GridLayout(2, 1);
		gl.setMargin(true);
		gl.setWidth("100%");
		panel.setContent(gl);

		PersonDetails contactDetails = new PersonDetails("Phone: 123 4567", "Fax: 123 4568",
				"Email: example@example.com");
		gl.addComponent(contactDetails);
		PersonDetails contactDetails2 = new PersonDetails("Random street 1", "012345", "City of Lorem Ipsum");
		gl.addComponent(contactDetails2);

	}

}
