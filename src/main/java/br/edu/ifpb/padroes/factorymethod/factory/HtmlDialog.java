package br.edu.ifpb.padroes.factorymethod.factory;

import br.edu.ifpb.padroes.factorymethod.buttons.Button;
import br.edu.ifpb.padroes.factorymethod.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}