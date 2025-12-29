package abstractFactory;

import abstractFactory.factory.GuiFactory;
import abstractFactory.factory.GuiLinuxFactory;
import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.CheckBox;
import abstractFactory.interfaces.Windows;

public class MyMain {


    public static void main(String[] args) {
        GuiFactory factory = new GuiLinuxFactory();
        Button b = factory.createButton("My button");
        CheckBox c = factory.createCheckBox("My CheckBox");
        Windows w = factory.creaWindows("Paul",100,200);
        System.out.println(b);
        System.out.println(c);
    }
}
