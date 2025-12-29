package abstractFactory.factory;

import abstractFactory.interfaces.Button;
import abstractFactory.interfaces.CheckBox;
import abstractFactory.interfaces.Windows;

public interface GuiFactory {
    public Windows creaWindows(String name, Integer height, Integer length);
    public Button createButton(String name);
    public CheckBox createCheckBox(String name);
}
