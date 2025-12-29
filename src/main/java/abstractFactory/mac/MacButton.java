package abstractFactory.mac;

import abstractFactory.interfaces.Button;

public class MacButton implements Button {

    private String text;
    public MacButton(String text) {
        this.text = text;
    }
    @Override
    public void onClick() {
        System.out.println("clique sur le button mac : " + this.text);
    }
}
