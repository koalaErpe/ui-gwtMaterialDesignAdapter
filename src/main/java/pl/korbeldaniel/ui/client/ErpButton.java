package pl.korbeldaniel.ui.client;

import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import pl.korbeldaniel.ui.client.IsButton;

public class ErpButton  implements IsButton {
	public MaterialButton button;
	public ErpButton(String text) {
		this.button = new MaterialButton(text);
	}
	@Override
	public Widget asWidget() {
		return button.asWidget();
	}
	
}
