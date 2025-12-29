package abstractFactory.factory;

import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.CheckBox;
import abstractFactory.interfaces.Windows;
import abstractFactory.mac.MacButton;
import abstractFactory.mac.MacCheckBox;
import abstractFactory.mac.MacWindows;

public class GuiMacFactory implements GuiFactory{
    @Override
    public Windows creaWindows(String name, Integer height, Integer length) {
        return new MacWindows(name,height,length);
    }

    @Override
    public Button createButton(String name) {
        return new MacButton(name);
    }

    @Override
    public CheckBox createCheckBox(String name) {
        return new MacCheckBox(name);
    }
}
