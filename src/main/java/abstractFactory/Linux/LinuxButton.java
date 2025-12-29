package abstractFactory.Linux;

import abstractFactory.interfaces.Button;

public class LinuxButton implements Button {

    private String text;
    public LinuxButton(String text) {
        this.text = text;
    }
    @Override
    public void onClick() {
        System.out.println("clique sur le button linux : " + this.text);
    }
}
