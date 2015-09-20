package org.vaadin.artur.samples.crud.manycomponents;

import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class PersonDetails extends CustomComponent {
	public PersonDetails(String row1, String row2, String row3) {
		VerticalLayout contactDetails = new VerticalLayout();
		Label phoneLabel = new Label();
		phoneLabel.setValue(row1);
		contactDetails.addComponent(phoneLabel);
		Label faxLabel = new Label();
		faxLabel.setValue(row2);
		contactDetails.addComponent(faxLabel);
		Label emailLabel = new Label();
		emailLabel.setValue(row3);
		contactDetails.addComponent(emailLabel);

		setCompositionRoot(contactDetails);
	}
}
