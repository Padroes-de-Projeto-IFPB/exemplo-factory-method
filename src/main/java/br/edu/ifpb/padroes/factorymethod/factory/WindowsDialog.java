package br.edu.ifpb.padroes.factorymethod.factory;

import br.edu.ifpb.padroes.factorymethod.buttons.Button;
import br.edu.ifpb.padroes.factorymethod.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
