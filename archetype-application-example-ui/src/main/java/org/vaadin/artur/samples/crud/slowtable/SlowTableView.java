package org.vaadin.artur.samples.crud.slowtable;

import java.util.Collection;

import org.vaadin.artur.samples.backend.DataService;
import org.vaadin.artur.samples.backend.data.Availability;
import org.vaadin.artur.samples.backend.data.Product;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.data.util.converter.StringToEnumConverter;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

public class SlowTableView extends VerticalLayout implements View {
	public static final String VIEW_NAME = "Table";

	Table table = new Table();
	BeanItemContainer<Product> container = new BeanItemContainer<>(Product.class);

	public SlowTableView() {
		setSizeFull();
		table.setSizeFull();
		table.setPageLength(60);
		table.setContainerDataSource(container);
		table.setVisibleColumns("id", "productName", "price", "availability", "stockCount", "category");
		table.setColumnExpandRatio("productName", 1);

		table.addGeneratedColumn("actions", new ColumnGenerator() {

			@Override
			public Object generateCell(Table source, Object itemId, Object columnId) {
				GridLayout gl = new GridLayout(10, 1);
				gl.setSpacing(true);
				gl.setHeight("15px");
				gl.setWidthUndefined();
				for (int i = 0; i < 10; i++) {
					Button b = new Button("Action " + i);
					b.setStyleName(ValoTheme.BUTTON_TINY);
					b.setHeight("14px");
					gl.addComponent(b);
				}
				return gl;
			}

		});
		table.addGeneratedColumn("availability", new ColumnGenerator() {

			@Override
			public Object generateCell(Table source, Object itemId, Object columnId) {
				Availability availability = (Availability) source.getContainerDataSource()
						.getContainerProperty(itemId, columnId).getValue();
				String text = StringToEnumConverter.enumToString(availability, getLocale());

				String color = "";
				if (availability == Availability.AVAILABLE) {
					color = "#2dd085";
				} else if (availability == Availability.COMING) {
					color = "#ffc66e";
				} else if (availability == Availability.DISCONTINUED) {
					color = "#f54993";
				}

				String iconCode = "<span class=\"v-icon\" style=\"font-family: " + FontAwesome.CIRCLE.getFontFamily()
						+ ";color:" + color + "\">&#x" + Integer.toHexString(FontAwesome.CIRCLE.getCodepoint())
						+ ";</span>";

				String html = iconCode + " " + text;
				Label label = new Label(html, ContentMode.HTML);
				label.setSizeUndefined();
				return label;
			}
		});
		addComponent(table);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		Collection<Product> allProducts = DataService.get().getAllProducts();
		container.removeAllItems();
		container.addAll(allProducts);

	}

}
