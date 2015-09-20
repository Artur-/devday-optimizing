package org.vaadin.artur.samples.crud.fastgrid;

import org.vaadin.artur.samples.backend.DataService;
import org.vaadin.artur.samples.backend.mock.MockDataService;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.VerticalLayout;

public class FastGridView extends VerticalLayout implements View {
	public static final String VIEW_NAME = "Grid";

	public FastGridView() {
		FastComplexGrid grid = new FastComplexGrid();
		setSizeFull();
		grid.setSizeFull();
		grid.setProducts(MockDataService.get().getAllProducts());
		addComponent(grid);
	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

}
